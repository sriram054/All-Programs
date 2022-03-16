package co.sriram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.naukri.com/");
		String Parent=driver.getWindowHandle();
		Set <String> s=driver.getWindowHandles();
		Iterator <String> I1=s.iterator();
		while(I1.hasNext())
		{
			String child_window=I1.next();
			if(!Parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		//driver.quit();

	}

}
