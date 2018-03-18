package com.autopract.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autopract.qa.base.TestBase;

public class PaymentPage extends TestBase {
	
	@FindBy(xpath="//a[@title='Pay by check.']")
	WebElement paymentOptionByCheck;
	
	@FindBy(xpath="//span[text()='I confirm my order']")
	WebElement confirmOrder;

	public PaymentPage(){
		PageFactory.initElements(driver, this);
	}
	
	public FinalPage selectPaymentOption(){
		paymentOptionByCheck.click();
		confirmOrder.click();
		return new FinalPage();
	}

}
