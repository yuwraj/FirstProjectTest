package com.i91.beans;
// Generated Jul 25, 2020 8:55:09 PM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Products generated by hbm2java
 */
@Entity
@Table(name = "products", catalog = "hibernetTestDbSchema")
public class Products implements java.io.Serializable {

	private Integer productId;
	private String productName;
	private Integer categoryId;

	public Products() {
	}

	public Products(String productName) {
		this.productName = productName;
	}

	public Products(String productName, Integer categoryId) {
		this.productName = productName;
		this.categoryId = categoryId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "productId", unique = true, nullable = false)
	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Column(name = "productName", nullable = false, length = 100)
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "categoryId")
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

}
