package com.htc.employee;

import java.time.LocalDate;
import java.util.Date;

public interface IEmployeeCrud {
	
	public void addEmployee(String employeeId, String employeeName, Date dateJoined);
	public Employee getEmployee(String employeeId) throws EmployeeNotFoundException;
	public boolean updateEmployee(String employeeId, String employeeName) throws EmployeeNotFoundException;
	public boolean deleteEmployee(String employeeId) throws EmployeeNotFoundException;
	

}