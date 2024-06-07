package org.roll;


public class Dice extends Roll {
	
	public static void main(String[] args) {
		
		
		
		Dice d =new Dice();
		
		int j=7;
		while(1<j) {
		int roll = d.roll();
		
		System.out.println(roll);
		
		j--;
	   
	}}

}
