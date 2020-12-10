package collectiontic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ticketBookingTe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<ticketBooking> tickets = new ArrayList<>();
		System.out.println("Enter the number of customers");
		int noOfCustomers = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the booking price accordingly with customer name in CSV(Customer Name,Price)");
		for (int i = 0; i < noOfCustomers; i++) {
			String ticketDetails[] = sc.nextLine().split(",");
			tickets.add(new ticketBooking(ticketDetails[0], Integer.parseInt(ticketDetails[1])));
		}
		ticketBooking maxTicket = Collections.max(tickets, new ticketBooking());
		ticketBooking minTicket = Collections.min(tickets, new ticketBooking());
		System.out.println(minTicket.getCustomerName() + " spends minimum amount of Rs." + minTicket.getPrice());
		System.out.println(maxTicket.getCustomerName() + " maximum amount of Rs." + maxTicket.getPrice());
		sc.close();
	}

}
