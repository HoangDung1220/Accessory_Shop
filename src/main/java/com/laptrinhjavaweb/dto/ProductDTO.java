package com.laptrinhjavaweb.dto;

import java.util.Date;

public class ProductDTO extends AbstractDTO<ProductDTO>
{

	private int id;
	private int category_id;
	private String size;
	private String name;
	private double price;
	private int sale;
	private String title;
	private boolean highLight;
	private boolean newProduct;
	private String detail;
	private int idColor;
	private String nameColor;
	private String codeColor;
	private String img;
	private Date createdAt;
	private Date updatedAt;
	
	public ProductDTO() {
		super();
	}

	public ProductDTO(int id, int category_id, String size, String name, double price, int sale, String title,
			boolean hightLight, boolean newProduct, String detail, int idColor, String nameColor, String codeColor,
			String img, Date createdAt, Date updatedAt, int category) {
		super();
		this.id = id;
		this.size = size;
		this.name = name;
		this.price = price;
		this.sale = sale;
		this.title = title;
		this.highLight = hightLight;
		this.newProduct = newProduct;
		this.detail = detail;
		this.idColor = idColor;
		this.nameColor = nameColor;
		this.codeColor = codeColor;
		this.img = img;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.setCategory_id(category);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isHightLight() {
		return highLight;
	}

	public void setHighLight(boolean hightLight) {
		this.highLight = hightLight;
	}

	public boolean isNewProduct() {
		return newProduct;
	}

	public void setNewProduct(boolean newProduct) {
		this.newProduct = newProduct;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getIdColor() {
		return idColor;
	}

	public void setIdColor(int i) {
		this.idColor = i;
	}

	public String getNameColor() {
		return nameColor;
	}

	public void setNameColor(String nameColor) {
		this.nameColor = nameColor;
	}

	public String getCodeColor() {
		return codeColor;
	}

	public void setCodeColor(String codeColor) {
		this.codeColor = codeColor;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	
	
	
}
