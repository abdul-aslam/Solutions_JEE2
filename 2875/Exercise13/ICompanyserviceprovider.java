package com.htc.exc.thirteen;

import java.util.Date;

public interface ICompanyserviceprovider {
	
	public boolean addEmployee(Employee e);
	public Employee getEmployee(int employeeId) throws EmployeeNotFoundException;
	public boolean updateEmployee(int employeeId, double salary) throws EmployeeNotFoundException;
	public boolean deleteEmployee(int employeeId) throws EmployeeNotFoundException;


}
