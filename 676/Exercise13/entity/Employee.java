package com.htc.Exercise13.entity;

//Made by Ernest Paulino

public class Employee {
	private String empID;//instance variable
	private String employee;//instance variable
	private double salary;//instance variable
	private String address;//instance variable
	private String companyID;//instance variable
	
    // Default Constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

    // Constructor for all fields 
	public Employee(String empID, String employee, double salary, String address, String companyID) {
		super();
		this.empID = empID;
		this.employee = employee;
		this.salary = salary;
		this.address = address;
		this.companyID = companyID;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompanyID() {
		return companyID;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", employee=" + employee + ", salary=" + salary + ", address=" + address
				+ ", companyID=" + companyID + "]";
	}
		
}
