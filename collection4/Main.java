package collection4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		UserBO userBO = UserBO.getList();
		System.out.println("Enter the number of User details to be added");
		int noOfUser = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= noOfUser; i++) {
			System.out.println("Enter the user " + i + " details in csv format");
			String[] details = sc.nextLine().split(",");
			String name = details[0];
			String contactNumber = details[1];
			String userName = details[2];
			String email = details[3];
			User user = new User(name, contactNumber, userName, email);
			userBO.add(user);
		}
		display(userBO);
		System.out.println("Enter the range to be removed from array list");
		int lowerLimit = sc.nextInt();
		int upperLimit = sc.nextInt();
		userBO.removeUser(lowerLimit, upperLimit);
		display(userBO);
		sc.close();

	}

	private static void display(UserBO userBO) {
		System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "ContactNumber", "UserName", "Email");
		for (User u : userBO) {
			u.display();
		}
	}

}
