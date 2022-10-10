package com.May2022.qa.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaseBrowser {
	
	public static WebDriver driver;
	 public void InitialiseBrowser (String Browser) {
		 
		 if(Browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			  driver = new ChromeDriver();
		 } else if (Browser.equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.gecko.driver", "C:\\chromedriver\\geckodriver.exe");
			 driver = new FirefoxDriver();
		} else {
			System.out.println("Browser not fond");
		}
		 
		 driver.get("http://automationpractice.com/index.php");
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 
	 }

}
