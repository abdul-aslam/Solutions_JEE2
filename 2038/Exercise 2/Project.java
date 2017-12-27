package com.htc.project;

public class Project {

	 private String projectId;
	 private String projectName;
	 private String projectHead;
	 private int NoOfResources;
	 
	 //Default constructor
	 public Project()
	 {
		 projectId = "";;
		 projectName = "";
		 projectHead = "";
		 NoOfResources = 0;
	 }
	
	 //Constructor overloading
	public Project(String projectId, String projectName, String projectHead, int NoOfResources) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.NoOfResources = NoOfResources;
	}
	
	// Getter & Setter properties
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
		return NoOfResources;
	}
	public void setNoOfResources(int NoOfResources) {
		this.NoOfResources = NoOfResources;
	}

	// Overiding the tostring method
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectHead=" + projectHead
				+ ", NoOfResources=" + NoOfResources + "]";
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
		if (NoOfResources != other.NoOfResources)
			return false;
		if (projectHead == null) {
			if (other.projectHead != null)
				return false;
		} else if (!projectHead.equals(other.projectHead))
			return false;
		if (projectId == null) {
			if (other.projectId != null)
				return false;
		} else if (!projectId.equals(other.projectId))
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		return true;
	}

	//Overridng the hashcode and equals method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + NoOfResources;
		result = prime * result + ((projectHead == null) ? 0 : projectHead.hashCode());
		result = prime * result + ((projectId == null) ? 0 : projectId.hashCode());
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		return result;
	}
	 	
}