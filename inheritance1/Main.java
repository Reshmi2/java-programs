package inheritance1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		  
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Choose Account Type");
	    System.out.println("1. Saving Account\n" + "2. Current Account");
	    byte choice = sc.nextByte();
	    sc.nextLine();
	    if (choice == 1) {
	      System.out.println("Enter Account details in comma separated(Account Name,Account Number,"
	          + "Bank Name,Organisation Name)");
	      String[] st = sc.nextLine().split(",");
	      Account savacc = new SavingsAccount(st[0], st[1], st[2], st[3]);
	      savacc.display();      
	    } else {
	      System.out.println("Enter Account details in comma "
	          + "separated(Account Name,Account Number,Bank Name,TIN Number)");
	      String[] st = sc.nextLine().split(",");
	      Account currentacc = new CurrentAccount(st[0], st[1], st[2], st[3]);
	      currentacc.display();
	    }
	  }

}
