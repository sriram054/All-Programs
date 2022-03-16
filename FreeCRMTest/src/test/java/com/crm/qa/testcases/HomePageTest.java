package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	DealsPage dealsPage;
	public HomePageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
		loginPage=new LoginPage();
		contactsPage=new ContactsPage();
		dealsPage=new DealsPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest()
	{
		String title=homePage.verifyHomePageTitle();
		Assert.assertEquals(title,"Cogmento CRM","HomePage Title Not Matched");
	}
	@Test(priority=2)
	public void verifyUsernameTest()
	{
		Assert.assertTrue(homePage.verifyCorrectUsername());
	}
	@Test
	public void verifyContactLinkTest()
	{
		contactsPage=homePage.clickOnContactsLink();
		
	}
	@Test
	public void verifyDealsPage()
	{
		dealsPage=homePage.clickOnDealsPage();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
