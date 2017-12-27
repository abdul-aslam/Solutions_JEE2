package com.htc.employee;

public class EmployeeNotFoundException extends Exception {
       			private String empNotFoundMsg;
       			
       			public EmployeeNotFoundException()
       			{
       				this.empNotFoundMsg = "Employee Id is invalid";
       			}
				public EmployeeNotFoundException(String empNotFoundMsg) {
					super();
					this.empNotFoundMsg = empNotFoundMsg;
				}

				@Override
				public String toString() {
					return "EmployeeNotFoundException [empNotFoundMsg=" + empNotFoundMsg + "]";
				}
       			
}
