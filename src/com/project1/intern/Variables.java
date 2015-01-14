package com.project1.intern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Variables {
	/*Normal User*/
	public static String admin_v;
	public static String admin_passwd_v;
	public static String normal_user_v;
	public static String passwd_v;
	public static String user_plan;
	public static int num_poi;
	public static String[] pType;
	public static String rewardPoints;
	public static String rewardPoints2;
	public static String maxRewardPointCap;
	public static String csv;
	public static WebDriver driver_v = new FirefoxDriver();
	
//	public static String admin_v = "fcotry8@gmail.com";
//	public static String admin_passwd_v = "Adas123$";
//	public static String normal_user_v = "sandip.jadhav99@gmail.com";
//	public static String passwd_v = "password123";
//	public static String user_plan = "AGR7";
//	public static int num_poi = 5;
//	public static String[] pType = {"APT", "Bank", "Business Park", "Department Store", "Embassy"};
//	public static String rewardPoints = "6";
//	public static String rewardPoints2 = "8";
//	public static String maxRewardPointCap = "1200";
//	public static String csv = "C:\\Documents and Settings\\krishnva\\My Documents\\My Received Files\\Jammu.csv";
	
	/*General user*/
//	public static String genuser = "pavanvamsi13@gmail.com";
//	public static String gen_passwd = "password123";
//	public static String url = "https://in1xpd-505316/";
//	public static String[] gType = {"APT", "Bank", "Business Park", "Department Store", "Embassy"};
//	public static int gen_poi = 5;
//	public static String g_rewardPoints = "6";
//	public static String g_maxPOI = "8";
//	public static String g_maxRewardPointCap = "1000";
//	public static String csv_g = "C:\\Documents and Settings\\krishnva\\My Documents\\My Received Files\\Jammu.csv";
//	public static String survey_g = "India_pavanvamsi13@gmail.com";
	public static String genuser;
	public static String gen_passwd;
	public static String url;
	public static String[] gType;
	public static int gen_poi;
	public static String g_rewardPoints;
	public static String g_maxPOI;
	public static String g_maxRewardPointCap;
	public static String csv_g;
	public static String survey_g;
	/*Maintenance Plan*/
//	public static int m_poi = 5;
//	public static String[] mType = {"APT", "Bank", "Business Park", "Department Store", "Embassy"};
//	public static String m_rewardPoints = "10";
//	public static String m_nRewardPoints = "10";
//	public static String m_maxRewardPoints = "15";
//	public static String m_totalBudget = "1000";
//	public static String m_plan = "AHM10";
//	public static String maxThreshholdCount = "10";
//	public static String scaleSize = "1:500";
//	public static String subGridSize = "9*9";
//	public static String gridNumbers = "3";
//	public static String statusPlan = "AGR9";
//	public static String csv_m = "C:\\Documents and Settings\\krishnva\\My Documents\\My Received Files\\1_2.csv";
	
	public static int m_poi;
	public static String[] mType;
	public static String m_rewardPoints;
	public static String m_nRewardPoints;
	public static String m_maxRewardPoints;
	public static String m_totalBudget;
	public static String m_plan;
	public static String maxThreshholdCount;
	public static String scaleSize;
	public static String subGridSize;
	public static String gridNumbers;
	public static String statusPlan;
	public static String csv_m;
	
	public static void loadNormalUserProperties()
	{
		Properties prop =  new Properties();
		
		try
		{
			prop.load(new FileInputStream("normaluser.properties"));
			
			admin_v = prop.getProperty("admin_v");
			admin_passwd_v = prop.getProperty("admin_passwd_v");
			normal_user_v = prop.getProperty("normal_user_v");
			passwd_v = prop.getProperty("passwd_v");
			user_plan = prop.getProperty("user_plan");
			num_poi = Integer.parseInt(prop.getProperty("num_poi"));
			pType = prop.getProperty("pType").split(",");
			rewardPoints = prop.getProperty("rewardPoints");
			rewardPoints2 = prop.getProperty("rewardPoints2");
			maxRewardPointCap = prop.getProperty("maxRewardPointCap");
			csv = prop.getProperty("csv");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void loadGeneralUserProperties()
	{
		Properties prop2 = new Properties();
		
		try
		{
			prop2.load(new FileInputStream("generaluser.properties"));
			
			genuser = prop2.getProperty("genuser");
			gen_passwd = prop2.getProperty("gen_passwd");
			url = prop2.getProperty("url");
			gType = prop2.getProperty("gType").split(",");
			gen_poi = Integer.parseInt(prop2.getProperty("gen_poi"));
			g_rewardPoints = prop2.getProperty("g_rewardPoints");
			g_maxPOI = prop2.getProperty("g_maxPOI");
			g_maxRewardPointCap = prop2.getProperty("g_maxRewardPointCap");
			csv_g = prop2.getProperty("csv_g");
			survey_g = prop2.getProperty("survey_g");	
			
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	public static void loadMaintenanceProperties() throws IOException
	{
		Properties prop3 = new Properties();
		
		prop3.load(new FileInputStream("maintenance.properties"));
		
		m_poi = Integer.parseInt(prop3.getProperty("m_poi"));
		mType = prop3.getProperty("mType").split(",");
		m_rewardPoints = prop3.getProperty("m_rewardPoints");
		m_nRewardPoints = prop3.getProperty("m_nRewardPoints");
		m_maxRewardPoints = prop3.getProperty("m_maxRewardPoints");
		m_totalBudget = prop3.getProperty("m_totalBudget");
		m_plan = prop3.getProperty("m_plan");
		maxThreshholdCount = prop3.getProperty("maxThreshholdCount");
		scaleSize = prop3.getProperty("scaleSize");
		subGridSize = prop3.getProperty("subGridSize");
		gridNumbers = prop3.getProperty("gridNumbers");
		statusPlan = prop3.getProperty("statusPlan");
		csv_m = prop3.getProperty("csv_m");
		
	}
	
}
