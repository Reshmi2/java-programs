package hcl1;

import java.util.Scanner;

public class Test {
   public static void main(String[] args) {
    	   String details;
    	   ExtraType e=new ExtraType();
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("enter extratype details:");
    	   details=sc.nextLine();
    	   System.out.println("extratype details:");
           String []arrOfStr=details.split("#");
           e.setName(arrOfStr[0]);
           System.out.println("extratype:"+e.getName());
           long r=Long.parseLong(arrOfStr[1]);
           e.setRuns(r);
           System.out.println("runs:"+e.getRuns());
       }
}
       

