package com.question2;

public class HotelBooking {
	public static void main(String[] args) {
		//..............tight cuplling.............
		
		Hotel h=new Hotel(101,"big","noac",3000);
		Hotel h1=new Hotel(102,"small","noac",3000);
		Hotel h2=new Hotel(103,"2bad","noac",3000);
		Hotel h3=new Hotel(104,"normal","noac",3000);
     //.......... loose cuplling................  
	Hotel h4=new Hotel();
	h4.setRoomNo(105);
	h4.setRoomType("Normal");
	h4.setAcfacility("no");
	h4.setPrice(3000);
	//...................Printing the values.....................
	System.out.println(h);
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.print( "Hotel Room No Is: "+h2.getRoomNo());
		System.out.print("  Room Type is :"+h2.getRoomType());
	System.out.print("  you room price is :"+h2.getPrice());
	} //.................end of main method.......................
}//................end of class......................
