package com.question4;
//------------------creating a class------------------
public class CarModel {

	//Annum
	enum car{i20(2010), polo(2016), salavia(2022); 
		int i;
		car(int i)
		{
			this.i= i;
		}
		};
	
	//-------------------main method-------------------
		public static void main(String[] args)
	{
		for(car c:car.values())
		{
			System.out.println(c+"-"+c.i);
		}
	}
		//-----------end of main method ------------------------
}
//-----------------------------------end of class carmodel----------------------