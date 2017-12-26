package com.htc.Exercise13;

import java.util.ArrayList;

public class HTCGlobalServices implements ICompanyserviceprovider {
	public String companyId;
	public String address;
	ArrayList<Employee> empList = new ArrayList<>(); 

	public HTCGlobalServices() {
		super();
		this.companyId = "";
		this.address = "";
		this.empList = null;
	}
	public HTCGlobalServices(String companyId, String address, ArrayList<Employee> empList) {
		super();
		this.companyId = companyId;
		this.address = address;
		this.empList = empList;
	}

	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ArrayList<Employee> getEmpList() {
		return this.empList;
	}
	public void setEmpList(ArrayList<Employee> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "HTCGlobalServices [CompanyId=" + companyId + ", Address=" + address + ", EmpList=" + empList + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((companyId == null) ? 0 : companyId.hashCode());
		result = prime * result + ((empList == null) ? 0 : empList.hashCode());
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
		HTCGlobalServices other = (HTCGlobalServices) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (companyId == null) {
			if (other.companyId != null)
				return false;
		} else if (!companyId.equals(other.companyId))
			return false;
		if (empList == null) {
			if (other.empList != null)
				return false;
		} else if (!empList.equals(other.empList))
			return false;
		return true;
	}
	
	public boolean addEmp(Employee emp)
	{
		empList.add(emp);
		return true;
	}
	public boolean deleteEmp(String empId) throws EmployeeNotFoundException
	{
		boolean deleteEmp = false;	
		for (Employee emp:empList)
		{
			if (emp.getEmpId()==empId) {
				empList.remove(emp);
				deleteEmp = true;
				break;
			}	
		}
		if (!deleteEmp)
			throw new EmployeeNotFoundException("Not able to delete Employee " + empId + " - not found in the list");
		else
			return deleteEmp;
	}
	public Employee getEmp(String empId) throws EmployeeNotFoundException
	{
		for (Employee emp:this.empList)
		{
			if (emp.getEmpId()==empId) {
				return emp;
			}	
		}
		throw new EmployeeNotFoundException("Not able to get the details - Employee " + empId + " is not found in the list");
	}
	
	public boolean updateEmp(String empId, double salary) throws EmployeeNotFoundException
	{
		for (Employee emp:empList)
		{
			if (emp.getEmpId().equals(empId)) {
				emp.setEmpsalary(emp.getEmpsalary() + salary);
				return true;
			}	
		}
		throw new EmployeeNotFoundException("Not able to update salary for Employee " + empId + " - not found in the list");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee("01", "Employee01", 10000.00));
		empList.add(new Employee("02", "Employee02", 20000.00));
		empList.add(new Employee("03", "Employee03", 30000.00));
		empList.add(new Employee("04", "Employee04", 40000.00));
		HTCGlobalServices c1 = new HTCGlobalServices("1111", "Troy, MI", empList);
		System.out.println(c1);
		try
		{
			System.out.println("Employee Details for Employee id 03 : " + c1.getEmp("03"));
			if (c1.addEmp(new Employee("05", "Employee05", 50000.00)) == true) 
				System.out.println("Employee 05 has been added. Details : " + c1.getEmp("05"));
			if (c1.deleteEmp("01") == true) 
				System.out.println("Employee 01 has been deleted. ");
			if (c1.updateEmp("03",10000) == true) 
				System.out.println("Salary for Employee 03 has been updated. Details : " + c1.getEmp("03"));
		}
		catch (EmployeeNotFoundException e)
		{
			System.out.println(e.getErrMsg());
			e.printStackTrace();
		}
	}
}
