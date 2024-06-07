package org.number;

import java.util.Scanner;

public class NumberTest extends Number {
	
	
	public static void main(String[] args) {
		
		
		NumberTest nt=new NumberTest();
		
		int number2 = nt.number(6);
		
		for(int i=0;i<5;i++) {
			Scanner s1=new Scanner(System.in);
			System.out.println("enter a number");
			int ni = s1.nextInt();
		
		if(ni==number2) {
			
			System.out.println("you have won the game");
			break;
			
		}else {
			System.out.println("sorry try again");
		}
		}
	}
	

}
