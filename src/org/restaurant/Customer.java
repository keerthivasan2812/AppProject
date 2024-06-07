package org.restaurant;

public class Customer extends Waiter{
	
	
	public static void main(String[] args) {
		
		Customer c=new Customer();
		
		int chickenbiriyani = c.chickenbiriyani(3);
		int muttonbiriyani = c.muttonbiriyani(3);
		int idly = c.idly(2);
		int idiyappam = c.idiyappam(4);
		int dosa = c.dosa(3);
		int parotta = c.parotta(8);
		System.out.println("the listed items of food");
		
		System.out.println("number of chickenbiriyani "+chickenbiriyani);
		System.out.println("number of muttonbiriyani "+muttonbiriyani);
		System.out.println("number of idly "+idly);
		System.out.println("number of idiyappam "+idiyappam);
		System.out.println("number of dosa "+dosa);
		System.out.println("number of parotta "+parotta);
		
	}

}
