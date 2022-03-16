package co.sriram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshotConcept {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		driver.get("https://www.google.co.in");
		
		//Take Screenshot and store in file format.
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// now copy the screenshot to desired Location.
		
		FileUtils.copyFile(src,new File("C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\google.jpeg"));
		
		
	}

}
