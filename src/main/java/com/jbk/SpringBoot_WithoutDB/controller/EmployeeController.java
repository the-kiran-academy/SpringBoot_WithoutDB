package com.jbk.SpringBoot_WithoutDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.SpringBoot_WithoutDB.entity.Employee;
import com.jbk.SpringBoot_WithoutDB.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping(value = "/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee) {

		String msg = service.saveEmployee(employee);

		return msg;

	}

	@GetMapping(value = "/getAllEmployee")
	public List<Employee> getAllEmployee() {

		return service.getAllEmployee();

	}
	
	@GetMapping(value = "/getEmployee/{eid}")
	public Object getEmployee(@PathVariable int eid) {
	 Employee employee=	service.getEmployee(eid);
	 
	 if(employee!=null) {
		 return employee;
	 }
	 else {
		 return "Employee Not Found !!";
	 }
		
	}
	
	@GetMapping(value = "/getEmployeeByParam")
	public Object getEmployeeByParam(@RequestParam int eid) {
	 Employee employee=	service.getEmployee(eid);
	 
	 if(employee!=null) {
		 return employee;
	 }
	 else {
		 return "Employee Not Found !!";
	 }
		
	}

}
