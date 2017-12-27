package assignment2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class HTCGlobalServices implements ICompanyserviceprovider{

	private int Company_ID;
	private String Address;
	private HashMap<Integer, Employee> empMap;
	
	public HTCGlobalServices(int company_ID, String address, HashMap<Integer, Employee> empMap) {
		super();
		Company_ID = company_ID;
		Address = address;
		this.empMap = empMap;
	}
	
	@Override
	public int addEmployee(Employee emp) {
		
		if( empMap.get(emp.getEmpId()) == null)
		{
			empMap.put(emp.getEmpId(), emp);
			return 1;
		}
		
		return 0;
		
		
	}
	@Override
	public boolean updateEmployee(Employee emp,double salary) {

		 empMap.get(emp.getEmpId()).setSalary(salary); 
		      return true;
			
	}
	
	
	@Override
	public int deleteEmployee(Employee emp) {
		empMap.remove(emp.getEmpId());
		return 1;
	}
	
	@Override
	public Employee getEmployee(int EmpId) {
		
		return empMap.get(EmpId);
	}
	@Override
	public List<Employee> getEmployees() {
		
		Collection<Employee> values = empMap.values();
		ArrayList<Employee> listOfValues = new ArrayList<Employee>(values);
		return listOfValues;
	}

	@Override
	public String toString() {
		return "HTCGlobalServices [Company_ID=" + Company_ID + ", Address=" + Address + ", empMap=" + empMap + "]";
	}
	
}
