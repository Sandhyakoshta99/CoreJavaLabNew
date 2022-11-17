package com.question3;

import java.util.Scanner;

public class Test {
		//method to create menu
	
				static void menu()
				{
					System.out.println("                        Enter your choice :                      ");
					System.out.println("----------------------------------------------------------------------------- ");
					System.out.println("              1   . Play");
					System.out.println("              2   . Exit");
					System.out.println("              3   . Score");
					System.out.println("              4   . cherup ");
					System.out.println("----------------------------------------------------------------------------- ");
					
				}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		try {
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		System.out.println(ch);
		sc.close();
		
	}
	
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	}

}
