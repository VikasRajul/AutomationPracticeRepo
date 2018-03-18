package com.autopract.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autopract.qa.base.TestBase;

public class AddressPage extends TestBase{
	
	@FindBy(xpath = "(//span[text()='Update'])[2]")
	WebElement updatebtn;
	
	@FindBy(xpath = "//input[@id='phone']")
	WebElement homephone;
	
	@FindBy(xpath = "//textarea[@name='other']")
	WebElement additionalinfo;
	
	@FindBy(xpath = "//button[@name='submitAddress']")
	WebElement saveaddress;
	
	@FindBy(xpath = "//textarea[@name='message']")
	WebElement message;
	
	@FindBy(name = "processAddress")
	WebElement proceed;
	
	public AddressPage(){
		PageFactory.initElements(driver, this);
	}
	
	public ShippingPage updateAddress(){
		updatebtn.click();
		homephone.clear();
		homephone.sendKeys("9087654321");
		additionalinfo.clear();
		additionalinfo.sendKeys("This is a Automation Practice program");
		saveaddress.click();
		message.sendKeys("I am using Page Object Model to develope the framework using TestNG and Maven Tools");
		proceed.click();
		return new ShippingPage();
	}

}
