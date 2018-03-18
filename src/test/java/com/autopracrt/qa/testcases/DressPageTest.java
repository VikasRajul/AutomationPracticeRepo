package com.autopracrt.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autopract.qa.base.TestBase;
import com.autopract.qa.pages.DressesPage;
import com.autopract.qa.pages.HomePage;
import com.autopract.qa.pages.LoginPage;
import com.autopract.qa.pages.PrintedDressPage;
import com.autopract.qa.pages.SummaryPage;

public class DressPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	DressesPage dresspage;
	SummaryPage summaryaage;
	
	public DressPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginpage = new LoginPage(); 
		dresspage = new DressesPage();
		SummaryPage summaryaage = new SummaryPage();
		homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dresspage= homepage.movetodDresses();
		
	}
	
	@Test
	public void clickonitem(){
		summaryaage= dresspage.movetoPrintedDress();
	}
	
	
    @AfterMethod
	public void teardown(){
		driver.quit();
		
	}


}
