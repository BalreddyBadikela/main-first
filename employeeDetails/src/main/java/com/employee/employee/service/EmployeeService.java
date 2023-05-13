package com.employee.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.employee.api.EmployeeApi;
import com.employee.employee.dtos.EmployeeInDto;
import com.employee.employee.dtos.EmployeeOutDto;
import com.employee.employee.model.EmployeeEntity;
import com.employee.employee.repository.EmployeeRepository;

public class EmployeeService implements EmployeeApi {
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public EmployeeEntity saveEmployeeDetails(EmployeeInDto dto) {
		EmployeeEntity findByEmployeeId = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		EmployeeEntity employeeEntity=new EmployeeEntity();

		if(findByEmployeeId==null) {
			employeeEntity.setDoj(dto.getDoj());
			employeeEntity.setEmail(dto.getEmail());
			employeeEntity.setEmployeeId(dto.getEmployeeId());
			employeeEntity.setFirstName(dto.getFirstName());
			employeeEntity.setLastName(dto.getLastName());
		
			List<Long> phNo=new ArrayList<>();
			phNo.addAll(dto.getPhoneNumber());
			employeeEntity.setPhoneNumber(phNo);
			employeeEntity.setSalary(dto.getSalary());
			employeeRepository.save(employeeEntity);
		}
		else {
			throw new RuntimeException("Duplicate Employee cabbot be added");
			
		}
		return employeeEntity;
	}

	@Override
	public List<EmployeeOutDto> getEmployeesDetailsWIthTaxDeductionDetails() {
		List<EmployeeEntity> findAll = employeeRepository.findAll();
		
		List<EmployeeOutDto> result=new ArrayList<>();
		if(!findAll.isEmpty()) {
		 findAll.stream().forEach(emp->{
			 if(emp.getSalary()*12<=250000) {
				 EmployeeOutDto dto=new EmployeeOutDto();

				 dto.setSalary(emp.getSalary());
				 dto.setEmployeeId(emp.getEmployeeId());
				 dto.setCessAmount(0);
				 dto.setTaxAmount(0);
				 dto.setFirstName(emp.getFirstName());
				 dto.setLastName(emp.getLastName());
				 result.add(dto);
			 }
			 else if(emp.getSalary()*12>250000 && emp.getSalary()*12<=500000) {
				 EmployeeOutDto dto=new EmployeeOutDto();

				long taxAmount=emp.getSalary()*12%5;
				 dto.setSalary(emp.getSalary());
				 dto.setEmployeeId(emp.getEmployeeId());
				 dto.setCessAmount(0);
				 dto.setTaxAmount(taxAmount);
				 dto.setFirstName(emp.getFirstName());
				 dto.setLastName(emp.getLastName());
				 result.add(dto);
				 
			 }
			 
			 else if(emp.getSalary()*12>500000 &&emp.getSalary()*12<=1000000) {
				 EmployeeOutDto dto1=new EmployeeOutDto();
				long taxableamount= emp.getSalary()*12-250000;
					long taxAmount=taxableamount%10;
					 dto1.setSalary(emp.getSalary());
					 dto1.setEmployeeId(emp.getEmployeeId());
					 dto1.setCessAmount(0);
					 dto1.setTaxAmount(taxAmount);
					 dto1.setFirstName(emp.getFirstName());
					 dto1.setLastName(emp.getLastName());
					 result.add(dto1);
				 
			 }
			 else if(emp.getSalary()*12>1000000) {
				 EmployeeOutDto dto1=new EmployeeOutDto();

					long taxAmount=emp.getSalary()*12%20-250000;
					 dto1.setSalary(emp.getSalary());
					 dto1.setEmployeeId(emp.getEmployeeId());
					 dto1.setCessAmount(0);
					 dto1.setTaxAmount(taxAmount);
					 dto1.setFirstName(emp.getFirstName());
					 dto1.setLastName(emp.getLastName());
					 result.add(dto1);
			 }
			 
		 });
			
			
		}else {
			
			throw new RuntimeException("No Employees Found");
		}
		
		return result;
	}

}
