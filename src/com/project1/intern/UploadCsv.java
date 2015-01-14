package com.project1.intern;

import org.openqa.selenium.By;
/**
 * @param args
 * @throws InterruptedException 
 * @author krishnva
 */
public class UploadCsv {
	
	UploadCsv() throws InterruptedException
	{
		
		user_login();
		
		Thread.sleep(500L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='upload_link']")).click();
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='radioOne']")).click();
		Thread.sleep(1000L);
		
		
		Variables.driver_v.findElement(By.name("uploadedfiles[]")).sendKeys(Variables.csv);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='saAreaInput']")).sendKeys(Variables.user_plan);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='regSubmitButton']")).click();
		
		Thread.sleep(2500L);
		
		Variables.driver_v.switchTo().alert().accept();
		
		logoff();
	}
	public void user_login() throws InterruptedException
	{
		Variables.driver_v.get(Variables.url);
		Variables.driver_v.manage().window().maximize();
		Variables.driver_v.findElement(By.xpath("//*[@id='name']")).sendKeys(Variables.normal_user_v);
		Variables.driver_v.findElement(By.xpath("//*[@id='pwd']")).sendKeys(Variables.passwd_v);
		Thread.sleep(2000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='regSubmitButton']")).click();
	
	}
	public void logoff() throws InterruptedException
	{
		Variables.driver_v.findElement(By.xpath("//*[@id='logoff']")).click();	
	}
}
