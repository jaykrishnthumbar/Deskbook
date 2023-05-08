package com.onerivet.DeskBook.service;

import java.util.List;

import com.onerivet.DeskBook.model.dtos.EmployeeDto;
import com.onerivet.DeskBook.model.entity.Employee;

public interface EmployeeService {
	
//	public String save(Employee employee);
	
	public List<EmployeeDto> getAll();
	
	public EmployeeDto getById(int id);
	
	public String updateById(int id, EmployeeDto employeedto);
	
	

}
