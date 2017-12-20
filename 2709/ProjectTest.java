package assignment;

import java.util.Date;

public class ProjectTest {

	public static void main(String[] args) {
		
		Project iAuto = new Project();
		
		iAuto.setProjectId(21526);
		iAuto.setProjectName("Intergrated Auto ");
		iAuto.setProjectHead("Scott");
		iAuto.setNoOfResources(8);
		
		System.out.println("Printing Project Details");
		System.out.println(iAuto.toString()) ;
		
	}

}
