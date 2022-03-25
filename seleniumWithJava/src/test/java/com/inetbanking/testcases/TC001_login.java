package com.inetbanking.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.BaseClass;
import com.inetbanking.pageObjects.loginPage;


public class TC001_login extends BaseClass {
	
	@Test
	public void loginTest() {
		driver.get(baseURL);
		
		loginPage lp = new loginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		
		lp.clickLogin();
		
		String text = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")).getText();
		if(text.equals("Welcome To Manager's Page of GTPL Bank"))
		{
			Assert.assertTrue(true);
		}
		
		else {
			Assert.assertTrue(false);
		} 
		
	}

}
