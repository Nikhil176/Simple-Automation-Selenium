package com.project1.intern;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/**
 * @param args
 * @throws InterruptedException 
 * @author krishnva
 */
public class RequestMaintenancePlan {

	
	RequestMaintenancePlan() throws InterruptedException
	{
		
		user_login();
		Thread.sleep(2000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='masterTabContainer_tablist_reqSurveyAreaTab']/span[1]")).click();
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='dojox_grid_enhanced_plugins_filter_FilterBar_2']/tbody/tr/td[2]/span/span[1]")).click();
		Thread.sleep(1000L);
		
		Thread.sleep(2000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='dijit_form_Select_8']/tbody/tr/td[2]/div[1]")).click();
		Thread.sleep(2000L);
		
		List <WebElement> list = Variables.driver_v.findElements(By.cssSelector(".dijitReset .dijitMenuItemLabel"));
		int j = 0;
		for(int i=0; i<list.size(); i++)
			if( (list.get(i).getText()).equals("is") )
				j = i;
		list.get(j).click();
		Thread.sleep(2000L);
		
		Variables.driver_v.findElement(By.id("dijit_form_TextBox_0")).sendKeys(Variables.m_plan);
		Variables.driver_v.findElement(By.id("dijit_form_Button_23_label")).click();
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.partialLinkText("Request")).click();
		Thread.sleep(1000L);
		Variables.driver_v.switchTo().alert().accept();
		logoff();
		
//		
		
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
