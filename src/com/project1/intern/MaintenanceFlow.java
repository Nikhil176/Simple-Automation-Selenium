package com.project1.intern;

public class MaintenanceFlow {
	MaintenanceFlow() throws InterruptedException
	{
		CreateMaintenancePlan cp = new CreateMaintenancePlan();
		Thread.sleep(500L);
		OpenMaintenancePlan omp = new OpenMaintenancePlan();
		Thread.sleep(500L);
		RequestMaintenancePlan rmp = new RequestMaintenancePlan();
		Thread.sleep(500L);
		AssignMaintenancePlan amp = new AssignMaintenancePlan();
		Thread.sleep(500L);
		GenerateGrid gg = new GenerateGrid();
		Thread.sleep(50000L);
		GenerateSubGrids gsb = new GenerateSubGrids();
		Thread.sleep(500L);
		GenerateWorkPackage gwk = new GenerateWorkPackage();
		Thread.sleep(500L);
		UploadCsvMaintenance ucm = new UploadCsvMaintenance();
	}
}
