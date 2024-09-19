package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;
import java.util.List;


public interface EmpRepo extends JpaRepository<Employee, Integer>{

	List<Employee> findByEmpName(String empName);
	
}
