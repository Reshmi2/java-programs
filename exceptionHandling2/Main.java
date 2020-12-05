package exceptionHandling2;

import java.util.*;

public class Main {
        public static void main(String s[]) {
		String name;
	    String deposit;
		String costPerDay;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the item type details:");
			System.out.println("enter the name:");
			name = sc.nextLine();
			sc.nextLine();
			System.out.println("enter the deposit:");
			deposit = sc.nextLine();
			Double deposit1 = Double.valueOf(deposit);
			System.out.println("enter the cost per day:");
			costPerDay = sc.nextLine();
			Double costPerDay1 = Double.valueOf(costPerDay);
			System.out.println("The details of the item type are:");
			itemType i=new itemType(name,deposit1,costPerDay1);
			System.out.println(i);
		} catch (NumberFormatException ne) {
			ne.printStackTrace();
		}
	}

}
