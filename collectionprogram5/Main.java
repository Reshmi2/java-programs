package collectionprogram5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		String username;
		char ch = 'y';
		for (int i = 1; ch == 'y'; i++) {
			System.out.println("Enter the username");
			username = sc.nextLine();
			set.add(username);
			System.out.println("Do you want to continue?(y/n)");
			ch = sc.next().charAt(0);
			sc.nextLine();
		}
		System.out.println("The unique number of usernames is " + set.size());
	}

}
