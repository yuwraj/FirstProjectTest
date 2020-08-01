package com.i91.beans.manyToOnePkg;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ManyToOneEmployee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String empName;
	@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="addrId")
	@JoinTable(name="addressJoinTable")
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
