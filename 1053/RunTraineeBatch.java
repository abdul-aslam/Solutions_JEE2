package com.htc.javaex1;

public class RunTraineeBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee[] trainees = new Trainee[4];
		trainees[1]= new Trainee(2,"Lisa Smith","309-000-0001","lisa.smith@email.com",'f',18);
		trainees[2]= new Trainee(3,"Srinivas Rao","309-001-0002","srini.rao@email.com",'m',19);
		trainees[3]= new Trainee(4,"Ram Singh","309-101-0002","ram.singh@email.com",'m',20);
		Batch batch = new Batch(1,"1/1/2018","12/31/2018",trainees);
        System.out.println(batch.toString());
	}

}
