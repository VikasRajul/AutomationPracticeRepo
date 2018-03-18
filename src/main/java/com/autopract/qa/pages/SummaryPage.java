package com.autopract.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autopract.qa.base.TestBase;

public class SummaryPage extends TestBase{

@FindBy(xpath ="//i[@class='icon-plus']")
WebElement plusitem;

@FindBy(xpath ="//input[starts-with(@name, 'quantity_') and @type='text']")
WebElement quantity;

@FindBy(xpath ="//a[@title='Proceed to checkout'][not(@rel='nofollow')]")
WebElement proceed;

public SummaryPage(){
	PageFactory.initElements(driver, this);
}

public AddressPage summaryofproducts(){
	quantity.clear();
	quantity.sendKeys("3");
	plusitem.click();
	proceed.click();
	return new AddressPage();
	
	
}


}
