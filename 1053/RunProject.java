package com.htc.javaex2;

public class RunProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Project proj = new Project();
        proj.setProjectId(1);
        proj.setProjectName("HTC Training");
        proj.setProjectHead("Ram");
        proj.setNoOfResources(10);
        System.out.println(proj.toString());
                
	}

}
