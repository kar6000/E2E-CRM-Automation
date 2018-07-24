package com.crm.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.testbase.TestBase;

public class HomePage extends TestBase{
	
	public HomePage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);		
	}

	@FindBy(xpath ="//td[contains(text(),'User:Ipsita kar')]")
	@CacheLookup
	WebElement usernameLabel;	
		
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;	
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;	
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;	
	
	@FindBy(xpath="//a[contains(text(),'Docs')]")
	WebElement docsLink;	
	
	@FindBy(xpath="//a[contains(text(),'Companiess')]")
	WebElement companiesLink;
	
	//Methods
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean varifyCorrectUserName() {
		return usernameLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink() throws FileNotFoundException {
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink() throws FileNotFoundException {
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink() throws FileNotFoundException {
		tasksLink.click();
		return new TasksPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	

}
