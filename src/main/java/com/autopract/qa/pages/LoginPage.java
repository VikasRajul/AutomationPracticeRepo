package com.autopract.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autopract.qa.base.TestBase;

public class LoginPage extends TestBase{
	//Page Factory -- Object Repository
	@FindBy(xpath= "//input[@id ='email']")
	WebElement username;
	
	@FindBy(xpath= "//input[@name ='passwd']")
	WebElement password;
	
	@FindBy(id= "SubmitLogin")
	WebElement signIn;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	

	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		signIn.click();
		return new HomePage();
	}
	

}
