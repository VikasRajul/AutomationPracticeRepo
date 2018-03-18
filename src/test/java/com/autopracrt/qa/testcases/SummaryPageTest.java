package com.autopracrt.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autopract.qa.base.TestBase;
import com.autopract.qa.pages.AddressPage;
import com.autopract.qa.pages.DressesPage;
import com.autopract.qa.pages.HomePage;
import com.autopract.qa.pages.LoginPage;
import com.autopract.qa.pages.ShippingPage;
import com.autopract.qa.pages.SummaryPage;

public class SummaryPageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	DressesPage dresspage;
	SummaryPage summaryaage;
	AddressPage addresspage;
	
	public SummaryPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginpage = new LoginPage(); 
		dresspage = new DressesPage();
		summaryaage = new SummaryPage();
		 addresspage = new AddressPage();
		homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dresspage= homepage.movetodDresses();
		summaryaage= dresspage.movetoPrintedDress();
		
	}
	

	
	@Test
	public void validateSummaryPageTest(){
		addresspage = 	summaryaage.summaryofproducts();
	
	}
	
        @AfterMethod
		public void teardown(){
			driver.quit();
			
		}
}
