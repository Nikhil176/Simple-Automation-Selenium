package com.project1.intern;

import org.openqa.selenium.By;

/**
 * @param args
 * @throws InterruptedException 
 * @author krishnva
 */
public class ActivatePlanG {
	
	
	
	ActivatePlanG() throws InterruptedException
	{
		
		
		login_admin();
		
		
		
		
		Variables.driver_v.findElement(By.xpath("//*[@id='general_user_link']")).click();
		
		Thread.sleep(2000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='dijit_form_Button_51']/span[1]")).click();
		
		Variables.driver_v.findElement(By.id("dijit_form_TextBox_0")).sendKeys(Variables.genuser);	
		
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='dijit_form_Button_50_label']")).click();
		
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.partialLinkText("Activate")).click();
		
		logoff();
		
	}
	
	public void login_admin() throws InterruptedException
	{
		
		Variables.driver_v.get(Variables.url);
		Variables.driver_v.manage().window().maximize();
		
		Variables.driver_v.findElement(By.xpath("//*[@id='name']")).sendKeys(Variables.admin_v);
		Variables.driver_v.findElement(By.xpath("//*[@id='pwd']")).sendKeys(Variables.admin_passwd_v);
		
		Thread.sleep(2000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='regSubmitButton']")).click();		
		
		
	}
	
	public void logoff() throws InterruptedException
	{
		Variables.driver_v.findElement(By.xpath("//*[@id='logoff']")).click();
	}

}

