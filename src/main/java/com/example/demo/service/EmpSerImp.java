package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmpRepo;

@Service
public class EmpSerImp implements EmpSer {

	@Autowired
	private EmpRepo empRepo;
	
	@Override
	public List<Employee> getAll() {
		return empRepo.findAll();
	}

	@Override
	public Employee getById(int empId) {
			
		return empRepo.findById(empId).get();
	}

	@Override
	public List<Employee> getByName(String empName) {
		return empRepo.findByEmpName(empName);
	}

	@Override
	public Employee addEmp(Employee emp) {
		return empRepo.save(emp);
	} 
	
}
