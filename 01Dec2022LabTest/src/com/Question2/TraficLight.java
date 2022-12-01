/*
The application must fulfill the following requirements:
Initially, when the application is executed, only the RED light must be ON.
After 3 seconds, the RED light should turn off and only the GREEN light should turn ON for 5 seconds.
Then, the GREEN light should turn off and only the YELLOW light should turn ON for 2 seconds.
Then, the YELLOW light should turn to RED.
The preceding process should continue, infinitely.
You also need to display the remaining time for each light.

 *@AUTHOR : SANDHYA KOSHTA
 *@DATE : 01 December 2022
 */

package com.Question2;
public class TraficLight extends Thread{
	public static void main(String[] args) {
				// TODO Auto-generated method stub
				Thread A = new Thread();
				Thread B = new Thread();
				Thread C = new Thread();
				System.out.println("                       ");
				System.out.println("           *******************WELCOME TO TROFICSIGNALS*********************     ");
				System.out.println("                       ");
				System.out.println("-----------------------------------------------------");
				System.out.println("                 RED LIGHT IS ON                     ");
				System.out.println("-----------------------------------------------------");
				A.start();
				try {
					Thread.sleep(3000);
					System.out.println("RED LIGHT IS OFF");
					System.out.println("-----------------------------------------------------");
					System.out.println("                 GREEN LIGHT IS ON                   ");
					System.out.println("-----------------------------------------------------");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				B.start();
				try {
					Thread.sleep(8000);
					System.out.println("                 YELLOW LIGHT IS ON                  ");
					System.out.println("-----------------------------------------------------");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				C.start();
				try {
					Thread.sleep(10000);
				
					System.out.println("                   RED LIGHT IS ON                   ");
					System.out.println("-----------------------------------------------------");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
	}

}
