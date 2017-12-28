package Hwjava2;

public class ImplProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Project proj = new Project();
		
		proj.setProjectid(1234);
		proj.setProjectname("htc");
		proj.setProjecthead("reddy");
		proj.setNoofres(500);
		
		System.out.println(proj.getProjectid());
		System.out.println(proj.getProjectname());
		System.out.println(proj.getProjecthead());
		System.out.println(proj.getNoofres());
	}

}
