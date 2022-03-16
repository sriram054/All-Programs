package co.sriram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sampleClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sainadha\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.edureka.co");
		WebElement login=driver.findElement(By.xpath("//header/nav[1]/ul[1]/li[4]/span[1]"));
		login.click(); 
		Thread.sleep(4000);
		WebElement username=driver.findElement(By.id("si_popup_email"));
		username.sendKeys("srirammurthy.i@gmail.com");
		WebElement password=driver.findElement(By.id("si_popup_passwd"));
		password.sendKeys("Srirammurthy@054");
		Thread.sleep(4000);
		WebElement next=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		next.click();
		Thread.sleep(2000);
		WebElement dropdownmenu= driver.findElement(By.className("img30"));
		dropdownmenu.click();
		Thread.sleep(2000);
		WebElement  myprofile=driver.findElement(By.linkText("My Profile"));
		myprofile.click();
		Thread.sleep(2000);
		WebElement myprofileIcon=driver.findElement(By.xpath("//div[@class='personal-details']//i[@class='icon-pr-edit']"));
		myprofileIcon.click();
		Thread.sleep(4000);

		WebElement nameEle=driver.findElement(By.xpath("//input[@id='fullName']"));
		nameEle.clear();
		nameEle.sendKeys("SRIRAM MURTHY");
		WebElement savebtn=driver.findElement(By.cssSelector("body.autofoot.banner_class_body:nth-child(2) section.onboarding-p2.step-1:nth-child(2) div.stepper-section div.container div.step-item:nth-child(1) > button.btn.btn-default.btn-lg.btn-save.pull-right"));
		savebtn.click();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'SUBMIT')]")));
		action.click();
		action.build().perform();
		driver.navigate().to("www.facebook.com");
		driver.navigate().back();
		
		/*action.click();
		action.build().perform();
		action.doubleClick();
		action.
		action.sendKeys("SRIRAM MURTHY");
		action.build().perform();
		//fullName.sendKeys("SRIRAM MURTHY");
		//WebElement Save=driver.findElement(By.className("btn btn-default btn-lg btn-save pull-right"));
		//Save.click();
		/*WebElement Search=driver.findElement(By.xpath();
		Search.sendKeys("Selenium");
		WebElement searchBtn=driver.findElement(By.cssSelector("body.footer-sticky-btm:nth-child(2) div.page-wrapper:nth-child(14) header.hdv2_main.header_edureka.withoffer:nth-child(7) nav.navbar-homepage.navbar.navbar-fixed-top.navbar-inverse div.menubar-visibility.clp-head-flow ul.list-unstyled.course-search-box-nav:nth-child(2) li.search-nav span:nth-child(2) form.visible-lg.visible-md.visible-sm.visible-xs div.typeahead__container span.typeahead__button.new_search_typeahead_button > i.fa.fa-search.search_ico.trackButton:nth-child(1)"));
		searchBtn.click();
		*/
	}

}
