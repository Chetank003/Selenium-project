package com.apparelStore.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.apparelStore.config.ConfigProperties;
import com.apparelStore.pages.AccountsPage;
import com.apparelStore.pages.ApparelStorePage;
import com.apparelStore.pages.ItemPage;
import com.apparelStore.pages.SignInPage;
import com.apparelStore.utils.BaseClass;

public class ReviewTest extends BaseClass {
	
	@Test
	public void writeReviewTest(){
		logger = extent.createTest("Verify review functionality for an item in Ethnic Store");
		ApparelStorePage apparelStore = new ApparelStorePage(driver);
		utility.waitTillClickableAndClick(driver, apparelStore.signInBtn);
		SignInPage signIn = new SignInPage(driver);
		driver = signIn.login(ConfigProperties.ConfigClass.loginEmail, ConfigProperties.ConfigClass.loginPassword);
		utility.implicitDriverWait(driver);
		AccountsPage accountsPage = new AccountsPage(driver);
		utility.waitTillClickableAndClick(driver, accountsPage.homeBtn);
		apparelStore.productContainer.get(0).click();
		ItemPage itemPage = new ItemPage(driver);
		utility.waitTillClickableAndClick(driver, itemPage.reviewBtn);
		itemPage.stars.get(4);		//3-star rating
		itemPage.commentTitle.sendKeys("Review");
		itemPage.commentContent.sendKeys("good");
		utility.waitTillClickableAndClick(driver, itemPage.commentSend);
		boolean commentError = itemPage.commentErrorMsg.isDisplayed();
		assertTrue(commentError);
		utility.waitTillClickableAndClick(driver, itemPage.commentOkBtn);
	}
}
