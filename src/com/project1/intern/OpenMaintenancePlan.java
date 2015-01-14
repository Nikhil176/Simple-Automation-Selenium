package com.project1.intern;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenMaintenancePlan {
	
	
	OpenMaintenancePlan() throws InterruptedException
	{
		
		login_admin();
		Thread.sleep(2000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='survey_area_link']")).click();
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='dojox_grid_enhanced_plugins_filter_FilterBar_4']/tbody/tr/td[2]/span/span[1]")).click();
		
		Thread.sleep(2000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='dijit_form_Select_7']/tbody/tr/td[2]/div[1]")).click();
		Thread.sleep(2000L);
		
		List <WebElement> list = Variables.driver_v.findElements(By.cssSelector(".dijitReset .dijitMenuItemLabel"));
		int j = 0;
		for(int i=0; i<list.size(); i++)
			if( (list.get(i).getText()).equals("is") )
				j = i;
		list.get(j).click();
		Thread.sleep(2000L);
		
		Variables.driver_v.findElement(By.id("dijit_form_TextBox_0")).sendKeys(Variables.m_plan);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='dijit_form_Button_41_label']")).click();
		
		Thread.sleep(2000L);
		
		WebElement w1 = Variables.driver_v.findElement(By.xpath("//*[@id='dojox_grid__View_8']/div/div/div/div/table/tbody/tr/td[11]"));
		Thread.sleep(500L);
		WebElement w2 = w1.findElement(By.tagName("table"));
		Thread.sleep(500L);
		WebElement w3 = w2.findElement(By.tagName("tbody"));
		Thread.sleep(500L);
		WebElement w4 = w3.findElement(By.tagName("tr"));
		Thread.sleep(500L);
		List <WebElement> l = w4.findElements(By.tagName("td"));
		Thread.sleep(500L);
		WebElement w5 = l.get(1).findElement(By.tagName("div"));
		Thread.sleep(500L);
		w5.click();
		
		List <WebElement> c_list = Variables.driver_v.findElements(By.cssSelector(".dijitMenuItemLabel"));
		Thread.sleep(1000L);
		int k=0;
		for(int i=0; i<c_list.size(); i++)
		{
			if( (c_list.get(i).getText()).equals("Open survey area"))
			{
				k = i;
			}
		}
		Thread.sleep(500L);
		
		c_list.get(k).click();
		
		Variables.driver_v.switchTo().alert().accept();
		
		Thread.sleep(1000L);
		logoff();
		
	}
	
	public void login_admin() throws InterruptedException
	{
		
		Variables.driver_v.get("https://in1xpd-505316/login.jsp");
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
