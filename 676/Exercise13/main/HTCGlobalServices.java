package com.htc.Exercise13.main;

//Made by Ernest Paulino

import java.util.HashMap;
import java.util.Map;
import com.htc.Exercise13.entity.*;

public class HTCGlobalServices implements ICompanyserviceprovider{

	static HTCGlobalServices allEmployees = new HTCGlobalServices();
	static Employee employees = new Employee();
	static HashMap<String,Employee> EmployeeMap = new HashMap();
	
	public static void main(String[] args) {

		String empid;
		
		//**********************************************
		
		//* Create data
		
	    // Saving data to employees
		employees.setAddress  ("3270 W. Big Beaver Rd., Troy MI, 48083");
		employees.setCompanyID("HTC Global Services Inc");
		employees.setEmpID    ("001");
		employees.setEmployee ("Marlon Brando");
		employees.setSalary   (45000);
		
		// Calling Create
		allEmployees.createEmployee(employees);
		
	    // Saving data to employees
		employees = new Employee();
		employees.setAddress  ("3270 W. Big Beaver Rd., Troy MI, 48083");
		employees.setCompanyID("HTC Global Services Inc");
		employees.setEmpID    ("002");
		employees.setEmployee ("Christopher Reeves");
		employees.setSalary   (50000);
		
		// Calling Create
		allEmployees.createEmployee(employees);
		
	    // Saving data to employees
		employees = new Employee();
		employees.setAddress  ("3270 W. Big Beaver Rd., Troy MI, 48083");
		employees.setCompanyID("HTC Global Services Inc");
		employees.setEmpID    ("003");
		employees.setEmployee ("Charlton Heston");
		employees.setSalary   (55000);
		
		// Calling Create
		allEmployees.createEmployee(employees);
	
	    // Iterate over all Employees, using the keySet method.
        for(String key: EmployeeMap.keySet())
            System.out.println(key + " - " + EmployeeMap.get(key));
        System.out.println("*****************************************");
        
		//**********************************************

        //* Read Data
        empid = "002";
        allEmployees.readEmployee(empid);
        System.out.println("*****************************************");
        
		//**********************************************

        //* Update Data
        empid = "001";
        allEmployees.readEmployee(empid);
        
		employees = new Employee();
		employees.setAddress  ("3270 W. Big Beaver Rd., Troy MI, 48083");
		employees.setCompanyID("HTC Global Services Inc");
		employees.setEmpID    ("001");
		employees.setEmployee ("Marlon Brando");
		employees.setSalary   (70000);
        
		allEmployees.updateEmployee(employees);
        
        System.out.println("*****************************************");
        
		//**********************************************

        //* Delete Data
        empid = "002";
        allEmployees.deleteEmployee(empid);
        System.out.println("*****************************************");

	    // Iterate over all Employees, using the keySet method.
        for(String key: EmployeeMap.keySet())
            System.out.println(key + " - " + EmployeeMap.get(key));
        System.out.println("*****************************************");

        
		//**********************************************

        
	}

	
	@Override
	public boolean createEmployee(Employee emp) {

		EmployeeMap.put(emp.getEmpID(),emp);
		
		return true;
	}

	@Override
	public boolean readEmployee(String empID) {
		
		employees = EmployeeMap.get(empID);
		System.out.println(" Reading Employee ID " + empID);
		System.out.println(employees);
		System.out.println("*****************************************");
		
		return true;
	}

	@Override
	public boolean updateEmployee(Employee emp) {

		EmployeeMap.replace(emp.getEmpID(),emp);
		
		System.out.println(" Updating Employee ID " + emp.getEmpID());
		
		//* Reading Employees for display only
		System.out.println(employees);
		System.out.println("*****************************************");
		
		return true;
	}

	@Override
	public boolean deleteEmployee(String empID) {
		
		System.out.println("Original data to be deleted");
		//* Reading Employees for display only
		allEmployees.readEmployee(empID);

		System.out.println(" Deleting Employee ID " + empID);
		EmployeeMap.remove(empID);
		
		System.out.println("*****************************************");
		
		return true;
	}



	
}
