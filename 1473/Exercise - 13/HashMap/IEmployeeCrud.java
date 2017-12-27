package com.htc.employeehashmap;

import java.util.HashMap;

public interface IEmployeeCrud {
	
	public void addEmployee(String employeeId,String employeeName, int age, double salary);
	public Employee getEmployee(String employeeId) throws EmployeeNotFoundException;
	public boolean updateEmployee(String employeeId, double salary) throws EmployeeNotFoundException;
	public boolean deleteEmployee(String employeeId) throws EmployeeNotFoundException;

}
