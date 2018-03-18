package com.autopract.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.autopract.qa.base.TestBase;

public class ShippingPage extends TestBase{
	@FindBy(linkText = "(Read the Terms of Service)")
	WebElement termsofService;
	
	@FindBy(xpath = "//a[@title='Close']")
	WebElement termsofServiceClose;
	
	@FindBy(xpath = "//input[@name='cgv']")
	WebElement termsofServiceCheck;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	WebElement proceed;
	
	public ShippingPage(){
		PageFactory.initElements(driver, this);
	}
	
	public PaymentPage acceptTermsOfService(){
		termsofServiceCheck.click();
		termsofService.click();
		termsofServiceClose.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.elementToBeClickable(proceed)).click();
		//proceed.click();
		return new PaymentPage();
}
}
