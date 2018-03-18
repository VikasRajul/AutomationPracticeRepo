package com.autopracrt.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autopract.qa.base.TestBase;
import com.autopract.qa.pages.DressesPage;
import com.autopract.qa.pages.HomePage;
import com.autopract.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	DressesPage dresspage;
	
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginpage = new LoginPage(); 
		dresspage = new DressesPage();
		homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void validateDressPageTest(){
		dresspage= homepage.movetodDresses();
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
		
	}

}
