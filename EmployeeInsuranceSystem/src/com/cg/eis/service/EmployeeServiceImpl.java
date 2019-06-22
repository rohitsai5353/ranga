package com.cg.eis.service;

import java.util.Map;


import com.cg.eis.bean.Employee;
import com.cg.eis.dao.*;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return dao.addEmployee(e);
	}

	@Override
	public Map<Integer, Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

	@Override
	public String getScheme(int e_id, double salary, String e_designation) {
		// TODO Auto-generated method stub
		return dao.getScheme(e_id, salary, e_designation);
	}
}
