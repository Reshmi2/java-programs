package org.hcl.model;

public class Product {
	private int productId, price;
	private String productName, imageUrl, description;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, String imageUrl, String description, int price) {
		super();
		this.productId = productId;
		this.price = price;
		this.productName = productName;
		this.imageUrl = imageUrl;
		this.description = description;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
