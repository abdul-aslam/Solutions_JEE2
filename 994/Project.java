package Hwjava2;

public class Project {
	private int projectid;
	private String projectname;
	private String projecthead;
	private int noofres;
	
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getProjecthead() {
		return projecthead;
	}
	public void setProjecthead(String projecthead) {
		this.projecthead = projecthead;
	}
	public int getNoofres() {
		return noofres;
	}
	public void setNoofres(int noofres) {
		this.noofres = noofres;
	}
	@Override
	public String toString() {
		return "Project [projectid=" + projectid + ", projectname=" + projectname + ", projecthead=" + projecthead
				+ ", noofres=" + noofres + "]";
	}
	public Project() {
		super();
	}
	
	
	

}
