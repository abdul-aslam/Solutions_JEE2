package com.htc.Exercise2.main;

import com.htc.Exercises.entity.Project;

public class PrintProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project p1 = new Project();
		p1.setProjectId("P1234");
		p1.setProjectHead("Chad");
		p1.setProjectName("ProjX");
		p1.setNoOfResources(45);
		
		System.out.println("Project Details :"+p1);

	}

}
