package programTwoDay3;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Choose Stall Type : ");
		System.out.println("1) Gold Stall\n2) Premium Stall\n3) Executive Stall");
		byte choice = in.nextByte();
		in.nextLine();
		if (choice == 1) {
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets");
			String[] StallDetails = in.nextLine().split(",");
			Stall goldStall = new GoldStall(StallDetails[0], Integer.parseInt(StallDetails[1]), StallDetails[2],
					Integer.parseInt(StallDetails[3]));
			goldStall.display();
		} else if (choice == 2) {
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
			String[] StallDetails = in.nextLine().split(",");
			Stall premiumStall = new PremiumStall(StallDetails[0], Integer.parseInt(StallDetails[1]), StallDetails[2],
					Integer.parseInt(StallDetails[3]));
			premiumStall.display();
		} else if (choice == 3) {
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
			String[] StallDetails = in.nextLine().split(",");
			Stall executiveStall = new ExecutiveStall(StallDetails[0], Integer.parseInt(StallDetails[1]),
					StallDetails[2], Integer.parseInt(StallDetails[3]));
			executiveStall.display();
		}
	}



}
