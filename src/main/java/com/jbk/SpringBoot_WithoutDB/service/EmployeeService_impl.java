package com.jbk.SpringBoot_WithoutDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.SpringBoot_WithoutDB.dao.EmployeeDao;
import com.jbk.SpringBoot_WithoutDB.entity.Employee;

@Service
public class EmployeeService_impl implements EmployeeService {
	
	@Autowired
	private EmployeeDao dao;

	@Override
	public String saveEmployee(Employee employee) {
		
	String msg=	dao.saveEmployee(employee);
		
		return msg;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list=dao.getAllEmployee();
		return list;
	}

	@Override
	public Employee getEmployee(int eid) {
		
		return dao.getEmployee(eid);
	}

}
