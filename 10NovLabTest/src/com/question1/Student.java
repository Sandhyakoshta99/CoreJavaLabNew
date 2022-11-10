/*Question 1: Create a record of student using array 
 * @author :Sandhya Koshta
 * @date: 10/11/2022
 * @Subject :labTest  
 */

package com.question1;
            //-------------declaring a class------------------------
public class Student{  
//-----------------------declaring a local variable--------------
	int rollno;  
	String name;  
	int age;
	//-----------------declaring a constructor------------------
    public Student()
    {
    	 rollno = 0;
        name = "";
        age=0;
    }
  
//---------------------create a constructor-------------------
	  Student(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  
	  }  
	  //---------------end of constructor-------------------
	  
	  
	  public int getRollno()
	    {
	        return rollno;
	    }

	    public void setRollno(int rollno)
	    {
	        this.rollno = rollno;
	    }
	  public String getName()
	    {
	        return name;
	    }

	    public void setName(String name)
	    {
	        this.name = name;
	    }
	    
		  public int getAge()
		    {
		        return rollno;
		    }

		    public void setAge(int age)
		    {
		        this.age = age;
		    }
	}  
//----------------end of class--------------------

	