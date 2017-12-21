package com.htc.cjavaexercises1.entity;

public class ProjectMainClass {

	/* Main method */
	public static void main(String[] args) {
		  Project p1=new Project(1110,"jazx","James",15);
		  Project p2=new Project();
		  Project p3=new Project();
		  
		  p2.setProjectId(1120);
		  p2.setProjectName("xyz");
		  p2.setProjectHead("James");
		  p2.setNoOfResources(25);
		  
		  p3.setProjectId(1135);
		  p3.setProjectName("abc");
		  p3.setProjectHead("Jones");
		  p3.setNoOfResources(15);
		  
		    System.out.println("Project 1:");
		    System.out.println("----------");
			System.out.println("projectId:"+p1.getProjectId());
			System.out.println("projectName:"+p1.getProjectName());
			System.out.println("projectHead:"+p1.getProjectHead());
			System.out.println("noOfResources:"+p1.getNoOfResources());
			
			System.out.println("Project 2:");
		    System.out.println("----------");
			System.out.println("projectId:"+p2.getProjectId());
			System.out.println("projectName:"+p2.getProjectName());
			System.out.println("projectHead:"+p2.getProjectHead());
			System.out.println("noOfResources:"+p2.getNoOfResources());
			
			System.out.println("Project 3:");
		    System.out.println("----------");
			System.out.println("projectId:"+p3.getProjectId());
			System.out.println("projectName:"+p3.getProjectName());
			System.out.println("projectHead:"+p3.getProjectHead());
			System.out.println("noOfResources:"+p3.getNoOfResources());
			

	  }

}
