package org.userwntry;

public class SignupCheck {
	
	
	public static void CheckName(String name) {
		
		if(name.length()>=5 &&!name.equals(null)) {
			
		}else {
			System.out.println("the number of "
					+ "character should"
					+ " be atleast five");
			
			
		}
		
		
		
	}
	
public static void CheckNumber(String number) {
	
	String number1 = String.valueOf(number);
	if(number1.length()==10 &&!number1.equals(null)) {
		
	}else {
		System.out.println("the number should be 10 digits");
		
		
	}
	
		
	}

public static String Checkpassword( String pass) {
	
	if(pass.length()>=6&&!pass.equals(pass)) {
		
	}else {
		
		System.out.println("the password should be six character");
		
	}
	
	return pass;
}


public static void Checkconfirmpassword(String confirmpass,String pass) {
	
	if(confirmpass.equals(pass)) {
		
		
	}else {
		System.out.println("the password dosent matches");
	}
	
	
	
}



}
