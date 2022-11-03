/*Program:WAP to print the following: Diamond pattern".
 * @Auther: Sandhya Koshta
 * @date: 03/11/2022
 */

package com.question1;
//............declaring a util package for scanner class............
public class DiamondPattern {

int row;
//.......polymorphism with number of arguments &type...........
  void calculateRow(int number,int i,int j ,int space)
  {
	  row =number-space;

	  space = number - 1;
	  
	//...............using for condition............
      for (j = 1; j <= number; j++) 
      {
          for (i = 1; i <= space; i++) 
          {
              System.out.print(" ");
          }
          space--;
          for (i = 1; i <= 2 * j - 1; i++) 
          {
              System.out.print("#");                
          }
          System.out.println("");
      }
      space = 1;
      for (j = 1; j <= number - 1; j++) 
      {
          for (i = 1; i <= space; i++) 
          {
              System.out.print(" ");
          }  space++;
          for (i = 1; i <= 2 * (number - j) - 1; i++) 
          {
              System.out.print("#");
          }
          System.out.println("");
  } //.............end of for...........
  } //.................end of void method................
}//.......................end of class......................

