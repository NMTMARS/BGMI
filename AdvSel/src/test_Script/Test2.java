package test_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_Script.Pom2;

public class Test2 
{
	@Test
	public void validLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./bhagesh/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Pom2 p2=new Pom2(driver);
		p2.UntBox("admin");
		Thread.sleep(2000);
		p2.PwdTBox("manager");
		Thread.sleep(2000);
		p2.clickLogin();
		
		
	}

}
