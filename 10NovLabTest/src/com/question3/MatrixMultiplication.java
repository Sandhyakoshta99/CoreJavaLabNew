/*Question 3: Do Matrix Multiplication program 
 * @author: Sandhya Koshta
 * @Date: 10/11/2022
 * Test : LabTest
 */

package com.question3;

public class MatrixMultiplication {
		public static void main(String args[]){  
			//---------------creating two matrices----------------------   
			int a[][]={{1,5,3},{4,5,6},{7,1,19}};    
			int b[][]={{9,2,3},{4,77,6},{17,8,9}};    
	    
			//------------------creating another matrix to store the multiplication of two matrices------------   
			int c[][]=new int[3][3];  //3 rows and 3 columns  
	    
			//---------------multiplying and printing multiplication of 2 matrices-------------   
			for(int i=0;i<3;i++){    
				for(int j=0;j<3;j++){    
					c[i][j]=0;      
					for(int k=0;k<3;k++)      
					{      
						c[i][j]+=a[i][k]*b[k][j];      
					}//-----------------end of k loop --------------
				System.out.print(c[i][j]+" ");  //printing matrix element  
				}//end of j loop  
			System.out.println();//new line    
			}   
			//---------------------end of i loop-----------------------
		}
		//----------------------------end of main method----------------------------
	}
//----------------------end of  class------------------------------