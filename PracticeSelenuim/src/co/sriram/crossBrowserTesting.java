package co.sriram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTesting 
{
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception	
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Sainadha\\Desktop\\TT\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			System.out.println(Thread.currentThread().getId());
				
		}
		else if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println(Thread.currentThread().getId());
		}
		else if (browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Sainadha\\Desktop\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else
		{
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void testParameterWithXml() throws InterruptedException
	{
		driver.get("http://www.edureka.co");
		WebElement login=driver.findElement(By.xpath("//span[@data-button-name=\"Login\"]"));
		login.click(); 
		Thread.sleep(4000);
		WebElement username=driver.findElement(By.id("si_popup_email"));
		username.sendKeys("srirammurthy.i@gmail.com");
		String val = username.getAttribute("value");
	    System.out.println("Entered text is: " + val);
		WebElement password=driver.findElement(By.id("si_popup_passwd"));
		password.sendKeys("Srirammurthy@054");
		Thread.sleep(4000);
		WebElement next=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		next.click();
		String btn_color=next.getCssValue("color");
		System.out.println(btn_color);
		Thread.sleep(4000);
		//WebElement Search=driver.findElement(By.cssSelector(null))
		
	}
	

}
