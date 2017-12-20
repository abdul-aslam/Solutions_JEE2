package com.htc.exc.two;

public class Project {

	private String projectId;
	private String projectName;
	private String projectHead;
	private int noOfResources;
	/**
	 * @param projectId
	 * @param projectName
	 * @param projectHead
	 * @param noOfResources
	 */
	public Project() {
		super();
		this.projectId = null;
		this.projectName = null;
		this.projectHead = null;
		this.noOfResources = 0;
	}
	
	public Project(String projectId, String projectName, String projectHead, int noOfResources) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.noOfResources = noOfResources;
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

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectHead=" + projectHead
				+ ", noOfResources=" + noOfResources + "]";
	}
	
	
	
}
