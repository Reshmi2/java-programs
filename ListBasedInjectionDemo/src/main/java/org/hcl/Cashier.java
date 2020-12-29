package org.hcl;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class Cashier {
	private double totalPrice=0;
	private String filePath, fileName;
	private PrintWriter pw;

	public Cashier(String filePath, String fileName) {
		this.fileName = fileName;
		this.filePath = filePath;
		openStream();
	}

	private void openStream() {
		try {
			pw = new PrintWriter(filePath + fileName + ".txt");
		} catch (FileNotFoundException fe) {
			System.out.println("Exception occured while creating an obj for PrintWriter ::" + fe.getMessage());
		}

	}

	public void calculateTotalPrice(ShopppingCart cart) {
		List<Products> products = cart.getProducts();
		System.out.println(products.getClass());
		for (Products product : products) {
			writeProductsToFile(product);
			totalPrice = totalPrice + product.getPrice();
		}
		pw.println("-----------");
		pw.println("TotalPrice = " + totalPrice);
		pw.flush();
	}

	private void writeProductsToFile(Products products) {
		pw.println("The product name is " + products.getProductName() + "whose id is " + products.getProductId()
				+ " and the products is " + products.getProductDescription() + " the price of the product is "
				+ products.getPrice());

	}

}
