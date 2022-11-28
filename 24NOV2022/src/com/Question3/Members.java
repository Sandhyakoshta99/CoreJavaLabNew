/*@Author :Sandhya Koshta
 * @Date: 24/11/2022
 */
package com.Question3;
public class Members {
	public String name;
	public int age;
	public String phone_number;
	public String address;
	public int salary;
	
	void print_salary(int salary)
	{
		System.out.println(salary);
	}

}

class Employee extends Members{
	public String Specialization;
	public String department;
	
}

class Manager extends Members{
	public String Specialization;
	public String department;

}
