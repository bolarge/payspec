package com.payspec.domain.model.user;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Employee")
@DiscriminatorValue(value = "EMP")
public class Employee extends User {

	@Column(name="employee_id", unique = true)
	private String employeeId;

	@Column(name="salary")
	private BigDecimal salary;

	@Column(name="pension")
	private Long pension;

	@Column(name="vacation")
	private Integer vacation;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Long getPension() {
		return pension;
	}

	public void setPension(Long pension) {
		this.pension = pension;
	}

	public Integer getVacation() {
		return vacation;
	}

	public void setVacation(Integer vacation) {
		this.vacation = vacation;
	}

	@Override
	public String getUserType() {
		return null;
	}

	@Override
	public void setUserType(String userType) {

	}
}
