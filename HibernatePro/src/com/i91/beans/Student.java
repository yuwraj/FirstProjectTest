package com.i91.beans;
// Generated Jul 25, 2020 8:55:09 PM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Student generated by hbm2java
 */
@Entity
@Table(name = "Student", catalog = "hibernetTestDbSchema")
public class Student implements java.io.Serializable {

	private int sid;
	private int pincode;
	private String sname;
	private int state;
	private int ver;

	public Student() {
	}

	public Student(int sid, int pincode, int state, int ver) {
		this.sid = sid;
		this.pincode = pincode;
		this.state = state;
		this.ver = ver;
	}

	public Student(int sid, int pincode, String sname, int state, int ver) {
		this.sid = sid;
		this.pincode = pincode;
		this.sname = sname;
		this.state = state;
		this.ver = ver;
	}

	@Id

	@Column(name = "sid", unique = true, nullable = false)
	public int getSid() {
		return this.sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	@Column(name = "pincode", nullable = false)
	public int getPincode() {
		return this.pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Column(name = "Sname", length = 45)
	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Column(name = "state", nullable = false)
	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Column(name = "ver", nullable = false)
	public int getVer() {
		return this.ver;
	}

	public void setVer(int ver) {
		this.ver = ver;
	}

}
