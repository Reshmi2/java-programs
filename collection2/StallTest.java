package collection2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StallTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Stall> stallList = new ArrayList<>();
		System.out.println("Enter the number of stall details");
		int noOfStalls = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < noOfStalls; i++) {
			System.out.println("Enter the stall " + (i + 1) + " details");
			String details[] = sc.nextLine().split(",");
			stallList.add(new Stall(details[0], details[1], details[2], details[3]));
		}
		Iterator<Stall> itr = stallList.iterator();
		while (itr.hasNext()) {
			if (itr.next().getName().startsWith("test")) {
				itr.remove();
			}
		}
		System.out.printf("%-15s %-20s %-15s %s\n", "Name", "Detail", "Type", "OwnerName");
		for (Stall s : stallList)
			System.out.println(s);
		sc.close();

	}

}
