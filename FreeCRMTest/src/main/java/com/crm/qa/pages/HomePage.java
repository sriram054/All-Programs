package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//span[@class='user-display' and text()='SRIRAM MURTHY ITHINENI']")
	WebElement usernameLabel;
	@FindBy(xpath="//span[contains(text(),'Calendar')]")
	WebElement calendarLink;
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement taskLink;
	
	
	public boolean verifyCorrectUsername()
	{
		return usernameLabel.isDisplayed();
		
	}
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContactsLink()
	{
		contactsLink.click();
		return new ContactsPage();
	}
	public DealsPage clickOnDealsPage()
	{
		dealsLink.click();
		return new DealsPage();
	}
	public TaskPage clickOnTaskLink()
	{
		taskLink.click();
		return new TaskPage();
	}
	
	
}

