package collection3;

public class Hall implements Comparable<Hall> {
	private String name;
	private String contactNumber;
	private Double costPerDay;
	private String ownerNmae;

	public Hall() {
	}

	public Hall(String name, String contactNumber, Double costPerDay, String ownerNmae) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerNmae = ownerNmae;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public String getOwnerNmae() {
		return ownerNmae;
	}

	public void setOwnerNmae(String ownerNmae) {
		this.ownerNmae = ownerNmae;
	}

	@Override
	public int compareTo(Hall o) {
		return this.getCostPerDay().compareTo(o.getCostPerDay());
	}

	@Override
	public String toString() {
		
		return String.format("%-15s%-15s%-15s%-15s", this.getName(), this.getContactNumber(), this.getCostPerDay(),
				this.getOwnerNmae());
	}

}
