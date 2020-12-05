package day2program2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountBO accBO = new AccountBO();
		System.out.println("Enter account details :");
		String acDetails = sc.nextLine();
		FixedAccount fixedAC = accBO.getAccountDetails(acDetails);
		// System.out.println("Account Number\tBalance\tAccount Holder Name"
		// + "Minimum Balance\tLocking Period");
		System.out.format("%-20s %-10s %-20s %-20s %s\n", "Account Number", "Balance", "Account holder name",
				"Minimum balance", "Locking period");
		System.out.format("%-20s %-10s %-20s %-20s %s", fixedAC.getAccountNumber(), fixedAC.getBalance(),
				fixedAC.getAccountHolderName(), fixedAC.getMinimumBalance(), fixedAC.getLockingPeriod());
	}

}
