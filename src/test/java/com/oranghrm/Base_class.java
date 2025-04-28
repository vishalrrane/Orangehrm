package com.oranghrm;

import org.testng.annotations.Test;

import utilities.Readconfig;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Base_class {

	
	Readconfig readconfig = new Readconfig();
	
	public  String base_url = readconfig.geturl();
	public  String chromepath = readconfig.chromepath();
	public String uname = readconfig.getusername();
	public String password = readconfig.getpassword();

	public static WebDriver driver;
	public static Logger logger;

	public  void Initialization() {

		System.setProperty("webdriver.chrome.driver",chromepath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    logger = Logger.getLogger("Swag Labs");
		PropertyConfigurator.configure("C://Users//ADMIN//eclipse-workspace//oranghrm//log4j.properties");
		
	}

	public  void closing() {
		driver.quit();

	}

}
