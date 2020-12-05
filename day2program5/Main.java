package day2program5;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type of Event \n1. Exhibition \n2. Stage Event");
		byte choice = sc.nextByte();
		sc.nextLine();
		if (choice == 1) {
			System.out.println("Enter Exhibition Details");
			String[] st = sc.nextLine().split(",");
			Event exhibitionEvent = new Exhibition(st[0], st[1], st[2], Integer.parseInt(st[3]));
			exhibitionEvent.displayEventDetails();
		} else if (choice == 2) {
			System.out.println("Enter Stage Event Details");
			String[] st = sc.nextLine().split(",");
			Event stageEvent = new StageEvent(st[0], st[1], st[2], Integer.parseInt(st[3]), Integer.parseInt(st[4]));
			stageEvent.displayEventDetails();
		} else {
			System.out.println("Invalid Choice");
		}

	}

}
