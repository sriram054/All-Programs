package co.sriram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prcticesession1 {

	public static void main(String[] args) {
		//chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		/*
		//validation point
		String title = driver.getTitle();
		System.out.print(title);
		
		// get the current url 
		System.out.print(driver.getCurrentUrl());
		
		
		//get the full page source
		System.out.print(driver.getPageSource());
		
		// to quit from browser
		driver.quit();*/
	
		
	}
}
