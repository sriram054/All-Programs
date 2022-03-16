package co.sriram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.ebay.com");
		
		// Implicit Wait is the Dynamic Wait.
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS); // we are giving time for the webpage to load.
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // we are giving time for the elements in webpage to load
		//implicit wait is used to load some components in the webpage after webpage is loaded.
		// for example two drop down are there one is state and another is city. based on the state the second drop down need to be updated
		//based on the state..
		// Thread.sleep(30) means will wait for 30 seconds even after the elements is loaded.
		// Thread.sleep(0) is the static wait
		
		
	}

}
