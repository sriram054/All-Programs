package co.sriram;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); // for maximizing the window
		
		driver.manage().deleteAllCookies(); // for deleting the cookies , fresh launch
		driver.get("https://stmarysguntur.com/"); 
		Actions action = new Actions(driver); // Mouse Events are handled by Actions Class
		action.moveToElement(driver.findElement(By.linkText("Approvals"))).build().perform(); // build and perform is used with action object
		Thread.sleep(3000); // we need to give some time for showing the content...
		driver.findElement(By.linkText("Government Orders")).click();

	}

}
