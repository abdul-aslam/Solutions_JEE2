package com.htc.java;

// 1. create an application using Java.
 /*(i) Create an entity class named Project with member variables as projectId,
 projectName, projectHead, noOfResources.
 (ii) Create an object for the Project class and through setters assign the values
 for all the member variables.
 (iii) Print the corresponding object*/

public class Project {

	String projectId;
	String projectName;
	String projectHead;
	int noOfResources;
	
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectHead() {
		return projectHead;
	}
	public void setProjectHead(String projectHead) {
		this.projectHead = projectHead;
	}
	public int getNoOfResources() {
		return noOfResources;
	}
	public void setNoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
		Project project = new Project();
		
		// set the member variables
		project.setProjectId("R1111");
		project.setProjectName("Auto");
		project.setProjectHead("Mike");
		project.setNoOfResources(10);
		
		//print the object 
		System.out.println(project.getProjectId());
		System.out.println(project.getProjectName());
		System.out.println(project.getProjectHead());
		System.out.println(project.getNoOfResources());
				
	}

}
