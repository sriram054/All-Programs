package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	 
	//PageFactory -OR
	 @FindBy(xpath="//input[@name='Gemail']")
	 WebElement username;
	 
	 @FindBy(xpath="//input[@name='Gpassword']")
	 WebElement password;
	
	 @FindBy(xpath="//div[text()='Login']")
	 WebElement loginBtn;
	 
	 //@FindBy(xpath="//div[@class='header item']")
	 //WebElement crmLogo;
	 
	 public LoginPage()
	 {
		 PageFactory.initElements(driver,this);
	 }
	 public String validateLoginPageTitle()
	 {
		  return driver.getTitle(); 
	 }
	 
	 /*public boolean validateCRMImage()
	 {
		 return crmLogo.isDisplayed();
	 }*/
	 
	 public HomePage login(String uname,String pwd) throws InterruptedException
	 {
		 	username.sendKeys(uname);
		 	Thread.sleep(1000);
		 	password.sendKeys(pwd);
		 	Thread.sleep(2000);
		 	loginBtn.click();
		 	return new HomePage();
	 }
}
