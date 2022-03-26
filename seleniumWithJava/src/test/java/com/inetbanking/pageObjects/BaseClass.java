package com.inetbanking.pageObjects;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {
	public String baseURL = "https://demo.guru99.com/V1/index.php";
	public String username = "mngr394861";
	public String password = "bYbEsuq";
	//ReadConfig rc = new ReadConfig();
	//public String baseURL = rc.getBaseURL();
	//public String username = rc.getUserName();
	//public String password = rc.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Testing_Practises\\Selenium_using_Java\\seleniumWithJava\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", rc.getChromePath());
		driver = new ChromeDriver();
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
