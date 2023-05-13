package com.employee.employee.dtos;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class EmployeeOutDto {
	
	
	
	
	

	private String employeeId;

	private String firstName;

	private String lastName;

	private String email;

	private List<Long> phoneNumber;   //multiple numbers

	private Date doj;

	private long Salary;
	private long taxAmount;
	
	private long cessAmount;

	public long getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(long taxAmount) {
		this.taxAmount = taxAmount;
	}

	public long getCessAmount() {
		return cessAmount;
	}

	public void setCessAmount(long cessAmount) {
		this.cessAmount = cessAmount;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public List<Long> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<Long> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public EmployeeOutDto(String employeeId, String firstName, String lastName, String email, List<Long> phoneNumber,
			Date doj, long salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.doj = doj;
		Salary = salary;
	}

	public EmployeeOutDto() {
		// TODO Auto-generated constructor stub
	}

	public long getSalary() {
		return Salary;
	}

	public void setSalary(long salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeOutDto [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", doj=" + doj + ", Salary=" + Salary
				+ ", taxAmount=" + taxAmount + ", cessAmount=" + cessAmount + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(Salary, cessAmount, doj, email, employeeId, firstName, lastName, phoneNumber, taxAmount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeOutDto other = (EmployeeOutDto) obj;
		return Salary == other.Salary && cessAmount == other.cessAmount && Objects.equals(doj, other.doj)
				&& Objects.equals(email, other.email) && Objects.equals(employeeId, other.employeeId)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(phoneNumber, other.phoneNumber) && taxAmount == other.taxAmount;
	}
	
	
}

