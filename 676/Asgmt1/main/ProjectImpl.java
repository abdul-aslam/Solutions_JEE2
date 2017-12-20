package com.htc.Asgmt1.main;

//Made by Ernest Paulino

import com.htc.Asgmt1.entity.Project;

public class ProjectImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating Instance
		Project Projects=new Project();
		
		// Setting Values
		Projects.setProjectId("R12345");
		Projects.setProjectName("Groupings");
		Projects.setProjectHead("Marlon Brando");
		Projects.setNoOfResources(30);
		
		// Printing Values
		System.out.println("Project Id:       "+ Projects.getProjectId());
		System.out.println("Project Name:     "+ Projects.getProjectName());
		System.out.println("Project Head:     "+ Projects.getProjectHead());
		System.out.println("No. of Resources: "+ Projects.getNoOfResources());
				
	}

}
