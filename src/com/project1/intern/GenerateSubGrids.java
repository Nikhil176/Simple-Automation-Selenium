package com.project1.intern;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenerateSubGrids {

	
	GenerateSubGrids() throws InterruptedException
	{
		
		login_admin();
		Thread.sleep(2000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='survey_area_link']")).click();
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='dojox_grid_enhanced_plugins_filter_FilterBar_4']/tbody/tr/td[2]/span/span[1]")).click();
		Thread.sleep(1000L);
		
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
		Variables.driver_v.findElement(By.id("dijit_form_Button_41_label")).click();
		Thread.sleep(1000L);
		WebElement w = Variables.driver_v.findElement(By.id("dojox_grid__View_8"));
		
		List <WebElement> plan_list = w.findElements(By.className("dojoxGridCell"));
		
		for(int i=0; i<plan_list.size(); i++)
		{
			if( plan_list.get(i).getText().isEmpty() )
				continue;
			else
			{
				
				System.out.println(plan_list.get(i).getText());
				
			}
		}
		while(plan_list.get(plan_list.size()-1).getText().equals("No action"))
		{
			Thread.sleep(60000L);
		}
		
		Thread.sleep(500L);
		WebElement w1 = Variables.driver_v.findElement(By.xpath("//*[@id='dojox_grid__View_8']/div/div/div/div/table/tbody/tr/td[11]"));
		Thread.sleep(100L);
		WebElement w2 = w1.findElement(By.tagName("table"));
		Thread.sleep(100L);
		WebElement w3 = w2.findElement(By.tagName("tbody"));
		Thread.sleep(100L);
		WebElement w4 = w3.findElement(By.tagName("tr"));
		Thread.sleep(100L);
		List <WebElement> l = w4.findElements(By.tagName("td"));
		Thread.sleep(100L);
		l.get(1).findElement(By.tagName("div")).click();
		Thread.sleep(500L);
		List <WebElement> c_list = Variables.driver_v.findElements(By.cssSelector(".dijitMenuItemLabel"));
		
		int k=0;
		for(int i=0; i<c_list.size(); i++)
		{
			if( (c_list.get(i).getText()).equals("Generate Work-package"))
			{
				k = i;
			}
		}
		c_list.get(k).click();
		
		Thread.sleep(1000L);
		
		if( Variables.subGridSize.equals("3*3"))
		{
			Variables.driver_v.findElement(By.id("b3Radio")).click();
		}
		else if ( Variables.subGridSize.equals("9*9"))
		{
			Variables.driver_v.findElement(By.id("b9Radio")).click();
		}
		else if ( Variables.subGridSize.equals("16*16"))
		{
			Variables.driver_v.findElement(By.id("b16Radio")).click();
		}
		
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.id("gridNumbersCSV")).sendKeys(Variables.gridNumbers);
		
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.id("generateSubGridsButton")).click();
		
		Thread.sleep(500L);
		
		Variables.driver_v.findElement(By.id("gridOk1_label")).click();
		
		Thread.sleep(2000L);
		
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
