package assignment2;

import java.util.HashMap;

public class CompanuMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(100 , "Bhaskar " , 5600000);
		Employee emp2 = new Employee(101 , "Dinesh " , 890000);
		Employee emp3 = new Employee(102 , "Srini " , 780000);
		Employee emp4 = new Employee(103 , "Surya " , 3600000);
		Employee emp5 = new Employee(104 , "Sindhu " , 8500000);
		Employee emp6 = new Employee(105 , "Rajesh " , 230000);
		
		HashMap<Integer,Employee> empHash = new HashMap<Integer,Employee>();
		empHash.put(emp1.getEmpId(), emp1);empHash.put(emp2.getEmpId(), emp2);
		empHash.put(emp3.getEmpId(), emp3);empHash.put(emp4.getEmpId(), emp4);
		empHash.put(emp5.getEmpId(), emp5);
		
		HTCGlobalServices htc = new HTCGlobalServices(1234567,"3270 W Big beaver" , empHash); 
		
		System.out.println(" **************************************************************************** ");
		System.out.println(" \n Compnay Details Now " + htc);
		
		htc.addEmployee(emp6);
		System.out.println(" **************************************************************************** ");
		System.out.println("\n Compnay Details Now " + htc);
		
		System.out.println(" *******************Updating Employee***************************************** ");
		System.out.println("Before Updating Employee " + emp1);
		htc.updateEmployee(emp1, 999999);
		System.out.println("After Updating Employee " + emp1);
		
		System.out.println(" *******************Deleting 1 Employee ***************************************** ");
		htc.deleteEmployee(emp6);
		System.out.println("\n Compnay Details Now " + htc);
		
		System.out.println(" *******************List Of Employee ***************************************** ");
		System.out.println(htc.getEmployees());

	}

}
