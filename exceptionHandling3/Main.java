package exceptionHandling3;
import java.util.*;
public class Main {
	public static void main(String s[])
	{
		int num;
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer input: ");
		num=sc.nextInt();
		Integer i=Integer.valueOf(num);
		System.out.println("entered value is"+i);
		}catch(InputMismatchException ie)
		{
			ie.printStackTrace();
		}
		
	}

}
