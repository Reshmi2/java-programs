package program5day3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your car number");
		int carNum = sc.nextInt();
		System.out.println("How many years old car do you have");
		int years = sc.nextInt();
		sc.nextLine();
		System.out.println("Car Brand");
		String brand = sc.next();
		Car car = new Service(carNum, brand, years);
		car.sum();
		car.brand();
		car.years();
		sc.close();
	}
}
