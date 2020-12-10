package collectionprogram2;

import java.util.*;

public class EmpDetails {

	public static void main(String[] args) {
		String name;
		double deposit;
		double costperday;
		char id;int i=0;
		List <Emp> emp =new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("enter the the details"+(i+1)+"items");
			System.out.println("enter name");
			name=sc.nextLine();
			System.out.println("enter deposit");
			deposit=sc.nextDouble();
			System.out.println("enter cost per day");
			costperday=sc.nextDouble();
			System.out.println("enter the choice(y/n)");
			id=sc.next().charAt(0);
			sc.nextLine();
			emp.add(new Emp(name,deposit,costperday));
			i++;
		}while(id=='y');
		System.out.println("name\t"+"deposit\t"+"costperday");
          for(Emp e:emp)
          {
        	  System.out.println(e);
          }
	}
}
