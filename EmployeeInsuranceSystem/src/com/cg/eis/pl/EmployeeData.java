package com.cg.eis.pl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


import com.cg.eis.bean.*;
import com.cg.eis.service.*;

public class EmployeeData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int e_id=0;
		String e_name="";
		 double e_salary=0L;
		 String e_designation="";
	    String e_insurance_scheme="";
	    String input="";
	    
	    EmployeeServiceImpl em = new EmployeeServiceImpl();
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String choice="";
		while(true)
		{
	    
		System.out.println("MENU");
		System.out.println("=================================");
		System.out.println("1 Employee details");
		System.out.println("2 Find Scheme");
		System.out.println("3 Show Employee data");
		System.out.println("4 Exit");
		System.out.println("=================================");
		System.out.println("Enter your choice");
		choice=br.readLine();
		switch(choice)
		{
		case "1":///to accept employee details from user...........
				  
				  
				  //Accepting and validating Employee details
				  System.out.println("Enter Employee ID");
				  while(true)
				  {
					  input=br.readLine();
					 
					  boolean ch1=Validator.validatedata(input, Validator.e_idpattern);
					  if(ch1==true)
					  {
						  try {
							  e_id=Integer.parseInt(input);
							  break;
						  }
						  catch(NumberFormatException e)
					  
					  {
						 System.out.println("Employee ID must be Numeric. Re Enter"); 
					  }
				  }
					  else
					  {
						  System.out.println("Re Enter Employee ID in 3 digits");
					  }
				  
				  }//end of while
				  
				  
				  
				  //accepting and validating Employee Name
				  System.out.println("Enter Employee Name");
				 while(true)
				  {
					  input=br.readLine();
					  boolean ch1=Validator.validatedata(input, Validator.e_namepattern);
					  if(ch1==true)
					  {
						  e_name=input;
						  break;
						  
						  
				       }
					  else
						  System.out.println("Re Enter Employee Name"); 
					  
				  
				  }
				 
				 
				 ///Accepting salary................
				 System.out.println("Enter Employee Salary");
				 while(true)
				  {
					 input=br.readLine();
					  boolean ch1=Validator.validatedata(input, Validator.e_salary);
					  if(ch1==true)
					  {
						  try {
							  e_salary= Double.parseDouble(input);
							  break;
						  }
						  catch(NumberFormatException e)
					  
					  {
						 System.out.println("Salary must be Numeric. Re Enter"); 
					  }
				  }
					  else
					  {
						  System.out.println("Re Enter Salary");
					  }
				  
				  }
				 ///Accepting designation............
				 System.out.println("Enter Employee Designation");
				 while(true)
				  {
					 input=br.readLine();
					 //checking for scheme...........
					 if(input.equalsIgnoreCase("System Associate")||input.equalsIgnoreCase("Programmer")||(input.equalsIgnoreCase("Manager")||input.equalsIgnoreCase("Clerk")))
					  {
						  
						  e_designation=input;
						  break;
						  
				       }
					  else
					  {
						  System.out.println("Re Enter Employee Designation"); 
						  System.out.println("Hint:- System Associate OR Manager Or Programmer OR Clerk");
					  }
				  }
				  
				 
				 e_insurance_scheme= em.getScheme(e_id, e_salary, e_designation);  ///checking for scheme.........
				  
				
				 
				  Employee e= new Employee( e_id, e_name,  e_salary,  e_designation, e_insurance_scheme);
				 
			      em.addEmployee(e);
			     
			      System.out.println("Employee Added");
				
				  
				  break;
		case"2":///to find scheme on bases of salary and designation..........
			 System.out.println("Enter Employee Salary");
			 while(true)
			  {
				 input=br.readLine();
				  boolean ch1=Validator.validatedata(input, Validator.e_salary);
				  if(ch1==true)
				  {
					  try {
						  e_salary= Double.parseDouble(input);
						  break;
					  }
					  catch(NumberFormatException c)
				  
				  {
					 System.out.println("Salary must be Numeric. Re Enter"); 
				  }
			  }
				  else
				  {
					  System.out.println("Re Enter Salary");
				  }
			  
			  }
			 
			 System.out.println("Enter Employee Designation");
			 while(true)
			  {
				 input=br.readLine();
				 //checking for scheme...............
				 if(input.equalsIgnoreCase("System Associate")||input.equalsIgnoreCase("Programmer")||(input.equalsIgnoreCase("Manager")||input.equalsIgnoreCase("Clerk")))
				  {
					  
					  e_designation=input;
					  break;
					  
			       }
				  else
				  {
					  System.out.println("Re Enter Employee Designation");  
				  }
			  }
			  
			 
			 e_insurance_scheme= em.getScheme(e_id, e_salary, e_designation);
			  
			  System.out.println("Insurance Scheme :- "+e_insurance_scheme);
			 
			
			
			break;
		case"3":///to display all employee details.......
			
			 Map <Integer,Employee> accmap=em.getAllEmployee();
    	     Collection<Employee> vc = accmap.values();
    	     List<Employee> acclist=new ArrayList<Employee>(vc);
    	     Collections.sort(acclist);
    	     for(Employee o : acclist)
    	     {
    	    	 
    	    	 em.printEmployeedetails(o);
    	    	 
    	     }
			break;
	   
		case "4":
			     System.out.println("Exiting Program"); ///for exit the program........
			     System.exit(0);
			     break;
	    default:
	    	    System.out.println("Invalid choice");
		
		
		
		
		
		}
		
		
		
		
		}
	}

}
