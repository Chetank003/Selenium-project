package com.apparelStore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apparelStore.objectMap.ObjectRepo;

public class CartPage {
	WebDriver driver = null;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = ObjectRepo.Cart.proceedChkOutBtn_linkText)
	public WebElement proceedChkOutBtn;
	
	@FindBy(name = ObjectRepo.Cart.processAddress_tagName)
	public WebElement processAddress;
	
	@FindBy(name = ObjectRepo.Cart.processCarrier_tagName)
	public WebElement processCarrier;
	
	@FindBy(id = ObjectRepo.Cart.termsChkBox_id)
	public WebElement carrierTermsBtn;
	
	@FindBy(className = ObjectRepo.Cart.PayByBankWire_name)
	public WebElement payByBankWire;
	
	@FindBy(className = ObjectRepo.Cart.PayByCheque_name)
	public WebElement payByCheque;
	
	@FindBy(xpath = ObjectRepo.Cart.confirmOrderBtn_xpath)
	public WebElement confirmOrderBtn;
	
	@FindBy(className = ObjectRepo.Cart.successAlert_name)
	public WebElement orderSuccessAlert;
	
	public final String orderSucessAlertMessage = "Your order on My Store is complete.";
}
