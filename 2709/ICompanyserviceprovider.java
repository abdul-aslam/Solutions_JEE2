package assignment2;

import java.util.List;

public interface ICompanyserviceprovider {
	
	public int addEmployee(Employee emp);
	public boolean updateEmployee(Employee emp,double salary);
	public int deleteEmployee(Employee emp);
	public Employee getEmployee( int  EmpId);
	public List<Employee> getEmployees();
	
}
