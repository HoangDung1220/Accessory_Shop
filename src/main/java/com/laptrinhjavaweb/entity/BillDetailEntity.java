package com.laptrinhjavaweb.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="billdetail")
public class BillDetailEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id",referencedColumnName = "id")
	private ProductEntity productBill;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bill_id")
    private BillEntity bill;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="price")
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public ProductEntity getProductBill() {
		return productBill;
	}

	public void setProductBill(ProductEntity productBill) {
		this.productBill = productBill;
	}

	public BillEntity getBill() {
		return bill;
	}

	public void setBill(BillEntity bill) {
		this.bill = bill;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
