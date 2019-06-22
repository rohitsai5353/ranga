package com.cg.eis.dao;
import java.util.HashMap;
import java.util.Map;

import org.omg.Messaging.SyncScopeHelper;

import com.cg.eis.bean.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
static Map<Integer,Employee> emmap = new HashMap<Integer,Employee>();
	

	@Override
	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		emmap.put(e.getE_id(), e);
		return true;
	}

	@Override
	public Map<Integer, Employee> getAllEmployee() {
		
		return emmap;
	}

	@Override
	public String getScheme(int e_id, double salary, String e_designation) {
		
		if(((salary>=5000)&&(salary<20000))&&(e_designation.equalsIgnoreCase("System Associate")))
				{
			     return "Scheme C";
				}
		else if(((salary>=20000)&&(salary<40000))&&(e_designation.equalsIgnoreCase("Programmer")))
		{
	     return "Scheme B";
		}
		
		else if((salary>=40000)&&(e_designation.equalsIgnoreCase("Manager")))
		{
	     return "Scheme A";
		}
		
		else if((salary<5000)&&(e_designation.equalsIgnoreCase("Clerk")))
		{
	     return "No Scheme";
		}
		
		else 
		{
	     return "Invalid Details";
		}
		
	}

	

}
