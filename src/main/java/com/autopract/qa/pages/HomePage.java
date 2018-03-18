package com.autopract.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autopract.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="(//a[@title= 'Dresses'])[2]")
	WebElement dressesmainmenu;
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
		public DressesPage movetodDresses() {
		dressesmainmenu.click();
		return new DressesPage();
	}
}
