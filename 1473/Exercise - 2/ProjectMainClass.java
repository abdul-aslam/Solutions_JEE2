package com.htc.project;

public class ProjectMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating the instance object for the class project and calling the default constructor
				Project proj = new Project();
				
				// Using the setter methods the values are assigned to the fields in the project class
				proj.setNoOfResources(10);
				proj.setProjectHead("Karthick");
				proj.setProjectId("R23323");
				proj.setProjectName("CREE Project");
				
				//Using the getter methods the values are displayed
				System.out.println("Project Id               :"+ proj.getProjectId());
				System.out.println("Project Name         :"+ proj.getProjectName());
				System.out.println("Project head           :"+ proj.getProjectHead());
				System.out.println("No of resources     :"+ proj.getNoOfResources());
				
				//Constructor overloading - Assigning the values to the fields in the Project class while creating the object for project class
				
				Project projOver = new Project("R23867","Signon","Pradeep",50);
				System.out.println("");
						
				//Using the getter method display the values from the fields in the project class
				System.out.println("Project Id              :"+ projOver.getProjectId());
				System.out.println("Project Name        :"+ projOver.getProjectName());
				System.out.println("Project head          :"+ projOver.getProjectHead());
				System.out.println("No of resources    :"+ projOver.getNoOfResources());

	}

}
