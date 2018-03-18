package com.autopract.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.autopract.qa.base.TestBase;

public class DressesPage extends TestBase {
	
	@FindBy(xpath="//img[@src='http://automationpractice.com/img/p/8/8-home_default.jpg']")
	WebElement printeddressitem1;
	
	@FindBy(xpath="(//span[text()='Add to cart'])[1]")
	WebElement addtoCart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement proceedchkout;
	
	
	
	public DressesPage(){
		PageFactory.initElements(driver, this);
	}
	
	     
	public SummaryPage movetoPrintedDress(){
		Actions action = new Actions(driver);
		WebElement printeddressitem1 = driver.findElement(By.xpath("//img[@src='http://automationpractice.com/img/p/8/8-home_default.jpg']"));
		action.moveToElement(printeddressitem1).build().perform();
		addtoCart.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
	    WebElement pro=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Proceed to checkout']")));  
		pro.click();
		//proceedchkout.click();
		return new SummaryPage();
	}
}
