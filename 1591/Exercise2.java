package com.training2;

public class Exercise2 {

	public static void main(String[] args) {

		Project project = new Project();
		
		project.setProjectId(1);
		project.setProjectName("GFS Testing Tools");
		project.setProjectHead("Nate Taulbee");
		project.setNoOfResources(10);
		
		System.out.print(project);

	}

}
