package collectionprogram6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		String username;
		String ch = "yes";
		for (int i=1; ch.equals("yes"); i++) {
			System.out.println("Enter the username");
			username = sc.nextLine();
			set.add(username);
			System.out.println("Do you want to continue?(yes/no)");
			ch = sc.nextLine();
		}
		System.out.println("The unique number of usernames is "+set.size());
	}

}

