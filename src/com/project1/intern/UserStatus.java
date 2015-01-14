package com.project1.intern;

import org.openqa.selenium.By;

import com.tomtom.fco.fcoapi.FCOSourceAPI;
import com.tomtom.fco.fcoapi.beans.SCTUser;
import com.tomtom.fco.fcoapi.constants.UserStateEnum;

public class UserStatus {
	
	String userStatus = "Approve";
	
	UserStatus() throws InterruptedException
	{
		
		FCOSourceAPI fcoSourceAPI = new FCOSourceAPI();
		SCTUser user = fcoSourceAPI.updateUserState(Variables.normal_user_v, UserStateEnum.USER_REGISTRATION_VALIDATED.getCode());
		System.out.println("Status changed "+user.getState());
		
		login_admin();
		
		Thread.sleep(2000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='dijit_form_Button_6_label']")).click();
		Thread.sleep(2000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='dijit_form_TextBox_0']")).sendKeys(Variables.normal_user_v);
		Variables.driver_v.findElement(By.xpath("//*[@id='dijit_form_Button_5_label']")).click();
		
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.linkText(userStatus)).click();
		Variables.driver_v.switchTo().alert().accept();
		
		Variables.driver_v.findElement(By.id("logoff")).click();
			
		
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




}
