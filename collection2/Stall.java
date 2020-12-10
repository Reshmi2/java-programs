package collection2;

public class Stall {
	String name;
	String details;
	String type;
	String ownername;

	public Stall() {

	}

	public Stall(String name, String details, String type, String ownername) {
		super();
		this.name = name;
		this.details = details;
		this.type = type;
		this.ownername = ownername;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	@Override
	public String toString() {

		return String.format("%s\t%s\t%s\t%s", name, details, type, ownername);
	}

}
