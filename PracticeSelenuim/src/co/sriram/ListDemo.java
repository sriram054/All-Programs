package co.sriram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListDemo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\TT\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("http://techcanvass.com/Examples/multi-select.html");
		Select listbox = new Select(driver.findElement(By.id("multiselect")));
		listbox.selectByValue("opel");
		listbox.selectByValue("audi");
		WebElement option = listbox.getFirstSelectedOption();
		System.out.println(option.getText());
		List<WebElement> options = listbox.getAllSelectedOptions();
		for (WebElement option2 : options) 
		{
		System.out.println(option2.getText());
		}
		driver.quit();
	}
}
