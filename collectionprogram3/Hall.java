package collectionprogram3;

import java.util.ArrayList;
import java.util.Scanner;

public class Hall {
	public static void main(String[] args) {
		String hallName;
		System.out.println("Enter the number of halls:");
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int numOfHalls = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= numOfHalls; i++) {
			System.out.println("Enter the Hall Name " + i);
			hallName = sc.nextLine();
			list.add(hallName);
		}
		System.out.println("Enter the hall name to be searched:");
		String search = sc.nextLine();
		if (list.contains(search))
			System.out.println(search + " hall is found in the list at position" + list.indexOf(search));
		else
			System.out.println(search + " hall is not found");
	}

}
