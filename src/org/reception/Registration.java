package org.reception;

public class Registration {
	
	
	private int number;
	private String name;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		
		if(number>0) {
		this.number = number;
		}else {
			this.number=-1;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
