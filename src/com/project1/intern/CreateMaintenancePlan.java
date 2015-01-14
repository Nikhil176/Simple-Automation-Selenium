package com.project1.intern;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateMaintenancePlan {
	/**
	 * @param args
	 * @throws InterruptedException 
	 * @author krishnva
	 */
	
	
	CreateMaintenancePlan() throws InterruptedException
	{
		
		
		login_admin();
		
		Variables.driver_v.findElement(By.xpath("//*[@id='survey_area_link']")).click();
		
		Thread.sleep(2000L);
		
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
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.id("dijit_form_TextBox_0")).sendKeys(Variables.m_plan);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='dijit_form_Button_41_label']")).click();
		
		Thread.sleep(1000L);
		
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
		
		Thread.sleep(1000L);
		
		List <WebElement> c_list = Variables.driver_v.findElements(By.cssSelector(".dijitMenuItemLabel"));
		Thread.sleep(1000L);
		int k=0;
		for(int i=0; i<c_list.size(); i++)
		{
			if( (c_list.get(i).getText()).equals("Create Maintenance Plan"))
			{
				k = i;
			}
		}
		Thread.sleep(500L);
		
		c_list.get(k).click();
		
		Thread.sleep(500L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='manageSAMaintPlanButton']")).click();
		
		Thread.sleep(1000L);
		
		List <WebElement> treeLabel = Variables.driver_v.findElements(By.className("dijitTreeLabel"));
		Thread.sleep(1000L);
		
		for(int i=0; i<treeLabel.size(); i++)
			System.out.println(treeLabel.get(i).getText());
 		
		int[] ind = new int[Variables.m_poi];
		int a;
		int b;
		int c = 0;
		
		for(a = 0; a < Variables.mType.length; a++)
		{
			for(b = 0; b < treeLabel.size(); b++ )
			{
				
				if(Variables.mType[a].equals(treeLabel.get(b).getText()))
				{
					ind[c] = b;
					c++;
				}
			}
		}
		
		for(int i=0; i<Variables.m_poi; i++)
		{
			Variables.driver_v.findElement(By.xpath("//*[@id='sct_rialto__CheckBoxTreeNode_"+ind[i]+"']/div[1]/input")).click();
			Thread.sleep(200L);
		}
		
		
		
		Variables.driver_v.findElement(By.id("rewardPointsMaintText")).sendKeys(Variables.m_rewardPoints);
		Variables.driver_v.findElement(By.id("rewardPointsMaintText1")).sendKeys(Variables.m_nRewardPoints);
		Variables.driver_v.findElement(By.id("maxPOICountNewMaintText")).sendKeys(Variables.m_maxRewardPoints);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='addToMaintGrid']")).click();
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='mtMaxpoiCountCap']")).sendKeys(Variables.m_totalBudget);
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='calculateSAMaintPlanButton']")).click();
		
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='updateSAMaintPlanButton']")).click();
		
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.id("mtNewMaxpoiCountCap")).sendKeys(Variables.m_totalBudget);
		
		Variables.driver_v.findElement(By.id("calculateSAMaintNewPlanButton")).click();
		
		Thread.sleep(500L);
		
		Variables.driver_v.findElement(By.id("saveSAMaintPlanButton")).click();
		
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
