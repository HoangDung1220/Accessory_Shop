package com.laptrinhjavaweb.dto;

public class CartDTO {
	
	private ProductDTO product;
	private int quantity;
	private double total;
	
	public CartDTO() {
		super();
	}

	public CartDTO(ProductDTO product, int quantity, double total) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.total = total;
	}

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
	
	

}
