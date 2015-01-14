package com.project1.intern;

import java.io.IOException;


/**
 * @param args
 * @throws InterruptedException 
 * @author krishnva
 */
public class Pro_1 extends Variables {


	public static void main(String[] args) throws InterruptedException, IOException {
		
		loadNormalUserProperties();
		Thread.sleep(500L);
		loadGeneralUserProperties();
		Thread.sleep(500L);
		loadMaintenanceProperties();
		Thread.sleep(500L);
		NormalUserFlow nuf = new NormalUserFlow();
		Thread.sleep(500L);
		GeneralUserFlow guf = new GeneralUserFlow();
		Thread.sleep(500L);
		MaintenanceFlow mf = new MaintenanceFlow();
		
	}
	
	

}
