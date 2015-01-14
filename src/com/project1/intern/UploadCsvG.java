package com.project1.intern;

import org.openqa.selenium.By;
/**
 * @param args
 * @throws InterruptedException 
 * @author krishnva
 */
public class UploadCsvG {
	

	
	
	UploadCsvG() throws InterruptedException
	{
		
		
		user_login();
		
		Thread.sleep(2000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='upload_link']")).click();
		
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='radioThree']")).click();
		
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.name("uploadedfiles[]")).sendKeys(Variables.csv_g);
		
		Thread.sleep(500L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='saAreaInput']")).sendKeys(Variables.survey_g);
		
		Thread.sleep(500L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='regSubmitButton']")).click();
		
		Thread.sleep(1000L);
		
		Variables.driver_v.switchTo().alert().accept();
		
		logoff();
		
		
	}
	
	public void user_login() throws InterruptedException
	{
		Variables.driver_v.get(Variables.url);
		
		Variables.driver_v.manage().window().maximize();
		
		Variables.driver_v.findElement(By.xpath("//*[@id='name']")).sendKeys(Variables.genuser);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='pwd']")).sendKeys(Variables.gen_passwd);
		
		Thread.sleep(2000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='regSubmitButton']")).click();
	
	}
	
	public void logoff() throws InterruptedException
	{
		Variables.driver_v.findElement(By.xpath("//*[@id='logoff']")).click();	
	}
}
