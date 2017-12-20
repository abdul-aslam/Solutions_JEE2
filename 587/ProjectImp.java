package com.htc.Day2.main;

public class ProjectImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Project obj = new Project("R2000","Accounting","Lead",10);
    System.out.println("  projectId:  " + obj.getProjectId() +"  projectName:  " +obj.getProjectName()+"  Lead:   "+obj.getProjectHead()+"  No:   "+obj.getNoOfResources());
    }

}
