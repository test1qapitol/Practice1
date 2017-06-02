package test;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Demo {

	@Test(priority=1)
	public void print1()
	{
		Reporter.log("Test Case Failed:Fail", true);
	}
	@Test(priority=3)
	public void print3(){
		Reporter.log("TestCase Pass: Pass",true);
	}
	@Test(priority=2)
	public void print2(){
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in");
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "Goog");
		
		/*SoftAssert s= new SoftAssert();
		s.assertEquals(title, "Goog");
		s.assertAll();*/
		
		Reporter.log("Test fail",true);
	}
	
}
