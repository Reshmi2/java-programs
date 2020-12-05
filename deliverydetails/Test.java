package deliverydetails;
import java.util.Scanner;

public class Test {
     public static void main(String[] args) {
    	 Delivery d=new Delivery();
    	 Scanner sc=new Scanner(System.in);
    	 String batsman;
    	 String bowler;
    	 String nonStriker;
    	 Long over;
    	 Long ball;
    	 Long runs;
    	 System.out.println("enter over:");
    	 over=sc.nextLong();
    	 System.out.println("enter ball:");
    	 ball=sc.nextLong();
    	 System.out.println("enter runs:");
    	 runs=sc.nextLong();
    	 sc.nextLine();
    	 System.out.println("enter batsman:");
    	 batsman=sc.nextLine();
    	 System.out.println("enter bowler:");
    	 bowler=sc.nextLine();
    	 System.out.println("enter nonStriker:");
    	 nonStriker=sc.nextLine();
    	 d.setOver(over);
    	 d.setBall(ball);
    	 d.setRuns(runs);
    	 d.setBatsman(batsman);
    	 d.setBowler(bowler);
    	 d.setNonStriker(nonStriker);
    	 System.out.println("over:"+d.getOver());
    	 System.out.println("ball:"+d.getBall());
    	 System.out.println("runs:"+d.getRuns());
    	 System.out.println("batsman:"+d.getBatsman());
    	 System.out.println("bowler:"+d.getBowler());
    	 System.out.println("nonStriker:"+d.getNonStriker());



    	 




     }
}
