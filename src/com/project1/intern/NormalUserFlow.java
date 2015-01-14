package com.project1.intern;

public class NormalUserFlow {
	/* - - - - -  Normal User Flow - - - - - - - */	
	NormalUserFlow() throws InterruptedException
	{
		
	
	Register r = new Register();
	Thread.sleep(500L);
	UserStatus us = new UserStatus();
	Thread.sleep(500L);
	CreatePlan cp = new CreatePlan();
	Thread.sleep(500L);
	
	OpenPlan op = new OpenPlan();
	Thread.sleep(500L);
	RequestPlan rq = new RequestPlan();
	Thread.sleep(500L);
	AssignPlan ap = new AssignPlan();
	Thread.sleep(500L);
	UploadCsv uc = new UploadCsv();
	
	}
	
	
	
}