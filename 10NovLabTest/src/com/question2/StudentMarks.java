/*Question 2: Get student makes in array ,then print rank along with name 
 * @author: Sandhya Koshta
 * @Date: 10/11/2022
 * Test : LabTest
 */
package com.question2;    
//------------------creating a class----------------------
public class StudentMarks  {                                                                                                                                                                                         

//---------------------declaring a variable----------------
	    private double mark;
	    private String name;
        
	    
	//-----------------declaring a constructor------------------
	    public StudentMarks()
	    {
	        mark = 0;
	        name = "";
	    }
	  
	    public StudentMarks(int mark, String name)
	    {
	        this.mark = mark;
	        this.name = name;
	    }
       //---------------------declaring a getter setter method --------------------
	    public double getMark()
	    {
	        return mark;
	    }
	    public String getName()
	    {
	        return name;
	    }

	    public void setName(String name)
	    {
	        this.name = name;
	    }

	    public void setMark(double mark)
	    {
	        this.mark = mark;
	    }

	}
//-------------------End of class--------------------------