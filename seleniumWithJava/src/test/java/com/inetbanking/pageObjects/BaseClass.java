package com.inetbanking.pageObjects;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.beust.jcommander.Parameter;
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
	
	@Parameters("Browser")
	@BeforeClass
	public void setup(String br)
	{
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Testing_Practises\\Selenium_using_Java\\seleniumWithJava\\driver\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", rc.getChromePath());
			driver = new ChromeDriver();
		}
		
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\Testing_Practises\\Selenium_using_Java\\seleniumWithJava\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\Testing_Practises\\Selenium_using_Java\\seleniumWithJava\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(baseURL);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
