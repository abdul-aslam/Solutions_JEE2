package com.htc.exc.thirteen;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class HTCGlobalServices implements ICompanyserviceprovider {
	
	private String companyId;
	private String address;
	private Map<Integer,Employee> employeeHashMap = new HashMap<>();
	private Employee e;
	private static int lastAssignedNo=100;
	int employeeId;
	
	public HTCGlobalServices(String companyId, String address) {
		super();
		this.companyId = companyId;
		this.address = address;
		
	}
	public HTCGlobalServices(String companyId, String address, HashMap<Integer, Employee> employeeHashMap) {
		super();
		this.companyId = companyId;
		this.address = address;
		this.employeeHashMap = employeeHashMap;
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

	public HashMap<Integer, Employee> getEmployeeHashMap() {
		return (HashMap<Integer, Employee>) employeeHashMap;
	}

	public void setEmployeeHashMap(HashMap<Integer, Employee> employeeHashMap) {
		this.employeeHashMap = employeeHashMap;
	}

	@Override
	public String toString() {
		return "HTCGlobalServices [companyId=" + companyId + ", address=" + address + ", employeeHashMap="
				+ employeeHashMap + "]";
	}

	@Override
	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		employeeId = lastAssignedNo + 1;
		lastAssignedNo = lastAssignedNo + 1;
		e.setEmployeeId(employeeId);
		
		employeeHashMap.put(employeeId, e);
		
		return true;
		
	}

	@Override
	public Employee getEmployee(int employeeId) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		
		if(!employeeHashMap.containsKey(employeeId)) {
			throw new EmployeeNotFoundException("Enter Employee id "+employeeId + " is not available");
		}
		return employeeHashMap.get(employeeId);
		
	}

	@Override
	public boolean updateEmployee(int employeeId, double salary) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		
		if(!employeeHashMap.containsKey(employeeId)) {
			throw new EmployeeNotFoundException("Enter Employee id "+employeeId + " is not available");
		}
		
		e = employeeHashMap.get(employeeId);
		e.setSalary(salary);
		
		return true;
		
		
	}

	@Override
	public boolean deleteEmployee(int employeeId) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		employeeHashMap.remove(employeeId);
		
		return true;
	}
	
	
	
	
	
	
	

}
