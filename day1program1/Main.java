package day1program1;

import java.util.*;

public class Main {
	public static void main(String s[]) {
		String name;
		String city;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the venue name");
		name = sc.nextLine();
		System.out.println("enter th city name");
		city = sc.nextLine();
		Venue v = new Venue(name, city);
		System.out.println("Venue Details:");
		System.out.println("Venue name:" + v.name);
		System.out.println("City name:" + v.city);
	}

}
