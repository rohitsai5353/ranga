package com.cg.eis.dao;
import com.cg.eis.bean.*;
import java.util.Map;

public interface EmployeeDAO {
	
	
	public boolean addEmployee(Employee e);
	
	public Map <Integer,Employee> getAllEmployee();
	
    public String getScheme(int e_id, double salary, String e_designation); 
    
    


}
