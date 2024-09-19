package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmpSer {

	public Employee addEmp(Employee emp);
	
	public List<Employee> getAll();
	
	public Employee getById(int empId);
	
	public List<Employee> getByName(String name);
	
}
