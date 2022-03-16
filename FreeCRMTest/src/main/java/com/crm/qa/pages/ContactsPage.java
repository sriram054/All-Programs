package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	@FindBy(xpath="//span[@class='item-text' and text()='Contacts']")
	WebElement contactsLabel;
	@FindBy(xpath="//button[@class='ui linkedin button']//i[@class='edit icon']")
	WebElement newContactButton;
	@FindBy(xpath="//input[@name='first_name']")
	WebElement First_Name;
	@FindBy(xpath="//input[@name='last_name']")
	WebElement Last_Name;
	@FindBy(xpath="//button[@class='ui linkedin button']//i[@class='save icon']")
	WebElement savebtn;
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyContactsLabel()
	{
		return contactsLabel.isDisplayed();
	}
	public String selectContacts(String name)
	{
			return driver.findElement(By.xpath("//a[text()='"+name+"']")).getText();
	}
	
	public void createNewContact(String fname,String lname) throws InterruptedException
	{
		newContactButton.click();
		First_Name.sendKeys(fname);
		Last_Name.sendKeys(lname);
		Thread.sleep(4000);
		savebtn.click();
		Thread.sleep(4000);
	}

}
