package collectionnn;

public class Address implements Comparable<Address> {
	private String username;
	private String addressLine1;
	private String addressLine2;
	private Integer pinCode;

	public Address(String username, String addressLine1, String addressLine2, Integer pinCode) {
		super();
		this.username = username;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pinCode = pinCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public int compareTo(Address address) {
		// TODO Auto-generated method stub
		if (this.getPinCode().equals(address.getPinCode())) {
			return this.getAddressLine1().compareTo(address.getAddressLine1());
		} else
			return this.getPinCode().compareTo(address.getPinCode());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getUsername() + "," + this.getAddressLine1() + "," + this.getAddressLine2() + ","
				+ this.getPinCode();
	}

}
