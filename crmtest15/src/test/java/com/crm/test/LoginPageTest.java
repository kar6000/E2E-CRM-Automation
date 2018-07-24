package com.crm.test;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.testbase.TestBase;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() throws FileNotFoundException{
		super();
		
	}	
	
	@BeforeMethod
	public void setUp() throws FileNotFoundException{
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void loginPageTitleTest() {
		String title=loginPage.validateLoginPageTitle();
		//Assert.assertEquals(title, "Free CRM");
	}
	
	@Test
	public void loginTest() throws FileNotFoundException {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
		
	}	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}	

}
