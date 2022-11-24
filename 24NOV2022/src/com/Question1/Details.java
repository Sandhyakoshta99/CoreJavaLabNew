package com.Question1;

import java.util.Scanner;
public class Details {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to  University Management System");
		System.out.println("1.Student Details");
		System.out.println("2.Employee Details");
		
		int ch;
		System.out.println("-----------------Enter your Choice--------------------");
		ch = sc.nextInt();
		Student ob = new Student();
		switch(ch)
		{
		case 1: ob.details(null, null, ch, null, ch, ch);
		break;
		case 2:ob.details1(null, null, ch, null, ch, ch);
		break;
		default:System.out.println("_______________Wrong input____________");
		}
		sc.close();
		
	}
}
