package com.project1.intern;

import org.openqa.selenium.By;

public class Register {
	
	
	String fname = "Nishant";
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
	
	
	

	Register() throws InterruptedException
	{
		
		Variables.driver_v.get(Variables.url);
		
		Variables.driver_v.manage().window().maximize();
		
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.id("userReg")).click();
		
		Thread.sleep(1000L);
		
		Variables.driver_v.findElement(By.id("name")).sendKeys(Variables.normal_user_v);
		Variables.driver_v.findElement(By.id("pwd")).sendKeys(Variables.passwd_v);
		Variables.driver_v.findElement(By.id("cPwd")).sendKeys(Variables.passwd_v);
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
		
		Thread.sleep(2000L);
		
	
	}
}
