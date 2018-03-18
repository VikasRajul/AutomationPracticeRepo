package com.autopracrt.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GitLogin {
    WebDriver driver;
    @Parameters("browser")
		@BeforeTest
	public  void setup(String brow){
	if(brow.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
	}else if(brow.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", "Resources/geckodriver64bit.exe");
		driver = new FirefoxDriver();
	}else if(brow.equals("ie")){
		System.setProperty("webdriver.ie.driver", "Resources/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	
	
		
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
	}
	@Test
	public void login()
	{
		driver.findElement(By.id("login_field")).sendKeys("UserVikas");
		driver.findElement(By.name("password")).sendKeys("Password");
		driver.findElement(By.name("password")).submit();
	}
    @AfterTest
	public  void teardown() throws InterruptedException{
    	Thread.sleep(4000);
    	driver.quit();
    }
}
