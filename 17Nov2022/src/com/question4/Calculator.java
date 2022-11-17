/*Program:.Create a calculator application in Java that will accept two numbers .
 *          Further , the calculator application should be able to perform the following operations 
 *          one at a time on the two numbers : Addition Subtraction Multiplication Division You need to implement exception handling that both the numbers should be greater than O. Further , the operator used to perform the calculations should only be + , - , * , or , / .
 * @Author:Sandhya Koshta 
 * @Date: 17/11/2022
 */
package com.question4;

import java.util.Scanner;
//----------------------------declaring a class---------------------
public class Calculator {
//------------------------declaring a main method----------------------------
	public static void main(String args[]) {
		{
	        //-------------- declaring a two numbers variables-------------------
	        double num1, num2;
	  
	        // -----------------------creating the Scanner obj---------------------------------------
	        Scanner sc = new Scanner(System.in);
	  
	        //-------------------------------Take input from the user--------------------------------
	        System.out.println("_______________________Enter the numbers__________________");
	  
	        //-------------------------- take the inputs-------------------------------
	        num1 = sc.nextDouble();
	  
	        num2 = sc.nextDouble();
	  
	        System.out.println("__________Enter the operator (+,-,*,/)______________");
	  
	        char op = sc.next().charAt(0);
	  
	        double o = 0;
	        //-----------------------Starting a switch case-----------------------
	        switch (op) {
	  
	        //----------------------case to add two numbers------------------
	        case '+':  System.out.println("-------------Add two Numbers-----------------");
	  
	            o = num1 + num2;
	  
	            break;
	  
	        //-----------------------case to subtract two numbers------------------------
	        case '-':  System.out.println("-------------Subtract Two Numbers-----------------");
	  
	            o = num1 - num2;
	  
	            break;
	  
	        //-----------------case to multiply two numbers------------------------
	        case '*':System.out.println("------------- Multiply Two Numbers-----------------");
	  
	            o = num1 * num2;
	  
	            break;
	  
	        //------------------- case to divide two numbers----------------
	        case '/':System.out.println("-------------Divide Two Numbers-----------------");
	  
	            o = num1 / num2;
	  
	            break;
	  
	        default:
	  
	            System.out.println("-----------You enter wrong input-------------------");
	  
	            break;
	        }//-----------------------end of switch case--------------------
	  
	        System.out.println("_______________________________________________________");
	  
	        // print the final result
	        System.out.println(num1 + " " + op + " " + num2 + " = " + o);
	        
	        System.out.println("____This id the final result____");
	   sc.close();
		}
	}
}

