/*Program:WAP to 5 functions of String in java
 * @Author:SANDHYA KOSHTA
 * @Date: 17/11/2022
 */
package com.question2;
//--------------------------Declaring a class-------------------
public class StringTest {
	//-------------------------Main method-----------------------------
	public static void main(String args[]) {
	//-------------------------declaring a variables----------------------
		String a1="Hello !";
		a1=a1.concat("What is your good name?");
		
		String s1="Hello";
		String s2="Sandhya";
		
		String b1=" ";
		String b2="Hello Jay ";
		
		String c1=" Ram ";
	//------------------------Printing a values for variables-------------------
	//---------------------------using the Concatenating string function ------------------------	
		System.out.println(a1);
		
    //----------------------------using String length function ------------------------
		System.out.println("--------------------------------------------------");
		System.out.println("string length is: "+s1.length());
		System.out.println("string length is: "+s2.length());
	
	//-----------------------Creating a format empty string function---------------------
		System.out.println("--------------------------------------------------");
		System.out.println(b1.isEmpty());      // true
		System.out.println(b2.isEmpty());      // false
		
	//------------------------Trim whitespaces in a string function------------------
		System.out.println("--------------------------------------------------");
		System.out.println(c1+"How are you doing today");        // without trim()
		System.out.println(c1.trim()+" How are you doing today"); // with trim()
		
	}//---------------------------end of main method--------------------------------

}
//----------------------------------end of class-------------------------------