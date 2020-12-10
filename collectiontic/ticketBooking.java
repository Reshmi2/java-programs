package collectiontic;

import java.util.Comparator;

public class ticketBooking implements Comparator<ticketBooking> {
	private String customerName;
	private Integer price;

	public ticketBooking() {

	}

	public ticketBooking(String customerName, Integer price) {
		super();
		this.customerName = customerName;
		this.price = price;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public int compare(ticketBooking o1, ticketBooking o2) {
		return o1.getPrice().compareTo(o2.getPrice());

	}

}
