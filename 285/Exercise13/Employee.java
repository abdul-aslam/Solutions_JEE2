package com.htc.Exercise13;

public class Employee {
	private String empId;
	private String empName;
	private double empsalary;
	
	public Employee() {
		super();
		this.empId = "";
		this.empName = "";
		this.empsalary = 0.0;
	}
	public Employee(String empId, String empName, double empsalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empsalary = empsalary;
	}
	//public Employee(Employee emp) {
	//	super();
	//	this.empId = emp.empId;
	//	this.empName = emp.empName;
	//	this.empsalary = emp.empsalary;
	//}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empsalary=" + empsalary + "]";
	}
	
	
	

}
