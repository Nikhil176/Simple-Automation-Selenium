package com.project1.intern;

public class GeneralUserFlow {
	GeneralUserFlow() throws InterruptedException
	{
		GeneralUserRegistration gur = new GeneralUserRegistration();
		Thread.sleep(500L);
		GenUser_CreatePlan gc = new GenUser_CreatePlan();
		Thread.sleep(500L);
		ActivatePlanG ag = new ActivatePlanG();
		Thread.sleep(500L);
		UploadCsvG cg = new UploadCsvG();
	}
}
