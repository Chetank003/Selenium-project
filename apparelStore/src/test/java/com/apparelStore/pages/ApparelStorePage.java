package com.apparelStore.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apparelStore.objectMap.ObjectRepo;

public class ApparelStorePage {
	WebDriver driver = null;
	
	public ApparelStorePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className=ObjectRepo.MyStore.signinBtn_name)
	public WebElement signInBtn;
	
	@FindBy(id=ObjectRepo.MyStore.searchField_id)
	public WebElement searchField;
	
	@FindBy(className=ObjectRepo.MyStore.searchFieldBtn_name)
	public WebElement searchBtn;
	
	@FindBy(className = ObjectRepo.MyStore.productContainer_name)
	public List<WebElement> productContainer;
	
	@FindBy(xpath = ObjectRepo.MyStore.cartAccess_xpath)
	public WebElement accessCart;
}
