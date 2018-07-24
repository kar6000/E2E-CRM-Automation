package com.crm.test;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.pages.ContactsPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.testbase.TestBase;
import com.crm.utility.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;	
	ContactsPage contactsPage;
	TestUtil testUtil;

	public HomePageTest() throws FileNotFoundException {
		super();		
	}
	
	@BeforeMethod
	public void setUp() throws FileNotFoundException{
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));		
	}
	
	@Test(enabled =false)
	public void varifyHomePageTitleTest() {
		String homePageTitle= homePage.verifyHomePageTitle();
		//Assert.assertEquals(homePageTitle, "CRMPRO","Homepage title not matched");
		}
	@Test
	public void verifyUserNameTest() {
		homePage.varifyCorrectUserName();
		testUtil.switchToFrame();
		Assert.assertTrue(homePage.varifyCorrectUserName());
		
	}
	@Test
	public void verifyContactsLinkTest() throws FileNotFoundException {
		testUtil.switchToFrame();
		contactsPage=homePage.clickOnContactsLink();
		
	}
		
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
