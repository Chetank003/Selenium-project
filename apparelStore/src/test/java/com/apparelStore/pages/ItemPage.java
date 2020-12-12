package com.apparelStore.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apparelStore.objectMap.ObjectRepo;

public class ItemPage {
	WebDriver driver = null;
	
	public ItemPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = ObjectRepo.Item.reviewItem_linkText)
	public WebElement reviewBtn;
	
	@FindBy(xpath = ObjectRepo.Item.addToCartBtn_xpath)
	public WebElement addToCartBtn;
	
	@FindBy(className = ObjectRepo.Item.continueShoppingBtn_name)
	public WebElement continueShoppingBtn_name;
	
	@FindBy(className = ObjectRepo.Item.stars_name)
	public List<WebElement> stars;
	
	@FindBy(id = ObjectRepo.Item.commentTitle_id)
	public WebElement commentTitle;
	
	@FindBy(id = ObjectRepo.Item.commentContent_id)
	public WebElement commentContent;
	
	@FindBy(id = ObjectRepo.Item.commentSendBtn_id)
	public WebElement commentSend;
	
	@FindBy(xpath = ObjectRepo.Item.commentCheck_xpath)
	public WebElement commentCheckText;
	
	@FindBy(xpath = ObjectRepo.Item.commentOkBtn_xpath)
	public WebElement commentOkBtn;
	
	@FindBy(id = ObjectRepo.Item.commentErrorMsg_id)
	public WebElement commentErrorMsg;
	
	@FindBy(className = ObjectRepo.Item.homeBtn_name)
	public WebElement homeBtn;
	
	@FindBy(xpath = ObjectRepo.Item.pinterestBtn_xpath)
	public WebElement pinterestBtn;
	
	@FindBy(xpath = ObjectRepo.Item.googlePlusBtn_xpath)
	public WebElement googlePlusBtn;
	
	@FindBy(xpath = ObjectRepo.Item.facebookShareBtn_xpath)
	public WebElement facebookShareBtn;
}
