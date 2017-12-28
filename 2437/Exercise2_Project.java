package htc.java.training.exercises;
// Exercise Question 2 Project

public class Exercise2_Project {
	
	public int projectId, noOfResoures;
	public String projectName,projectHead;
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getNoOfResoures() {
		return noOfResoures;
	}
	public void setNoOfResoures(int noOfResoures) {
		this.noOfResoures = noOfResoures;
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
	
	public static void main(String[] args) {
		
		Exercise2_Project projectObj=new Exercise2_Project();
		projectObj.setProjectId(1);
		projectObj.setProjectName("HTC_Java_Project");
		projectObj.setProjectHead("MSG");
		projectObj.setNoOfResoures(25);
		
		System.out.println(projectObj.getProjectId()+" "+projectObj.getProjectName()+" "+projectObj.getProjectHead()+" "+projectObj.getNoOfResoures());
	
		projectObj.setProjectId(2);
		projectObj.setProjectName("HTC_.Net_Project");
		projectObj.setProjectHead("GMS");
		projectObj.setNoOfResoures(20);
		
		System.out.println(projectObj.getProjectId()+" "+projectObj.getProjectName()+" "+projectObj.getProjectHead()+" "+projectObj.getNoOfResoures());
	}	
	
}
