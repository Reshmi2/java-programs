package day1program2;

import java.util.*;

public class Main1 {
	public static void main(String s[]) {
		String name;
		String country;
		String skill;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name");
		name = sc.nextLine();
		System.out.println("Enter the country name");
		country = sc.nextLine();
		System.out.println("Enter the skill");
		skill = sc.nextLine();
		Player p = new Player(name, country, skill);
		System.out.println("Player Details:");
		System.out.println("Player name :" + p.name);
		System.out.println("Country name:" + p.country);
		System.out.println("skill:" + p.skill);
	}

}
