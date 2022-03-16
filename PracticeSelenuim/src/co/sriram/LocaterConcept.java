package co.sriram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F"); // enter the url to open
		driver.manage().window().maximize();
		try {
			Thread.sleep(4000);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().fullscreen();
		// 1. By ID==>1 (Priority)
		//driver.findElement(By.id("firstname")).sendKeys("SRIRAM");
		//driver.findElement(By.id("lastname")).sendKeys("MURTHY");
		
		
		// 2. By Xpath ==>2
		/* absolute xpath could not be used==== /html/body
		 * relative Xpath will be useful ==//*[@id="mainContent"]/div[3]/span/a
		
		 * driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Hai");
		 * driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("murthy");
		 * driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("srirammurthy.i@gmail.com");
		 */
		
		//3. By Name ==>3 
		/*
		 * driver.findElement(By.name("firstname")).sendKeys("By Name");
		 * driver.findElement(By.name("lastname")).sendKeys("By Name");
		 */
		
		
		//4. By Link
		/* driver.findElement(By.linkText("Sign in")).click(); */
		
		
		// 5. By Partial Text :: Not Useful
		/* driver.findElement(By.partialLinkText("Rules")).click(); */
		
		
		// 6. By CSSelector ===>2
		/*  if id is there CSS selector is #id 
		 * if class  there  CSS selector is .classname
		 * driver.findElement(By.cssSelector("#Email")).sendKeys(
		 * "srirammurthy.i@gmail.com");
		 */
		
		// 7. By Classname :: Not Useful ==>4 
		/*class name may be same for different elements ...
		 * driver.findElement(By.className("action-link")).click();
		 * driver.manage().window().maximize();
		 */
		
		
		
		
		
		
	}

}
