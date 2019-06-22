package com.cg.eis.service;

import java.util.Map;

import com.cg.eis.bean.*;

public interface EmployeeService {
	
	public boolean addEmployee(Employee e);
	public Map <Integer,Employee> getAllEmployee();
    public String getScheme(int e_id, double salary, String e_designation); 
	public default void printEmployeedetails(Employee e)
	{
		System.out.println("=====================================");
		System.out.println("Details for Employee ID. :-"+e.getE_id());
		System.out.println("Employee Name :- "+e.getE_name());
		System.out.println("Employee Salary :- "+e.getE_salary());
		System.out.println("Employee Designation :- "+e.getE_designation());
		System.out.println("Insurance Scheme :- "+e.getE_insurance_scheme());
		System.out.println("=====================================");
	      
		
	}
	
	

}
