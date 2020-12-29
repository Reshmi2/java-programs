package org.hcl;

import java.util.List;

public class ShopppingCart {
	List<Products> products;
	public ShopppingCart() {
		// TODO Auto-generated constructor stub
	}
	public ShopppingCart(List<Products> products) {
		super();
		this.products = products;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	
}
