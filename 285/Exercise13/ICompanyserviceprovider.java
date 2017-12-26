package com.htc.Exercise13;

public interface ICompanyserviceprovider {
	public boolean addEmp(Employee emp);
	public boolean deleteEmp(String empId) throws EmployeeNotFoundException;
	public Employee getEmp(String empId) throws EmployeeNotFoundException;
	public boolean updateEmp(String empId, double salary) throws EmployeeNotFoundException;
}
