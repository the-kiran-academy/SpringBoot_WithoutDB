package com.jbk.SpringBoot_WithoutDB.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jbk.SpringBoot_WithoutDB.entity.Employee;

@Repository
public class EmployeeDao_impl implements EmployeeDao {

	List<Employee> list = new ArrayList<>();

	@Override
	public String saveEmployee(Employee employee) {
		list.add(employee);
		return "Saved ! !!";
	}

	@Override
	public List<Employee> getAllEmployee() {

		return list;
	}

	@Override
	public Employee getEmployee(int eid) {
		Employee employee = null;
		for (Employee emp : list) {

			if (eid == emp.getEid()) {
				employee = emp;
				break;
			}
		}

		return employee;
	}

}
