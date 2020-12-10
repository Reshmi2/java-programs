package collection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Hall> halls = new ArrayList<>();
		System.out.println("Enter the number of halls :");
		int noOfHalls = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= noOfHalls; i++) {
			System.out.println("Enter the details of hall " + i);
			String details[] = sc.nextLine().split(",");
			halls.add(new Hall(details[0], details[1], Double.parseDouble(details[2]), details[3]));
		}
		Collections.sort(halls);
		System.out.println("Sorted Order (from the least expensive to the most):");
		System.out.printf("%-15s%-15s%-15s%-15s\n", "Name", "Contact Number", "Cost Per Day", "Owner Name");
		for (Hall h : halls) {
			System.out.println(h);
		}
		sc.close();
	}

}
