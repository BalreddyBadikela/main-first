package com.employee.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employee.model.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

	EmployeeEntity findByEmployeeId(String employeeId);

}
