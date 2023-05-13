package com.employee.employee.api;

import java.util.List;

import com.employee.employee.dtos.EmployeeInDto;
import com.employee.employee.dtos.EmployeeOutDto;
import com.employee.employee.model.EmployeeEntity;

public interface EmployeeApi {
  EmployeeEntity saveEmployeeDetails(EmployeeInDto dto);
   List<EmployeeOutDto> getEmployeesDetailsWIthTaxDeductionDetails();
  
}
