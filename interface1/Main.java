package interface1;

import java.util.*;

public class Main {
	public static void main(String s[]) {
		int ch;
		Scanner sc = new Scanner(System.in);
		Fort f = null;
		System.out.println(
				"what you want to visit\r\n" + "\r\n" + "Rajmachi\r\n" + "\r\n" + "Shivgadh\r\n" + "\r\n" + "Murud");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			f = new Rajmachi();
			f.distance();
			break;
		case 2:
			f = new Shivgadh();
			f.distance();
			break;
		case 3:
			f = new Murud();
			f.distance();
			break;
		}
	}

}
