package com.training2;

public class Project {
	
	private int projectId;
	private String projectName;
	private String ProjectHead;
	private int noOfResources;
	
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", ProjectHead=" + ProjectHead
				+ ", noOfResources=" + noOfResources + "]";
	}
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectHead() {
		return ProjectHead;
	}
	public void setProjectHead(String projectHead) {
		ProjectHead = projectHead;
	}
	public int getNoOfResources() {
		return noOfResources;
	}
	public void setNoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}

}
