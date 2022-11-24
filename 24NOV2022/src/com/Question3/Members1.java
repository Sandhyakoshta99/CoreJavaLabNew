package com.Question3;

public class Members1 {
	public static void main(String arge[]) {
	Employee e = new Employee();
	e.name = "Sandhya Koshta ";
	e.age = 22;
	e.phone_number = "9873267865";
	e.address = "Jabalpur [M.P]";
	e.department = "Computer Operater";
	//printing details
	System.out.println("----------Employee Details---------");
	System.out.println("Name :"+e.name);
	System.out.println("Age :"+e.age);
	System.out.println("Contact :"+e.phone_number);
	System.out.println("Address :"+e.address);
	System.out.print("Salary :");
	e.print_salary(50000);
	System.out.println("Department :"+e.department);
	System.out.println("------------end of Employee---------------");
	
	Manager m = new Manager();
	m.name = "Saina ";
	m.age= 23;
	m.phone_number = "7832341293";
	m.address= "Bhopal [M.P]";
	m.department = "Civil";

	
	System.out.println("----------Manager Details---------");
	System.out.println("Name :"+m.name);
	System.out.println("Age :"+m.age);
	System.out.println("Contact :"+m.phone_number);
	System.out.println("Address :"+m.address);
	System.out.print("Salary :");
	m.print_salary(55000);
	System.out.println("Department :"+m.department);
	
	

}
}
