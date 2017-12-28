package com.htc.exc.thirteen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThirteenMainCall {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
		HTCGlobalServices htc = new HTCGlobalServices("HTC","Address1");
		
		boolean flag = false;
		boolean contOperation = true;
		
		int checkOption;
		Employee e = new Employee();
		int empid;
		double salary;
		
		
		try {
			while(contOperation) {
				System.out.println(" Welcome to HTC Global Services");
				System.out.println();
				System.out.println("1. Add Employee to HTC");
				System.out.println("2. Get Employee details ");
				System.out.println("3. Update Employee details");
				System.out.println("4. Delete Employee from HTC");
				
				System.out.println(" ");

				System.out.println("Enter the option");
				
				System.out.println(" ");
				
				Scanner sc = new Scanner(System.in);
				checkOption = sc.nextInt();
				
				switch(checkOption) {
					case 1:
						System.out.println("Enter the Employee Name");
						e.setEmployeeName(sc.next());
						System.out.println("Enter the Employee Date of Birth");
						e.setDob(sdf.parse(sc.next()));
						System.out.println("Enter the Employee Salary");
						e.setSalary(sc.nextDouble());
						System.out.println("Enter the Employee Date of Joining");
						e.setDoj(sdf.parse(sc.next()));
					
						flag = htc.addEmployee(e);
						System.out.println("Added Employee details:");
					
						System.out.println(htc.getEmployee(htc.employeeId));
						break;
					case 2:
						System.out.println("Enter the Employee Id to retrieve the details");
						e= htc.getEmployee(sc.nextInt());
				
						System.out.println("Employee Details: " + e);
						break;
						
					case 3:
						System.out.println("Enter the Employee Id to update Salary");
						empid = sc.nextInt();

						System.out.println("Enter the Salary");
						salary = sc.nextDouble();
						flag = htc.updateEmployee(empid, salary);
						
						e=htc.getEmployee(empid);
						System.out.println("Employee Details: " + e);
						break;	
					case 4:
						System.out.println("Enter the Employee Id to remove");
						empid = sc.nextInt();

						flag = htc.deleteEmployee(empid);
						
						System.out.println("Employee Id " + empid + " is removed");
						break;	
					default:
						System.out.println("Enter correct option");
						break;
			}

				System.out.println();
				System.out.println("Do you want to continue (Y/N) :");
				
				if(sc.next().equalsIgnoreCase("n")){
					contOperation = false;
				}
			}
			
		}
		catch(EmployeeNotFoundException enf){
			System.out.println(enf);
		}
		
		catch(Exception ex) {
			System.out.println(ex);
		}

	}

}
