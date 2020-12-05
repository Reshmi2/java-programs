package exampleWicket;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Long over;
		Long ball;
		String str1;
		String wicketType,playerName,bowlerName;
		Wicket w=new Wicket();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of wickets");
		int n=sc.nextInt();
		sc.nextLine();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
	      System.out.println("enter the details of wicket"+(i+1));
	      str1=sc.nextLine();
	      str[i]=str1;
		}
		for(String a:str)
		{
			String[] arr=a.split(",");
			w.setOver(Long.valueOf(arr[0]));
			w.setBall(Long.valueOf(arr[1]));
			w.setWicketType(arr[2]);
			w.setPlayerName(arr[3]);
			w.setBowlerName(arr[4]);
			System.out.println("Over:"+w.getOver());
			System.out.println("Ball:"+w.getBall());
			System.out.println("WicketType:"+w.getWicketType());
			System.out.println("PlayerName:"+w.getPlayerName());
			System.out.println("BowlerName:"+w.getBowlerName());
			}
	}
}