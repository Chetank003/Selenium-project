package com.apparelStore.testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import com.apparelStore.config.ConfigProperties;
import com.apparelStore.pages.AccountsPage;
import com.apparelStore.pages.ApparelStorePage;
import com.apparelStore.pages.SignInPage;
import com.apparelStore.utils.BaseClass;

public class LoginLogOffTest extends BaseClass{
	
	@Test
	public void validLoginTest(){
		logger = extent.createTest("Verify valid Login for Ethnic Store");
		ApparelStorePage apparelStore = new ApparelStorePage(driver);
		utility.waitTillClickableAndClick(driver, apparelStore.signInBtn);
		SignInPage signIn = new SignInPage(driver);
		driver = signIn.login(ConfigProperties.ConfigClass.loginEmail, ConfigProperties.ConfigClass.loginPassword);
		utility.implicitDriverWait(driver);
		AccountsPage accountsPage = new AccountsPage(driver);
		boolean loginResult = accountsPage.userBtn.isDisplayed();
		assertEquals(loginResult, true);
	}
	
	@Test
	public void invalidLoginTest(){
		logger = extent.createTest("Verify invalid Login for Ethnic Store");
		ApparelStorePage apparelStore = new ApparelStorePage(driver);
		utility.waitTillClickableAndClick(driver, apparelStore.signInBtn);
		SignInPage signIn = new SignInPage(driver);
		driver = signIn.login(ConfigProperties.ConfigClass.loginEmail, "dfgsdg");
		utility.implicitDriverWait(driver);
		AccountsPage accountsPage = new AccountsPage(driver);
		boolean loginResult = accountsPage.alertMessage.isDisplayed();
		String alertBgColor = Color.fromString(accountsPage.alertMessage.getCssValue("background-color")).asHex();
		assertEquals(accountsPage.alertMsgBgColor, alertBgColor);
		assertEquals(loginResult, true);
	}
	
	@Test
	public void logOffTest() throws InterruptedException {
		logger = extent.createTest("Verify logoff for Ethnic Store");
		ApparelStorePage apparelStore = new ApparelStorePage(driver);
		utility.waitTillClickableAndClick(driver, apparelStore.signInBtn);
		SignInPage signIn = new SignInPage(driver);
		driver = signIn.login(ConfigProperties.ConfigClass.loginEmail, ConfigProperties.ConfigClass.loginPassword);
		utility.implicitDriverWait(driver);
		AccountsPage accountsPage = new AccountsPage(driver);
		boolean loginResult = accountsPage.userBtn.isDisplayed();
		assertEquals(loginResult, true);
		utility.waitTillClickableAndClick(driver, accountsPage.signOutBtn);
		boolean signOutResult = accountsPage.signInBtn.isDisplayed();
		assertEquals(signOutResult, true);
	}
}
