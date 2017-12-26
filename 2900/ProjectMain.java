package com.htc.exercise1stwk.main;

public class ProjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Project prj = new Project();
        prj.setNoOfResources("10");
        prj.setProjectHead("XXX");
        prj.setProjectId(111);
        prj.setProjectName("YYY");
        
        System.out.println("Project Id" + prj.getProjectId() + "Project Head" + prj.getProjectHead() + "Project name" + prj.getProjectName() + "Project Resource" + prj.getNoOfResources());
                
	}

}
