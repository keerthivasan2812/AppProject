package org.reception;

import java.util.Scanner;

public class ReceptionRegistration extends Registration {
	
	
	public static void main(String[] args) {
		
		System.out.println("enter your name");
		
		Scanner s=new Scanner(System.in);
		
		String h=s.nextLine();
		System.out.println("enter the number");
		int n = s.nextInt();
		
		
		ReceptionRegistration r=new ReceptionRegistration();
		
		r.setName(h);
		r.setNumber(n);
		
		
		String name = r.getName();
		int number = r.getNumber();
		
		System.out.println("the registered person name is "+name);
		
		if(number==-1) {
			
			System.out.println("the number should be greater than 0");
			
		}
		else {
		System.out.println("the registered number is "+number);
		
		}
		
		
		
	}

}
