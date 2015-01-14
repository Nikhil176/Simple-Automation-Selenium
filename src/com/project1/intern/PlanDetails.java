package com.project1.intern;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PlanDetails {
	
	
	PlanDetails() throws InterruptedException
	{
		
		login_admin();
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='survey_area_link']")).click();
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='dojox_grid_enhanced_plugins_filter_FilterBar_4']/tbody/tr/td[2]/span/span[1]")).click();
		Thread.sleep(500L);
		Variables.driver_v.findElement(By.xpath("//*[@id='dijit_form_Select_7']/tbody/tr/td[2]/div[1]")).click();
		
		Thread.sleep(2000L);
		
		List <WebElement> list = Variables.driver_v.findElements(By.cssSelector(".dijitReset .dijitMenuItemLabel"));
		int j = 0;
		for(int i=0; i<list.size(); i++)
			if( (list.get(i).getText()).equals("is") )
				j = i;
		list.get(j).click();
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.id("dijit_form_TextBox_0")).sendKeys(Variables.statusPlan);
		Variables.driver_v.findElement(By.id("dijit_form_Button_41_label")).click();
		Thread.sleep(2000L);
		
		
		WebElement w = Variables.driver_v.findElement(By.id("dojox_grid__View_8"));
		
		List <WebElement> plan_list = w.findElements(By.className("dojoxGridCell"));
		
		for(int i=0; i<plan_list.size(); i++)
		{
			if( plan_list.get(i).getText().isEmpty() )
				continue;
			else
				System.out.println(plan_list.get(i).getText());
		}
		logoff();
		Variables.driver_v.close();
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
