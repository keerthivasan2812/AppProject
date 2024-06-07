package org.roll;

import java.util.Random;

public class Roll {
	
	
	public int roll() {
		
		Random i=new Random();
		int n = i.nextInt(6)+1;
		
		return n;
		
	}

}
