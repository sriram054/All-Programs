package co.sriram;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		Alert alert= driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.print(alert.getText());
		String msg=alert.getText();
		if (msg.equals("Please enter a valid user name"))
		{
			System.out.println("Correct Message");
			
		}
		else 
		{
			System.out.println("Incorrect Error Msg");
		}
		alert.accept();
		
		
	}

}
