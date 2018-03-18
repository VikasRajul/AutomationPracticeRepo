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

public class PrintedDressTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	DressesPage dresspage;
	PrintedDressPage printeddresspage;
	SummaryPage summarypage;
	
	public PrintedDressTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginpage = new LoginPage(); 
		dresspage = new DressesPage();
		printeddresspage = new PrintedDressPage();
		summarypage = new SummaryPage(); 
		homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dresspage= homepage.movetodDresses();
		
		
	}
	
	@Test
	public void validateaddToCart() throws InterruptedException{
		Thread.sleep(5000);
		//printeddresspage= dresspage.movetoPrintedDress();
		summarypage = printeddresspage.AddToCart();
	}
	
	
	//@AfterMethod
	public void Teardown(){
		driver.quit();
		
	}

}
