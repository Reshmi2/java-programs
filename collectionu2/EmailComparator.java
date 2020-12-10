package collectionu2;

import java.util.Comparator;

public class EmailComparator implements Comparator<User3> {

	@Override
	public int compare(User3 o1, User3 o2) {
		// TODO Auto-generated method stub
		return o1.getEmail().compareTo(o2.getEmail());
	}

}
