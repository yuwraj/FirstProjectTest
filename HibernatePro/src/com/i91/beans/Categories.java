package com.i91.beans;
// Generated Jul 25, 2020 8:55:09 PM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Categories generated by hbm2java
 */
@Entity
@Table(name = "categories", catalog = "hibernetTestDbSchema")
public class Categories implements java.io.Serializable {

	private Integer categoryId;
	private String categoryName;

	public Categories() {
	}

	public Categories(String categoryName) {
		this.categoryName = categoryName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "categoryId", unique = true, nullable = false)
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "categoryName", nullable = false, length = 100)
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
