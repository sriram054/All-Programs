package co.sriram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\TT\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.get("https://www.amazon.in");
		 Thread.sleep(5000);
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("POCO F1");
		 Thread.sleep(3000);
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 driver.findElement(By.linkText("Oppo")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Clear")).click();
		 //driver.quit();
	}
}
