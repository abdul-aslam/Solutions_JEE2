package com.htc.employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class EmployeeMainClass {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("E100","ABC",new Date()));
		emp.add(new Employee("E300","XXX",new Date()));
		emp.add(new Employee("E400","NDT",new Date()));
		emp.add(new Employee("E500","TER",new Date()));
		
		EmployeeCrud empCrud = new EmployeeCrud();
		empCrud.setEmployees(emp);
		
		
		
		
		
		
		try
		{
			int crudOption = 0 ;
			String empId = "";
			String empName = "";
			Date empDoj = null;
			
			System.out.println(" CRUD Operation on Employee List");
			System.out.println();
			System.out.println("1. Add employee to the array list");
			System.out.println("2. Read employee from the array list");
			System.out.println("3. Update employee details in the array list");
			System.out.println("4.  Delete the employee from the array list");
			System.out.println("5.  Display the employee from the array list");
			System.out.println();
			
			System.out.println("Enter any one of the above options");
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			crudOption = Integer.parseInt(bf.readLine());
					
			switch (crudOption)
			{
			case 1:
				
				DateFormat dateFormatter = new SimpleDateFormat("MM-dd-yyyy");
				System.out.println("Enter Employee Id");
				empId = bf.readLine();
				System.out.println("Enter Employee Name");
				empName = bf.readLine();
				System.out.println("Enter Employee date of joining");
				empDoj =  dateFormatter.parse(bf.readLine());
				
				System.out.println("Date:"+empDoj);
				empCrud.addEmployee(empId,empName,empDoj);
				System.out.println("Employee is successfully added to the arraylist");
				System.out.println();
				empCrud.dispEmployee();
				break;
			case 2:
				Employee tempEmp = null;
				System.out.println("Enter Employee Id");
				empId = bf.readLine();
				tempEmp = empCrud.getEmployee(empId);
				System.out.println("Employee details are fetched successfully from the array list for employeed id :  " + empId);
				System.out.println();
				System.out.println(empCrud.toString());
				break;
			case 3:
				System.out.println("Enter Employee Id");
				empId = bf.readLine();
				System.out.println("Enter Employee Name to be updated");
				empName = bf.readLine();
				if (empCrud.updateEmployee(empId, empName))
				{
					System.out.println("Employee name updated successfully for employeed id :  " + empId);
					System.out.println();
					System.out.println(empCrud.toString());
				}
				break;
			case 4:
				System.out.println("Enter Employee Id");
				empId = bf.readLine();
				if (empCrud.deleteEmployee(empId))
				{
					System.out.println("Employee deleted successfully from the arraylist for employee id : "+empId);
					System.out.println();
					empCrud.dispEmployee();
					
				}
				break;
			case 5:
				empCrud.dispEmployee();
				break;
			default:
				System.out.println(" Invalid option entered");
				break;
			}
		}
		catch(EmployeeNotFoundException ex)
		{
			System.out.println(ex.toString());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}
