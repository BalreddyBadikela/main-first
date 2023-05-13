package com.employee.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.dtos.EmployeeInDto;
import com.employee.employee.dtos.EmployeeOutDto;
import com.employee.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService  employeeService;
	
	@PostMapping(path="/saveEmployee")
	public void saveEmployeeDetails(@Validated EmployeeInDto dto) {
		
		employeeService.saveEmployeeDetails(dto);
	}
	
	@GetMapping(path="/getEmployeeeDetails")
	public List<EmployeeOutDto> getEmployeeDetails() {
		
return employeeService.getEmployeesDetailsWIthTaxDeductionDetails();
	
	}
}
