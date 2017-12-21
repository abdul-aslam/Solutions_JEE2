package com.project;

public class Project {

	private String projectId;
	private String projectName;
	private String projectHead;
	private int noOfResources;
	
		
	public Project(String projectId, String projectName, String projectHead, int noOfResources) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.noOfResources = noOfResources;
		
	}
	public Project() {
		super();
	}
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

	public String toString() {
		StringBuilder project = new StringBuilder();
		project.append("ProjectID : ");
		project.append(projectId);
		project.append(" projectName : ");
		project.append(projectName);
		project.append(" ProjectHead : ");
		project.append(projectHead);
		project.append(" noOfResources : ");
		project.append(noOfResources);
		
		return project.toString();
		
	}
	
}
