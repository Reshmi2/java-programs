package collectionu;

import java.util.Comparator;

public class NameComparator implements Comparator<User1> {

	@Override
	public int compare(User1 o1, User1 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}