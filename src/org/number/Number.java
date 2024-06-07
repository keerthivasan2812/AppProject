package org.number;

import java.util.Random;

public class Number {
	
	
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int number(int n) {
		
		Random r=new Random();
		int ni = r.nextInt(n)+1;
		
		return ni;
		
	}

}
