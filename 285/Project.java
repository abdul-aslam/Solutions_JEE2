package htc.package2;

public class Project {
	
	private String projectID;
	private String projectName;
	private String projectHead;
	private int noOfResouces;
	public String getProjectID() {
		return projectID;
	}
	public void setProjectID(String projectID) {
		this.projectID = projectID;
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
	public int getNoOfResouces() {
		return noOfResouces;
	}
	public void setNoOfResouces(int noOfResouces) {
		this.noOfResouces = noOfResouces;
	}
	public Project(String projectID, String projectName, String projectHead, int noOfResouces) {
		super();
		this.projectID = projectID;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.noOfResouces = noOfResouces;
	}
	@Override
	public String toString() {
		return "Project [projectID=" + projectID + ", projectName=" + projectName + ", projectHead=" + projectHead
				+ ", noOfResouces=" + noOfResouces + ", getProjectID()=" + getProjectID() + ", getProjectName()="
				+ getProjectName() + ", getProjectHead()=" + getProjectHead() + ", getNoOfResouces()="
				+ getNoOfResouces() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public static void main(String[] args) {
		Project P1=new Project("1111", "Customer Reports", "Smith", 10);
		System.out.println(P1);
	}


}
