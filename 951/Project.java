package com.htc.exercies;

public class Project {
    private String projectId;
    private String projectName;
    private String projectHead;
    private int noOfResources;
    
    
	public Project(String projectId, String projectName, String projectHead,
			int noOfResources) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.noOfResources = noOfResources;
	}


	public Project() {
		// TODO Auto-generated constructor stub
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((projectId == null) ? 0 : projectId.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (projectId == null) {
			if (other.projectId != null)
				return false;
		} else if (!projectId.equals(other.projectId))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName="
				+ projectName + ", projectHead=" + projectHead
				+ ", noOfResources=" + noOfResources + "]";
	}

}
