package com.htc.employee;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
	
	private String employeeId;
	private String employeeName;
	private Date dateJoined;
	
	public Employee()
	{
		this.employeeId ="";
		this.employeeName = "";
		this.dateJoined = null;
		
	}
	public Employee(String employeeId, String employeeName, Date dateJoined) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateJoined = dateJoined;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Date getDateofJoin() {
		return dateJoined;
	}
	public void setDateofJoin(Date dateJoined) {
		this.dateJoined = dateJoined;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateJoined == null) ? 0 : dateJoined.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (dateJoined == null) {
			if (other.dateJoined != null)
				return false;
		} else if (!dateJoined.equals(other.dateJoined))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", dateofJoin=" + dateJoined
				+ "]";
	}
	


}
