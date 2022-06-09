package com.jbk.SpringBoot_WithoutDB.dao;

import java.util.List;

import com.jbk.SpringBoot_WithoutDB.entity.Employee;

public interface EmployeeDao {
	public String saveEmployee(Employee employee);

	public List<Employee> getAllEmployee();
	public Employee getEmployee(int eid);


}
