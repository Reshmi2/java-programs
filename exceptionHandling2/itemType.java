package exceptionHandling2;

public class itemType {
	String name;
	double deposit;
	double costPerDay;
	public itemType() {
		// TODO Auto-generated constructor stub
	}
	public itemType(String name, double deposit, double costPerDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public String toString()
	{
		return String.format("name:"+name+"\r\n"+"deposit:"+deposit+"\r\n"+"costPerDay:"+costPerDay);
		}
	
	
	

}
