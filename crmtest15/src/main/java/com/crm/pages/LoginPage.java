package com.crm.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.testbase.TestBase;

public class LoginPage extends TestBase {	
	
		public LoginPage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);		
	}

	//Page factory	
	@FindBy(name ="username")
	WebElement username;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type ='submit' and @value ='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath ="//button[contains(text(),'Sign Up']")
	WebElement SignUp;
	
	//Methods	
	public String validateLoginPageTitle() {
		return driver.getPageSource();
	}
	
	public HomePage login(String un, String pwd) throws FileNotFoundException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
		
	}	

 }
