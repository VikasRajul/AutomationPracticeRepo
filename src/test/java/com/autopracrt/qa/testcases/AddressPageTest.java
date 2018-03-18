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

public class AddressPageTest extends TestBase{
	

	LoginPage loginpage;
	HomePage homepage;
	DressesPage dresspage;
	SummaryPage summaryaage;
	AddressPage addresspage;
	ShippingPage shippingpage;
	public AddressPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginpage = new LoginPage(); 
		dresspage = new DressesPage();
		summaryaage = new SummaryPage();
		 addresspage = new AddressPage();
		 shippingpage = new ShippingPage(); 
		homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dresspage= homepage.movetodDresses();
		summaryaage= dresspage.movetoPrintedDress();
		addresspage = 	summaryaage.summaryofproducts();
	}
	
        @Test
        public void validateAddressTest(){
	   shippingpage = 	addresspage.updateAddress();
     }
	
	
	@AfterMethod
		public void teardown(){
			driver.quit();


}
}