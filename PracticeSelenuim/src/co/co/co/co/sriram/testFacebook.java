package co.co.co.co.sriram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testFacebook {
  @Test(dataProvider="getdata")
  public void testData(String uname,String passwd) {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sainadha\\Desktop\\TT\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.facebook.com");
	  WebElement fieldUname=driver.findElement(By.id("email"));
	  fieldUname.clear();
	  fieldUname.sendKeys(uname);
	  WebElement fieldPass=driver.findElement(By.id("pass"));
	  fieldPass.clear();
	  fieldPass.sendKeys(passwd);
  }
  @DataProvider(name="getdata")
  public Object[][] dataFeed()
  {
	Object[][] facebookData = new Object[2][2];  
	facebookData[0][0]="username1@gmail.com";
	facebookData[0][1]="1234567";
	facebookData[1][0]="username2@gmail.com";
	facebookData[1][1]="2345678";
	return facebookData;
  }
}
