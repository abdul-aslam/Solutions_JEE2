/**
 * 
 */
package com.htc.hw1;

import java.io.Serializable;

/**
 * @author Venkat
 *
 */
public class Project implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3358051293579218311L;
	private int projectId;
	private String projectName;
	private String projectHead;
	private int noOfResources;

	public Project(int projectId, String projectName, String projectHead, int noOfResources) {
		super();
//		System.out.println("entering constructor");
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.noOfResources = noOfResources;
	}

	public static void main(String[] Args) {
	
		Project proj = new Project(1001, "Project A", "John Adams", 23);
//		proj.toString();
		System.out.println(proj);
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
		result = prime * result + noOfResources;
		result = prime * result + ((projectHead == null) ? 0 : projectHead.hashCode());
		result = prime * result + projectId;
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
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
//		System.out.println("in toString" + projectId);
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectHead=" + projectHead
				+ ", noOfResources=" + noOfResources + "]";
	}
	
}
