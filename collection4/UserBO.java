package collection4;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class UserBO extends ArrayList<User> {
	public void removeUser(int n1, int n2) {
		this.removeRange(n1 - 1, n2);
	}

	public static UserBO getList() {

		return new UserBO();

	}

}

