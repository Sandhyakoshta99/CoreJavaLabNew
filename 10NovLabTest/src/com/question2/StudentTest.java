
/*Question 2: Get student makes in array ,then print rank along with name 
 * @author: Sandhya Koshta
 * @Date: 10/11/2022
 * Test : LabTest
 */
package com.question2;
//-------------------Importing a util for scanner -----------------------
import java.util.Scanner;
//-------------------declaring a class-----------------------
public class StudentTest {
	//-----------------Declaring a Main method------------------------
	   public static void main(String[] args) {
		    // TODO code application logic here

             //-----------Scanner object------------------
		    try (Scanner sc = new Scanner(System.in)) {
		    //----------------student details in array---------------	
				double[] marks = new double[10];
				String[] names = new String[10];
				double max;                                                                                                                                                                                             
				int i;                                                                                                                                                                                                     
              //----------------for loop----------------
				for(i=0; i<3; i++) {  
				     System.out.println("Enter The Name Of Student: ");                                                                                                                                                                   
				    names[i] = (sc.nextLine()); 
				    System.out.println("Enter Marks: ");                                                                                                                                                                   
				    marks[i] = sc.nextDouble(); 
				    sc.nextLine();
				}                         
				int position = 0;
				max = marks[i]; 
				//----------------calculate the marks--------------------------
				for(i = 0; i < 3; i++) {                                                                                                                                                                                  
				    if(max < marks[i]) {                                                                                                                                                                                   
				        max = marks[i]; 
				        position = i;
				    }                                                                                                                                                                                                      
				}                    
				//------------------printing values-----------------------------
				System.out.println("Highest marks:"+ marks[position] + " student name " + names[position]);
				 sc.close();
			}
	   }
	   
}
