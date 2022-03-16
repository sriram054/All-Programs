package co.co.co.co.sriram;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class readExcelDemo 
{
	WebDriver driver;
	@Test(dataProvider="getdata")
	public void testScript(String username,String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement fieldUname=driver.findElement(By.id("email"));
		fieldUname.clear();
		fieldUname.sendKeys(username);
		WebElement fieldPass=driver.findElement(By.id("pass"));
		fieldPass.clear();
		fieldPass.sendKeys(password);
		
	}
	@DataProvider(name="getdata")
	public Object[][] dataFeed() throws FileNotFoundException
	{
			readExcel config= new readExcel("C:\\Users\\Sainadha\\Desktop\\sample.xlsx");
			int rows= config.getRowCount(0);
			System.out.print(rows);
			Object[][] credentials= new Object[rows][2];
			for(int i=0;i<rows;i++)
			{
				credentials[i][0]=config.getData(0,i,0);
				credentials[i][1]=config.getData(0,i,1);
			}
			return credentials;
	}

}
