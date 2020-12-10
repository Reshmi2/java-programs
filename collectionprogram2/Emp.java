package collectionprogram2;

public class Emp {
	String name;
	Double deposit;
	Double costPerDay;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, Double deposit, Double costPerday) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public Double getCostPerday() {
		return costPerDay;
	}
	public void setCostPerday(Double costPerday) {
		this.costPerDay = costPerday;
	}
	@Override
	public String toString() {
		return String.format("%s\t%f\t%f",name,deposit,costPerDay);
	}
	

}
