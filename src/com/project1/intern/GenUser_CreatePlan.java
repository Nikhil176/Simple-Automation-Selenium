package com.project1.intern;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
/**
 * @param args
 * @throws InterruptedException 
 * @author krishnva
 */
public class GenUser_CreatePlan {
	

	GenUser_CreatePlan() throws InterruptedException
	{
		
		login_admin();
		
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='general_user_link']")).click();
		Thread.sleep(500L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='dijit_form_Button_51']/span[1]")).click();
		
		Variables.driver_v.findElement(By.id("dijit_form_TextBox_0")).sendKeys(Variables.genuser);	
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='dijit_form_Button_50_label']")).click();
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.linkText("Create New plan")).click();
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='manageSAButton_gu']")).click();
		
		Thread.sleep(2000L);
		
		WebElement p = Variables.driver_v.findElement(By.id("aoiselect3_gu"));
		
		
		List <WebElement> poi_type = p.findElements(By.tagName("option"));
		int[] ind = new int[Variables.gen_poi];
		
		int a, b, c = 0;
		
		for(a=0; a<Variables.gType.length; a++)
		{
			for(b=0; b<poi_type.size(); b++)
			{
				if(Variables.gType[a].equals(poi_type.get(b).getText()))
				{
					ind[c] = b;
					c++;
				}
			}
		}
		
		
		
		Actions builder = new Actions(Variables.driver_v);
		
		builder.keyDown(Keys.CONTROL);
		
		for(int i=0; i<Variables.gen_poi; i++)
		{
			builder.click(poi_type.get(ind[i]));
		}
		builder.keyUp(Keys.CONTROL);
		
		org.openqa.selenium.interactions.Action setMultiple = builder.build();
		
		setMultiple.perform();
		
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='right_gu']")).click();
		

		Variables.driver_v.findElement(By.xpath("//*[@id='rewardPointsText_gu']")).sendKeys(Variables.g_rewardPoints);
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='maxpois_gu']")).sendKeys(Variables.g_maxPOI);
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='maxpoiCountCap_gu']")).sendKeys(Variables.g_maxRewardPointCap);
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='updatePlanButton_gu']")).click();
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='calculateSAPlanButton_gu']")).click();
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='createSAPlanButton_gu']")).click();
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
