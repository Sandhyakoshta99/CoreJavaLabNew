package com.question3;
//...................declaring a class....................
public class PiggieBank {
	//..............instance variables.....................
	
	private int amount=50;
	//................constructor.............
	public PiggieBank(int a) {
		amount=a+amount;
		System.out.println("......Your Piggie Bank Saving Is..........");
		
	}
	//............void method.................
	public void displayAmount()

	{
  //.......................print amount................
	System.out.println("Enter your money to add piggie bank :"+amount);
	}
	
}//................end of class
