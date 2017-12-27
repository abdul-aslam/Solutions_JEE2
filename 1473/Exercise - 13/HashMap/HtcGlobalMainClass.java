package com.htc.employeehashmap;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class HtcGlobalMainClass {

	public static void main(String[] args) {

		int crudOption = 0 ;
		String empId = "";
		String empName = "";
		int empAge = 0;
		double empSalary = 0.0;
		boolean continueOption = true;

		HashMap<String,Employee> empHash = new HashMap<String,Employee>();

		Employee pradeep = new Employee("Pradeep",35,50000);
		Employee anu = new Employee("Anu",18,20000);
		Employee karthi = new Employee("Karthi",30,60000);

		empHash.put("E100", pradeep);
		empHash.put("E200", anu);
		empHash.put("E300", karthi);

		HTCGlobalServices htcDetails = new HTCGlobalServices("HTC","Big Beaver Road",null);

		htcDetails.setEmpHashMap(empHash);


		try
		{
			while (continueOption)
			{
				System.out.println(" CRUD Operation on Employee HashMap");
				System.out.println();
				System.out.println("1. Add employee to the HashMap");
				System.out.println("2. Read employee from the HashMap");
				System.out.println("3. Update employee details in the HashMap");
				System.out.println("4.  Delete the employee from the HashMap");
				System.out.println("5.  Display the data");
				System.out.println();	
				System.out.println("Enter any of the above option");

				Scanner inputReader = new Scanner(System.in);
				crudOption = inputReader.nextInt();

				switch(crudOption)
				{
				case 1:
					System.out.println("Enter the Employee Name");
					empName = inputReader.next();
					System.out.println("Enter the Employee Age");
					empAge = inputReader.nextInt();
					System.out.println("Enter the Employee Salary");
					empSalary = inputReader.nextDouble();
					HTCGlobalServices.empNo = HTCGlobalServices.empNo + 100;
					empId = "E".concat(Integer.toString(HTCGlobalServices.empNo));
					htcDetails.addEmployee(empId, empName, empAge, empSalary);
					htcDetails.dispHtcDetails();
					break;
				case 2:
					System.out.println("Enter the Employee Id");
					empId = inputReader.next();
					System.out.println(htcDetails.getEmployee(empId).toString());
					break;
				case 3:
					System.out.println("Enter the Employee Id");
					empId = inputReader.next();
					System.out.println("Enter the Employee Salary");
					empSalary = inputReader.nextDouble();
					if (htcDetails.updateEmployee(empId,empSalary))
					{
						htcDetails.dispHtcDetails();
					}
					else
					{
						System.out.println("Update is not successfully for employee id : " + empId);
					}
					break;
				case 4:
					System.out.println("Enter the Employee Id");
					empId = inputReader.next();
					if(htcDetails.deleteEmployee(empId))
					{
						htcDetails.dispHtcDetails();
					}
					else
					{
						System.out.println("Deletion failed for employee Id :"+ empId);
					}
					break;
				case 5:
					htcDetails.dispHtcDetails();
					break;
				default:
					System.out.println("Invalid Option Entered");
					break;
				}

				System.out.println();
				System.out.println("Do you want to proceed further (Y/N) :");
				if(inputReader.next().equalsIgnoreCase("n"))
				{
					continueOption = false;
				}

			}
		}
		catch(EmployeeNotFoundException e)
		{
			System.out.println(e.toString());
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}





	}

}
