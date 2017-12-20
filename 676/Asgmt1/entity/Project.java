package com.htc.Asgmt1.entity;

//Made by Ernest Paulino

    //Project Class
    public class Project {
	private String projectId;//instance variable
	private String projectName;//instance variable
	private String projectHead;//instance variable
	private int    noOfResources;//instance variable
	
	// Default constructor
	public Project() {
	}
	
	// Parameterized constructor
	public Project(String projectId, String projectName, String projectHead, int noOfResources) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.noOfResources = noOfResources;
	}

	// Getter and Setter methods  
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
	
	
	
	
	
}
