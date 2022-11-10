/*Question 1: Create a record of student using array 
 * @author :Sandhya Koshta
 * @date: 10/11/2022
 * @Subject :labTest  
 */

package com.question1; 
           //-------------------------importing util package of scanner ---------------------
import java.util.*;
          //-----------------declaring a class---------------------------
public class StudentDetails {
       	 //-----------------main method-----------------
   public static void main(String args[]){  
          //---------------Creating user-defined class objects------------ 
  Student s1=new Student(101,"Sandhya",22);  
  Student s2=new Student(102,"Ravi",21);  
  Student s3=new Student(103,"RAM",25);  
           //-----------------------creating earliest------------------  
  ArrayList<Student> al=new ArrayList<Student>();  
           //-------------adding Student class object ------------------------
  al.add(s1); 
  al.add(s2);  
  al.add(s3);  
            //------------------------Getting Iterator-----------------------  
  Iterator<Student> itr=al.iterator();  
             //---------------------traversing elements of ArrayList object----------------------  
  while(itr.hasNext())
  {  
    Student st=(Student)itr.next();  
    System.out.println(st.rollno+" "+st.name+" "+st.age);  
  }  
 
 }  
   //---------------end of main method-------------------------
}  
//--------------end of class-----------------------