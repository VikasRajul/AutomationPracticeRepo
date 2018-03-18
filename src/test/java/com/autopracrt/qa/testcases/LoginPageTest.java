package com.autopracrt.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autopract.qa.base.*;
import com.autopract.qa.pages.HomePage;
import com.autopract.qa.pages.LoginPage;
public class LoginPageTest extends TestBase {
	LoginPage loginpage ;
	HomePage homepage;
	public LoginPageTest(){
		super();
	}
	
@BeforeMethod
public void setUp(){
	initialization();
	loginpage = new LoginPage();
		}
   
   @Test
   public void validateLoginTest(){
	   homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));  
   }
  
    
@AfterMethod
public void teardown(){
	driver.quit();
}
	
}
