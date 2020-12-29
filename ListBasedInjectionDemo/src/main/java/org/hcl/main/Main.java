package org.hcl.main;

import org.hcl.Cashier;
import org.hcl.ShopppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myBeans.xml");
		ShopppingCart cart = (ShopppingCart) context.getBean("shoppingCart");
		Cashier cashier = (Cashier) context.getBean("cashier");
		cashier.calculateTotalPrice(cart);
		


	}

}
