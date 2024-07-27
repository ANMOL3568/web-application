/**
 * 
 */
package com.ykinfo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Anmol kumar
 *
 */
@Entity
@Table(name = "products")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long prodId;
	@Column(name = "name")
	private String productName;
	@Column(name = "description")
	private String description;
	@Column(name = "price")
	private float price;
	@Column(name = "quantity")
	private int quantity;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getProdId() {
		return prodId;
	}

	public void setProdId(long  prodId) {
		this.prodId = prodId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}
