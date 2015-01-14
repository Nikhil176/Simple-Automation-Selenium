package com.project1.intern;

import org.openqa.selenium.By;

import com.tomtom.fco.fcoapi.FCOSourceAPI;
import com.tomtom.fco.fcoapi.beans.SCTUser;
import com.tomtom.fco.fcoapi.constants.UserStateEnum;
/**
 * @param args
 * @throws InterruptedException 
 * @author krishnva
 */
public class GeneralUserRegistration {
	
	
	
	String fname = "Pavan";
	String lname = "Vamsi";
	String dob = "03/13/1993";
	String add1 = "Flat no 201, S Res";
	String add2 = "Sri Ram Nagar";
	String city = "Pune";
	String pincode = "200012";
	String country = "India";
	String mobile = "91-8985615408";
	String landline = "91-040-23319389";
	String state = "Maharashtra";
	String admin = "fcotry8@gmail.com";
	String admin_passwd = "Adas123$";
	
	
	
	GeneralUserRegistration() throws InterruptedException
	{
		
		
		Variables.driver_v.get(Variables.url);

		Variables.driver_v.manage().window().maximize();
		
		Variables.driver_v.findElement(By.id("userReg")).click();
		
		Thread.sleep(1000L);
	
		Variables.driver_v.findElement(By.id("name")).sendKeys(Variables.genuser);
		Variables.driver_v.findElement(By.id("pwd")).sendKeys(Variables.gen_passwd);
		Variables.driver_v.findElement(By.id("cPwd")).sendKeys(Variables.gen_passwd);
		Variables.driver_v.findElement(By.id("fname")).sendKeys(fname);
		Variables.driver_v.findElement(By.id("lname")).sendKeys(lname);
		Variables.driver_v.findElement(By.id("dob")).clear();
		Variables.driver_v.findElement(By.id("dob")).sendKeys(dob);
		Variables.driver_v.findElement(By.id("add1")).sendKeys(add1);
		Variables.driver_v.findElement(By.id("add2")).sendKeys(add2);
		Variables.driver_v.findElement(By.id("city")).sendKeys(city);
		Variables.driver_v.findElement(By.id("state")).sendKeys(state);
		Variables.driver_v.findElement(By.id("country")).clear();
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.id("pincode")).sendKeys(pincode);
		Variables.driver_v.findElement(By.id("country")).sendKeys(country);
		Variables.driver_v.findElement(By.id("mobile")).sendKeys(mobile);
		Variables.driver_v.findElement(By.id("tPhone")).sendKeys(landline);
		
				
		Variables.driver_v.findElement(By.id("regSubmitButton")).click();
		
		Variables.driver_v.findElement(By.id("radioOne")).click();
		FCOSourceAPI fcoSourceAPI = new FCOSourceAPI();
		SCTUser user = fcoSourceAPI.updateUserState(Variables.genuser, UserStateEnum.USER_REGISTRATION_VALIDATED.getCode());
		
		login_admin();
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.xpath("//*[@id='dijit_form_Button_6_label']")).click();
		Thread.sleep(500L);
		Variables.driver_v.findElement(By.xpath("//*[@id='dijit_form_TextBox_0']")).sendKeys(Variables.genuser);
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.xpath("//*[@id='dijit_form_Button_5_label']")).click();
		Thread.sleep(1000L);
		Variables.driver_v.findElement(By.linkText("Approve")).click();
		
		Variables.driver_v.switchTo().alert().accept();
		
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.linkText("Promote")).click();
		
		Variables.driver_v.switchTo().alert().accept();
		
		
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
