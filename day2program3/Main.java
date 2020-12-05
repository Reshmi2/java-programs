package day2program3;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Stall stall = new Stall();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the stall :");
		stall.setName(sc.nextLine());
		System.out.println("Enter the detail of the stall :");
		stall.setDetail(sc.nextLine());
		System.out.println("Enter the owner name of the stall :");
		stall.setOwnerName(sc.nextLine());

		String stallType;
		System.out.println("Enter the type of the stall :");
		stallType = sc.nextLine();
		int stallSqFeet;
		System.out.println("Enter the size of the stall in square feet :");
		stallSqFeet = sc.nextInt();
		sc.nextLine();
		System.out.println("Does the hall have TV? (y/n)");
		String ch = sc.nextLine();
		if (ch.equalsIgnoreCase("y")) {
			System.out.println("Enter the number of TV :");
			int numOfTV = sc.nextInt();
			System.out.println("The cost of the stall is " + stall.computeCost(stallType, stallSqFeet, numOfTV));
		} else {
			System.out.println("The cost of the stall is " + stall.computeCost(stallType, stallSqFeet));
		}
	}

}
