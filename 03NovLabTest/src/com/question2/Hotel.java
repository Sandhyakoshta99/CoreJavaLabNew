/*Program:  WAP to create a hotel having rooms .It should have following 
             -> datatype: room no, room type, acfacility, room price
            -> default constructor
             -> parameterized constructor where room type: standard, room price : 3000
              -> Parameterized constructor with all field
            -> pay the price method will be overloaded. one method will be without discount with discount"
 *@author= Sandhya koshta
 *@date=03/11/2022
 */

  package com.question2;
//...................declaring a class....................
public class Hotel {
	//..............instance variables.....................
	private int roomNo;
	String roomType;
	private String acfacility;
	private int price;
//.....................Default constructor.............
	public Hotel() {
		super(); //..............calling the object of class..........
		this.roomNo=0;
		this.roomType="Normal";
	    this.acfacility="Yes/No";
	    this.price= 3000;
	}//..............end of constructor.........................
	
	
	//................Parameterized constructor ..................
	public Hotel(int roomNo,String roomType,String acfacility) {
		this();
		System.out.println("This room price is 3000:");
		this.roomNo=roomNo;
		this.roomType=roomType;
	    this.acfacility= acfacility;
	}//..............end of constructor.........................
	
	//.............Parameterized constructor with all field................
	public Hotel(int roomNo,String roomType,String acfacility, int price) {
		this();
		System.out.println("This room price is under your standard:");
		this.roomNo=roomNo;
		this.roomType=roomType;
	    this.acfacility= acfacility;
	    this.price= price;
	}//..............end of constructor.........................

	//...............copy constructor...........................
	public Hotel(Hotel h) {		
		this.roomNo =h. roomNo;
		this.roomType =h. roomType;
		this.acfacility = h.acfacility;
		this.price = h.price;
	}//...............end of copy constructor.........................

	//......................creating getter setter method for the types variables
	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getAcfacility() {
		return acfacility;
	}

	public void setAcfacility(String acfacility) {
		this.acfacility = acfacility;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	//......................ending of  getter setter method for the types variables

	//.........................override implement method...........................
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	//...................end of override....................	
}//..............end of class...........
