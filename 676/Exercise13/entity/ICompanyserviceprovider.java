package com.htc.Exercise13.entity;

//Made by Ernest Paulino

public interface ICompanyserviceprovider {

	// CRUD function
	public boolean createEmployee(Employee employee);
	public boolean readEmployee(String empID);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(String empID);
		
}
