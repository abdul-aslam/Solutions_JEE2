package exercise;

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
	
	public static void main(String args[]){
		Project project = new Project();
		project.setProjectId(1234);
		project.setProjectHead("Raman");
		project.setProjectName("XYZ project");
		project.setNoOfResources(123);
		
		System.out.println("Project Details are : \n"+ "Project id is :"+project.getProjectId());
		System.out.println("Project Head is :"+project.getProjectHead());
		System.out.println("Project Name is :"+project.getProjectName());
		System.out.println("Project Resources  are :"+project.getNoOfResources());
		
	}
}
