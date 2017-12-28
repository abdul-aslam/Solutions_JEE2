package com.htc.trainingexcerise.week1;
/* Week1 - Exercise question 2 */
public class Project {

	private int projectId;
	private String projectName;
	private String projectHead;
	private int noOfResources;
	
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
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectHead=" + projectHead
				+ ", noOfResources=" + noOfResources + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Project projectObj=new Project();
		projectObj.setProjectId(1);
		projectObj.setProjectName("Java_Banking");
		projectObj.setProjectHead("XXX");
		projectObj.setNoOfResources(20);
		System.out.println(projectObj.toString());
		//System.out.println(projectObj.getProjectId()+" "+projectObj.getProjectName()+" "+projectObj.getProjectHead()+" "+projectObj.getNoOfResources());
		
	}

}
