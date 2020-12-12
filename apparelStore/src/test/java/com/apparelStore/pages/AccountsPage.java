package com.apparelStore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apparelStore.objectMap.ObjectRepo;

public class AccountsPage {
	WebDriver driver = null;
	
	public AccountsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=ObjectRepo.Accounts.userBtn_xpath)
	public WebElement userBtn;
	
	@FindBy(className=ObjectRepo.Accounts.alertMessage_name)
	public WebElement alertMessage;
	
	@FindBy(linkText=ObjectRepo.Accounts.signOutBtn_linkText)
	public WebElement signOutBtn;
	
	@FindBy(className=ObjectRepo.Accounts.signinBtn_name)
	public WebElement signInBtn;
	
	@FindBy(linkText = ObjectRepo.Accounts.homeBtn_linkText)
	public WebElement homeBtn;
	
	public String alertMsgBgColor = "#f3515c";
}
