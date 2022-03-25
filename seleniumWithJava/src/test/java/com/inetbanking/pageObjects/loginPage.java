package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver ldriver;
	
	public loginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	WebElement btnlogin;
	
	public void setUserName(String name)
	{
		txtusername.sendKeys(name);
	}
	
	public void setPassword(String password)
	{
		txtpassword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btnlogin.click();
	}
}
