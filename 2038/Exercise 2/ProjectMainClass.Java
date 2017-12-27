package com.htc.project;

public class ProjectMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating the instance object for the class project and calling the default constructor
				Project proj = new Project();
				
		// Using the setter methods the values are assigned to the fields in the project class
		proj.setNoOfResources(15);
		proj.setProjectHead("Andy");
		proj.setProjectId("R12345");
		proj.setProjectName("Auto");
				
		//Using the getter methods the values are displayed
		System.out.println("Project Id               :"+ proj.getProjectId());
		System.out.println("Project Name             :"+ proj.getProjectName());
		System.out.println("Project head             :"+ proj.getProjectHead());
		System.out.println("No of resources          :"+ proj.getNoOfResources());
				
		//Constructor overloading
		Project projOver = new Project("R09876","Fire","William",20);
		System.out.println("");
						
		//display the fields in the project class
		System.out.println("Project Id              :"+ projOver.getProjectId());
		System.out.println("Project Name            :"+ projOver.getProjectName());
		System.out.println("Project head            :"+ projOver.getProjectHead());
		System.out.println("No of resources         :"+ projOver.getNoOfResources());

	}

}