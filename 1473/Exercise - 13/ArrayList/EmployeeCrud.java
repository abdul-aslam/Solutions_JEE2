package com.htc.employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeCrud implements IEmployeeCrud {
	
	private List<Employee> employees;
	
	public EmployeeCrud()
	{
		this.employees = null;
	}

	public EmployeeCrud(List<Employee> employees) {
		super();
		this.employees = employees;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public void addEmployee(String employeeId,String employeeName,Date dateJoined) {
		
		employees.add(new Employee(employeeId,employeeName,dateJoined));
			
	}

	@Override
	public Employee getEmployee(String employeeId) throws EmployeeNotFoundException {
		
		Employee tempEmp = null;
		
		boolean empFlag = false;
		
		for(Employee emp : employees)
		{
			if (emp.getEmployeeId().equals(employeeId))
			{
				
				tempEmp = emp;
				empFlag = true;
				break;
			}
		}
		
		if(!empFlag)
		{
			throw new EmployeeNotFoundException("Employee Not Found");
		}
		return tempEmp ;
	}

	@Override
	public boolean updateEmployee(String employeeId,String employeeName) throws EmployeeNotFoundException {
		
		boolean empUpdate = false;
		Employee tempEmp = null;
		
	    tempEmp = this.getEmployee(employeeId);
		tempEmp.setEmployeeName(employeeName);
		empUpdate = true;
		
		return empUpdate;
	}

	@Override
	public boolean deleteEmployee(String employeeId) throws EmployeeNotFoundException {
		boolean empDelete = false;
		Employee tempEmp = null;
		
		tempEmp = this.getEmployee(employeeId);
		employees.remove(tempEmp);
		empDelete = true;
		
		return empDelete;
	}

	@Override
	public String toString() {
		return "EmployeeCrud [employees=" + employees + "]";
	}

	public void dispEmployee()
	{
		for(Employee emp : employees)
		{
			System.out.println(emp.toString());
		}
	}
	
	
	

}
