package co.sriram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ListenerMainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		EventFiringWebDriver eventhandler=new EventFiringWebDriver(driver);
		EventCapture ecapture=new EventCapture();
		eventhandler.register(ecapture);
		eventhandler.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		WebElement element = eventhandler.findElement(By.name("q"));
		element.sendKeys("BrowserStack");
		element.submit();
		System.out.println(driver.getTitle());
		eventhandler.unregister(ecapture);
		driver.quit();
		/*eventhandler.findElement(By.linkText("Software Testing")).click();
		Thread.sleep(2000);
		eventhandler.navigate().to("https://www.edureka.co/all-courses");
		Thread.sleep(2000);
		eventhandler.navigate().back();
		Thread.sleep(2000);
		eventhandler.navigate().forward();
		Thread.sleep(2000);
		eventhandler.close();
		eventhandler.unregister(ecapture);
		System.out.println("End of Event Handler");*/
	}

}
