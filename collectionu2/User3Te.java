package collectionu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class User3Te {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of user details");
		int noOfUsers = sc.nextInt();
		sc.nextLine();
		List<User3> users = new ArrayList<>(noOfUsers);
		readData(sc, noOfUsers, users);

		System.out.println("Search by\n1. Name\n2. Email");
		int ch = sc.nextInt();
		sc.nextLine();
		if (ch == 1)
			searchByName(sc, users);
		else if (ch == 2)
			searchByEmail(sc, users);
		else
			System.out.println("Invaild Choice");
		sc.close();

	}

	private static void searchByEmail(Scanner in, List<User3> users) {
		System.out.println("Enter Email");
		User3 searchObj = new User3();
		searchObj.setEmail(in.nextLine());
		int index = Collections.binarySearch(users, searchObj, new EmailComparator());
		if (index >= 0) {
			System.out.printf("%-15s %-15s %-15s %s\n", "Name", "Email", "Username", "Password");
			System.out.println(users.get(index));
		} else
			System.out.println("Search Email not found");
	}

	private static void searchByName(Scanner in, List<User3> users) {
		System.out.println("Enter the name");
		String name = in.nextLine();
		User3 searchObj = new User3();
		searchObj.setName(name);
		// Collections.sort(users);
		int index = Collections.binarySearch(users, searchObj);
		if (index >= 0) {
			System.out.printf("%-15s %-15s %-15s %s\n", "Name", "Email", "Username", "Password");
			System.out.println(users.get(index));
		} else
			System.out.println("Search name not found");
	}

	private static void readData(Scanner in, int noOfUsers, List<User3> users) {
		for (byte i = 1; i <= noOfUsers; i++) {
			System.out.println("Enter the user" + i + " details");
			String s[] = in.nextLine().split(",");
			users.add(new User3(s[0], s[1], s[2], s[3]));
		}
	}

}
