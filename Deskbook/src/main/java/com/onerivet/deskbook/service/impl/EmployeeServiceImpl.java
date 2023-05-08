package com.onerivet.DeskBook.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onerivet.DeskBook.exception.ResourceNotFound;
import com.onerivet.DeskBook.model.dtos.EmployeeDto;
import com.onerivet.DeskBook.model.entity.Employee;
import com.onerivet.DeskBook.repository.EmployeeRepo;
import com.onerivet.DeskBook.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private ModelMapper modelMapper;

	private EmployeeDto employeeToEmployeeDto(Employee employee) {
		EmployeeDto employeedto = this.modelMapper.map(employee, EmployeeDto.class);
		return employeedto;
	}
	
	private Employee employeeDtoToEmployee(EmployeeDto employeeDto) {
		Employee employee = this.modelMapper.map(employeeDto, Employee.class);
		return employee;
		
	}

	@Override
	public List<EmployeeDto> getAll() {
		return employeeRepo.findAll().stream().map(all -> employeeToEmployeeDto(all)).collect(Collectors.toList());
	}

	@Override
	public EmployeeDto getById(int id) {
		return employeeToEmployeeDto(employeeRepo.findById(id).orElseThrow(() -> new ResourceNotFound("Employee not found...")));
	}

	@Override
	public String updateById(int id, EmployeeDto employeedto) {
		Employee e = employeeRepo.findById(id).orElseThrow(() -> new ResourceNotFound("Employee not found..."));
		
		employeedto.setId(e.getId());
		employeeRepo.save(employeeDtoToEmployee(employeedto));
		return "Updated...";
	}

//	@Override
//	public String save(Employee employee) {
//		employeeRepo.save(employee);
//		return "saved...";
//	}


}
