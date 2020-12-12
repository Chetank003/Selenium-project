package com.apparelStore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apparelStore.objectMap.ObjectRepo;

public class SignInPage {
	WebDriver driver = null;
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id=ObjectRepo.SignIn.createAccountEmail_id)
	public WebElement createAccountEmail;
	
	@FindBy(id=ObjectRepo.SignIn.createAccountBtn_id)
	public WebElement createAccountBtn;
	
	@FindBy(id=ObjectRepo.SignIn.loginEmail_id)
	public WebElement loginEmail;
	
	@FindBy(id=ObjectRepo.SignIn.loginPassword_id)
	public WebElement loginPassword;
	
	@FindBy(id=ObjectRepo.SignIn.loginBtn_id)
	public WebElement loginBtn;
	
	@FindBy(className=ObjectRepo.Accounts.alertMessage_name)
	public WebElement alertMessage;
	
	public void verifyEmial(String email) {
		createAccountEmail.sendKeys(email);
		createAccountBtn.click();
	}
	
	public WebDriver login(String email, String password) {
		loginEmail.sendKeys(email);
		loginPassword.sendKeys(password);
		loginBtn.click();
		return driver;
	}
}
