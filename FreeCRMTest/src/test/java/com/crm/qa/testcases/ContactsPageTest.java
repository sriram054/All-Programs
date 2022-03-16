package com.crm.qa.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	String sheetname="Contact";
	public ContactsPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
		loginPage=new LoginPage();
		contactsPage=new ContactsPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		contactsPage=homePage.clickOnContactsLink();
	}

	/*
	 * @Test(priority=1) public void verifyContactsPageLabel() {
	 * Assert.assertTrue(contactsPage.verifyContactsLabel()); }
	 * 
	 * @Test(priority=2) public void selectSingleContactTest() {
	 * System.out.println(contactsPage.selectContacts("MURTHY SRIRAM")); }
	 */
	@DataProvider
	public Object[][] getCRMTestData()
	{
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
	}
	@Test(dataProvider="getCRMTestData")
	public void validateCreateNewContact(String Firstname,String Lastname) throws InterruptedException
	{
		contactsPage.createNewContact(Firstname,Lastname);
	}
	/*@Test(priority=1)
	public void selectMultipleContactTest()
	{	
		contactsPage.selectContacts("MURTHY SRIRAM");
		//contactsPage.selectContacts("ITHINENI SRIRAM");
	}
	
	*/
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	} 
	
	
	
	
	
	
	
	
	
	
}
