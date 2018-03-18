package com.autopract.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.autopract.qa.base.TestBase;

public class PrintedDressPage extends TestBase{
	
	@FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantity;
	
	@FindBy(xpath = "//select[@name='group_1']")
    WebElement size;
	
	@FindBy(xpath = "//button[@name='Submit']")
    WebElement submit;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
    WebElement proceed;
	
	public PrintedDressPage(){
		PageFactory.initElements(driver, this);
	}
	
    public SummaryPage AddToCart(){
    	WebElement fr = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
    	driver.switchTo().frame(fr);
    	quantity.sendKeys("2");
    	Select sel = new Select(size);
    	sel.selectByVisibleText("M");
    	submit.click();
    	proceed.click();
    	driver.switchTo().defaultContent();

    	return new SummaryPage();
    	
  }


}
