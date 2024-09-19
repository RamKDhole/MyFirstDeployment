package com.example.demo.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmpSer;


@RestController
@RequestMapping("/Employee")
public class EmpCtrl {

	@Autowired
	private EmpSer ser;
	
	@PostMapping("/addEmp")
	public Employee add(@RequestBody Employee emp) {
		System.out.println(emp);
		return ser.addEmp(emp);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmp(){
		return ser.getAll();
	}
	
	@GetMapping("/getByName/{name}")
	public List<Employee> getByName(@PathVariable String name) {
		System.out.println(name);
		return ser.getByName(name);
	}
	
	@GetMapping("/getById/{empId}")
	public Employee getByName(@PathVariable int empId) {
		return ser.getById(empId);
	}
	
}
