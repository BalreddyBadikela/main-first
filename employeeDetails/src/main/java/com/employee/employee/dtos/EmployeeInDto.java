package com.employee.employee.dtos;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import io.micrometer.common.lang.NonNull;

public class EmployeeInDto {

	
	@NonNull
	private String employeeId;

	@NonNull
	private String firstName;
	@NonNull
	private String lastName;
	@NonNull
	private String email;
	@NonNull
	private List<Long> phoneNumber;   //multiple numbers
	@NonNull
	private Date doj;
	@NonNull
	private long Salary;

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

	public long getSalary() {
		return Salary;
	}

	public void setSalary(long salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeInDto [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", doj=" + doj + ", Salary=" + Salary + "]";
	}



	public EmployeeInDto(String employeeId, String firstName, String lastName, String email, List<Long> phoneNumber,
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

	public EmployeeInDto() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(Salary, doj, email, employeeId, firstName, lastName, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeInDto other = (EmployeeInDto) obj;
		return Objects.equals(Salary, other.Salary) && Objects.equals(doj, other.doj)
				&& Objects.equals(email, other.email) && Objects.equals(employeeId, other.employeeId)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(phoneNumber, other.phoneNumber);
	}
	
	
}
