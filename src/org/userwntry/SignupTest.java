package org.userwntry;

import java.util.Scanner;

public class SignupTest extends SignUp  {
	
	
	public static void main(String[] args) {
		
		System.out.println("enter your name");
		
		Scanner s=new Scanner(System.in);
		
		String name = s.nextLine();
		CheckName(name);
		
		System.out.println("enter your number");
		
		String number = s.next();
		CheckNumber(number);
		
		
		System.out.println("enter your password");
		
		String password = s.next();
		String pass = Checkpassword(password);
		
		
System.out.println("enter your password again");
		
		String Confirmpassword = s.next();
		Checkconfirmpassword(Confirmpassword,pass);
	}
	

}
