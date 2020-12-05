package exceptionHandling1;

import java.util.*;

public class Main {
	public static void main(String s[]) {
		
		int cost,ans=0;
		int n;
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the cost of items for'n' days");
		cost = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the value of n");
		n = sc.nextInt();
		ans=cost/n;
		System.out.println("cost per day of the item is:" + ans);
		}catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}

	}

}
