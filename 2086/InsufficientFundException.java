package com.htc.trainingexcerise.week1;

public class InsufficientFundException extends Exception{
String erromsg;


public InsufficientFundException() {
	this.erromsg="Insufficient funds available in account to transfer";
	
}

public InsufficientFundException(String erromsg) {
	super();
	this.erromsg = erromsg;
}





}
