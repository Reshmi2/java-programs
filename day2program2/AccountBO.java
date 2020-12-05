package day2program2;

public class AccountBO {
	public FixedAccount getAccountDetails(String detail) {
		String[] st = detail.split(",");
		FixedAccount fixedAc = new FixedAccount();
		fixedAc.setAccountNumber(st[0]);
		fixedAc.setBalance(Double.parseDouble(st[1]));
		fixedAc.setAccountHolderName(st[2]);
		fixedAc.setMinimumBalance(Double.parseDouble(st[3]));
		fixedAc.setLockingPeriod(Integer.parseInt(st[4]));
		return fixedAc;

	}

}
