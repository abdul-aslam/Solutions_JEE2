package com.htc.exc.two;

public class TwoMainCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Project p = new Project("P001","PName1","ProjHead1",10);
		System.out.println("Project Details I: " + p);
		
		p.setProjectId("P002");
		p.setProjectName("Pname2");
		p.setProjectHead("ProjHead1");
		p.setNoOfResources(20);
		
		System.out.println("Project Details II: " + p);
		
		System.out.println("************Project Details III****** ");
		System.out.println("Project ID       : " + p.getProjectId());
		System.out.println("Project Name     : " + p.getProjectName());
		System.out.println("Project Head     : " + p.getProjectHead());
		System.out.println("No. of Resources : " + p.getNoOfResources());
		System.out.println("************************************* ");
		
		

	}

}
