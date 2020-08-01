package com.i91.beans.ManyToManyPkg;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MobileCompanyDetail")
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int mobileId;
	private String mobileCompanyName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ssssJoinTableForMobilePersonlolololo")
	private List<Person> person;

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

	public String getMobileCompanyName() {
		return mobileCompanyName;
	}

	public void setMobileCompanyName(String mobileCompanyName) {
		this.mobileCompanyName = mobileCompanyName;
	}
}
