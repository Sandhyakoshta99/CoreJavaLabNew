/*Program:hangmangames program 
 * @Author:Sandhya Koshta 
 * @Date: 17/11/2022
 */
package com.question1;
//------------------------------importing util package for scanner class---------------------
import java.util.Scanner;
//--------------------------declaring a class-------------------------
public class HangmanGames {
		//-------------------------main method----------------------
		public static void main(String args[])
		{
			//----------------creating scanner obj---------------------
			Scanner sc = new Scanner(System.in);
			//-------------------declaring a array------------------
			String arr[] = new String[]{"Ram","Sandhya", "Shikha", "Snajay", "Seema"};
			//------------------------printing values------------------------
			System.out.println("-------------Welcome To Hangman Game------------");
			System.out.println("Select an array Index to choose words : ");
			System.out.println("Array Index should not be greater than 5");
			//--------------------declaring a variable---------------------------
			int n = sc.nextInt();
			int len = arr[n].length();
			System.out.println("Input your guessing: ");
			//------------------------creating a for loop--------------------------
			for(int i=0; i<len; i++)
			{
				System.out.print("_ ");
			}
			System.out.println();
			
			String a = sc.next().toUpperCase();
			//------------------declaring a if else counditon---------------
			if(a == arr[n])
			{
				System.out.println("Guess was correct");
			}
			else
			{
				System.out.println("  ");
			}
			sc.close();//-----------------close of scanner class---------------------
			
		}//-----------------------end of main method---------------------------

	}
//-------------------------end of class------------------------------

