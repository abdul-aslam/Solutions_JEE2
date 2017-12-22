package com.htc.excercise2.kishorebabu;


public class Project 
{
	private int projectId;
	private String projectName;
	private String projectHead;
	private int noOfResources;
	


public int getprojectId()
{

return projectId;
}
public void setprojectId(int projectId)
{
	
this.projectId=projectId;	
}

public String getprojectName()
{

return projectName;
}
public void setprojectName(String projectName)
{
	
this.projectName=projectName;	
}

public String getprojectHead()
{

return projectHead;
}
public void setprojectHead(String projectHead)
{
	
this.projectHead=projectHead;	
}

public int getnoOfResources()
{

return noOfResources;
}
public void setnoOfResources(int noOfResources)
{
	
this.noOfResources=noOfResources;	
}


public Project(int projectId,String projectName,String projectHead,int noOfResources)
{
	this.projectId=projectId;
	this.projectName=projectName;
	this.projectHead=projectHead;
	this.noOfResources=noOfResources;
		
}

public static void main(String[] args)
{
	
	Project obj=new Project(1,"JavaProject","Bhavani",20);
	

	System.out.println("Project Id:"+obj.getprojectId());
	System.out.println("Project Name: "+obj.getprojectName());
	System.out.println("Project Head: "+obj.getprojectHead());
	System.out.println("No Of Resources: "+obj.getnoOfResources());
	


}

}
