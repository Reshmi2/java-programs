package hcl;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		String name;
		String city;int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the venue name");
		name=sc.nextLine();
		System.out.println("Enter city name");
		city=sc.nextLine();
        Venue v=new Venue();
		System.out.println("Venue details");
		v.setName(name);
		System.out.println("venue is"+v.getName());
		v.setCity(city);
		System.out.println("city is"+v.getCity());
		System.out.println("verify and update venue details");
		System.out.println("1.update venue name \r\n"+"2.update city name \r \n"+"3.all informations correct/exit \r\n"+"type 1 or 2 or 3");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			String Rn;
			System.out.println("enter venue details");
			sc.nextLine();
			Rn=sc.nextLine();
			System.out.println("venue details");
			v.setName(Rn);
			System.out.println("venue is "+v.getName());
			System.out.println("city is "+v.getCity());
			break;
		case 2:
			String ci;
			System.out.println("Enter venue details");
			sc.nextLine();
			ci=sc.nextLine();
			System.out.println("venue details:");
			System.out.println("venue is "+v.getName());
			v.setCity(ci);
			System.out.println("city is "+v.getCity());
			break;
		case 3:
			System.out.println("venue details:");
			System.out.println("venue is "+v.getName());
			System.out.println("city  is "+v.getCity());
			break;
		}
		
	}

}
