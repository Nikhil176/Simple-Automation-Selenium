package com.project1.intern;

import org.openqa.selenium.By;

public class UploadCsvMaintenance {
	
	
	
	UploadCsvMaintenance() throws InterruptedException
	{
		
		
		user_login();
		
		Thread.sleep(2000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='upload_link']")).click();
		
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='radioTwo']")).click();
		
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.name("uploadedfiles[]")).sendKeys(Variables.csv_m);
		
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='saAreaInput']")).sendKeys(Variables.m_plan);
		
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='regSubmitButton']")).click();
		
		Thread.sleep(1000L);
	}
	
	public void user_login() throws InterruptedException
	{
		Variables.driver_v.get(Variables.url);
		Variables.driver_v.manage().window().maximize();
		Variables.driver_v.findElement(By.xpath("//*[@id='name']")).sendKeys(Variables.genuser);
		Variables.driver_v.findElement(By.xpath("//*[@id='pwd']")).sendKeys(Variables.passwd_v);
		Thread.sleep(2000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='regSubmitButton']")).click();
	
	}
}
