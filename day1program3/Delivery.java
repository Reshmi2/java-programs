package day1program3;

public class Delivery {

	Long over;
	Long ball;
	Long runs;
	String batsman;
	String bowler;
	String nonStriker;

	Delivery(Long over, Long ball, Long runs, String batsman, String bowler, String nonStriker) {
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}

	void displayDeliveryDetails() {
		System.out.println("Delivery Details:");
		System.out.println("Over:" + over);
		System.out.println("Ball:" + ball);
		System.out.println("Runs:" + runs);
		System.out.println("Batsman:" + batsman);
		System.out.println("Bowler:" + bowler);
		System.out.println("NonStriker:" + nonStriker);

	}
}
