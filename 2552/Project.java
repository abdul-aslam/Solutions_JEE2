
package com.htc.cjavaexercises1.entity;

/* Exercises 2 */
public class Project {
	
	  private int projectId; 
	  private String projectName;
	  private String projectHead;
	  private int noOfResources;
	  
	  /* getter and setter methods */
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

    /* constructor */
	public Project(int projectId, String projectName, String projectHead, int noOfResources) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.noOfResources = noOfResources;
	}


	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noOfResources;
		result = prime * result + ((projectHead == null) ? 0 : projectHead.hashCode());
		result = prime * result + projectId;
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
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
		if (noOfResources != other.noOfResources)
			return false;
		if (projectHead == null) {
			if (other.projectHead != null)
				return false;
		} else if (!projectHead.equals(other.projectHead))
			return false;
		if (projectId != other.projectId)
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectHead=" + projectHead
				+ ", noOfResources=" + noOfResources + "]";
	}

	  
}

 	