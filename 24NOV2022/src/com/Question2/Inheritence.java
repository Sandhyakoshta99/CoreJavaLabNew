/*Program :Inheritence 
 * @Author:SANDHYA KOshta
 * @Date: 24/11/2022
 */

package com.Question2;
public class Inheritence {
	public void display()
	{
		System.out.println("---------------This is a our Parent Class--------------");
	}

}

class B extends Inheritence{

	public void display()
	{
		super.display();
		System.out.println("-----------This is a our Child Class---------------");
	}

}
