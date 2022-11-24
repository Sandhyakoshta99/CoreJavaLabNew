/*The management of LearnMore University is planning to automate the University management system . Therefore , Steve Wilkinson , the programmer , has decided to create a Java program that accepts the student details , such as the first name , last name , age , course enrolled , and student ID . In addition , he also needs to accept the employee details , such as first name , last name , age , salary , department name , designation , and employee ID . Steve must ensure the reusability of code . The program must offer a choice to accept either the student's or employee's details . Help Steve to develop the program .
 *@Auther: Sandhya Koshta 
 * @Date:24/11/2022
 */
package com.Question1;
import java.util.Scanner;
public class Student {

		Scanner sc=new Scanner (System.in);
		public void details(String first_name,String last_name,int age,String course,int enroll,int sid) {
	System.out.println("-----------------------------------------------");	
	System.out.println("Enter The First Name : ");
	first_name=sc.next();
	
	System.out.println("Enter The Last Name : " );
	last_name=sc.next();
	
	System.out.println("Enter The Student Age: ");
	age=sc.nextInt();
	
	System.out.println("Enter The Student Course : " );
	course=sc.next();
	
	System.out.println("Enter The Student Enrollment Number : ");
	enroll=sc.nextInt();
	
	System.out.println("Enter The Student Id :");
	sid=sc.nextInt();
	
	System.out.println("----------------------Student Details Are--------------------------");
	System.out.println(" Name :"+first_name );
	System.out.println(" Case :"+last_name );
	System.out.println("Age: "+age );
	System.out.println("Course :"+course );
	System.out.println("Enrollment No: "+enroll );
	System.out.println("Student Id :"+sid);
}
		
		
		public void details1( String fname,String lname,int eage,String department,int salary,int eid)
		{	
	System.out.println("-----------------------------------------------");
	System.out.println("Enter The Employee First Name :" );
	fname=sc.next();
	System.out.println("Enter The Employee Last Name :" );
	lname=sc.next();

	System.out.println("Enter The Employee Age:");
	eage=sc.nextInt();
	
	System.out.println("Enter The Employee Department Name:" );
	department=sc.next();
	
	System.out.println("Enter The Employee Enrollment Salary :");
	salary=sc.nextInt();
	
	System.out.println("Enter The  Employee Id :");
	eid=sc.nextInt();
	
	System.out.println("----------------------Employee Details Are--------------------------");
	System.out.println("Name : "+fname );
	System.out.println("Cast : "+lname);
	System.out.println("Age : "+eage);
	System.out.println("Department Name : "+department);
	System.out.println("Salary : "+salary);
	System.out.println("ID : "+eid);
	
	sc.close();
		}
	
	
  
}
