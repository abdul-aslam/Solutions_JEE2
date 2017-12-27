package com.htc.employeehashmap;

import java.util.HashMap;
import java.util.Iterator;

public class HTCGlobalServices  implements IEmployeeCrud{
	
	private String companyId;
	private String address;
	private HashMap<String,Employee> empHashMap ;
	static int empNo = 300;


	public HTCGlobalServices(String companyId, String address, HashMap<String, Employee> empHashMap) {
		super();
		this.companyId = companyId;
		this.address = address;
		this.empHashMap = empHashMap;
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


	public HashMap<String, Employee> getEmpHashMap() {
		return empHashMap;
	}


	public void setEmpHashMap(HashMap<String, Employee> empHashMap) {
		this.empHashMap = empHashMap;
	}


	@Override
	public String toString() {
		return "HTCGlobalServices [companyId=" + companyId + ", address=" + address + ", empHashMap=" + empHashMap
				+ "]";
	}


	@Override
	public void addEmployee(String employeeId, String employeeName, int age, double salary) {

		empHashMap.put(employeeId, new Employee(employeeName,age,salary));
	}


	@Override
	public Employee getEmployee(String employeeId) throws EmployeeNotFoundException {
		Employee tempEmp = null;
		boolean empFlag = false;
       
		for(String keys : empHashMap.keySet())
		{
			if (keys.equals(employeeId))
			{
				tempEmp = empHashMap.get(employeeId);
				empFlag = true;
				break;
			}
		}
		
	
		if (!empFlag)
		{
			throw new EmployeeNotFoundException("Employee not found in the Hash Map");
		}
		return tempEmp;
	}


	@Override
	public boolean updateEmployee(String employeeId, double salary) throws EmployeeNotFoundException {
		Employee tempEmp = null;
		boolean updFlag = false; 
		
		tempEmp = this.getEmployee(employeeId);
		tempEmp.setSalary(salary);
		empHashMap.replace(employeeId, tempEmp);
		updFlag = true;


		return updFlag;
	}


	@Override
	public boolean deleteEmployee(String employeeId) throws EmployeeNotFoundException {
		boolean deleteFlag = false;
       Employee tempEmp = null;
		
        tempEmp = this.getEmployee(employeeId);
		empHashMap.remove(employeeId);
		deleteFlag = true;
	
		return deleteFlag;

	}

	public void dispHtcDetails()
	{
		System.out.println("Company Id : " + this.companyId);
		System.out.println(" Address        : " + this.address);
		System.out.println();

		Iterator empIterator = empHashMap.entrySet().iterator();

		while(empIterator.hasNext())
		{
			System.out.println(empIterator.next());
		}
			
}
	
	
	
	
	
	
	
	
	
	

}
