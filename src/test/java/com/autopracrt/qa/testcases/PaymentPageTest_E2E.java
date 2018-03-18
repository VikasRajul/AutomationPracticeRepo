package com.autopracrt.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autopract.qa.base.TestBase;
import com.autopract.qa.pages.AddressPage;
import com.autopract.qa.pages.DressesPage;
import com.autopract.qa.pages.FinalPage;
import com.autopract.qa.pages.HomePage;
import com.autopract.qa.pages.LoginPage;
import com.autopract.qa.pages.PaymentPage;
import com.autopract.qa.pages.ShippingPage;
import com.autopract.qa.pages.SummaryPage;

public class PaymentPageTest_E2E extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	DressesPage dresspage;
	SummaryPage summaryaage;
	AddressPage addresspage;
	ShippingPage shippingpage;
	PaymentPage paymentpage;
	FinalPage finalpage;
	
	
	public PaymentPageTest_E2E(){
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
		paymentpage = new PaymentPage();
		finalpage = new FinalPage();
		homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		dresspage= homepage.movetodDresses();
		summaryaage= dresspage.movetoPrintedDress();
		addresspage = 	summaryaage.summaryofproducts();
		shippingpage = 	addresspage.updateAddress();
		paymentpage = shippingpage.acceptTermsOfService();
	}
	
	  @Test
	  public void validateEndToEndTest(){
		  finalpage = paymentpage.selectPaymentOption();
		  System.out.println("Completed E2E flow Successfully");
	  }
	  
	 @AfterTest
	  public void teardown(){
		  driver.quit();
	  }
}
