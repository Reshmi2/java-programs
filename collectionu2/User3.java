package collectionu2;

public class User3 implements Comparable<User3> {
	private String name;
	private String email;
	private String username;
	private String password;

	public User3() {
	}

	public User3(String name, String email, String username, String password) {
		super();
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int compareTo(User3 o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-15s %-15s %-15s %s", this.getName(), this.getEmail(), this.getUsername(),
				this.getPassword());
	}

}
