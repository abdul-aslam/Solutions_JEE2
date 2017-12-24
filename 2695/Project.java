
public class Project {
	
	String  projectId,projectName, projectHead, noOfResources;

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String abc) {
		this.projectId = abc;
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

	public String getNoOfResources() {
		return noOfResources;
	}

	public void setNoOfResources(String noOfResources) {
		this.noOfResources = noOfResources;
	}
	
	public static void main(String args[]){
		
		Project p1 = new Project();
		
		p1.setProjectId("1");
		p1.setProjectHead("ABC");
		p1.setProjectName("Java Trainig");
		p1.setNoOfResources("10");
		
	
		
		System.out.println("values : " +p1.getProjectId() +p1.getProjectHead()  +p1.getProjectName()   +p1.getNoOfResources());
		
	}
	
	
}
