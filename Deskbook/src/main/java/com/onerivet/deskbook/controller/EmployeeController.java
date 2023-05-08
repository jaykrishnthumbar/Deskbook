package com.onerivet.DeskBook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onerivet.DeskBook.model.dtos.EmployeeDto;
import com.onerivet.DeskBook.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
//	@PostMapping("/save")
//	public String save(@RequestBody Employee employee) {
//		return employeeService.save(employee);
//		
//	}

	@GetMapping("/get-all")
	public List<EmployeeDto> getAll() {
		return employeeService.getAll();
		
	}
	
	@GetMapping("/{id}")
	public EmployeeDto getById(@PathVariable int id) {
		return employeeService.getById(id);
		
	}
	
	@PutMapping("/update/{id}")
	public String updateById (@PathVariable int id, @Valid @RequestBody EmployeeDto employeedto) {
		return employeeService.updateById(id, employeedto);
		
	}
}
