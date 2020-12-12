package com.apparelStore.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apparelStore.objectMap.ObjectRepo;

public class SearchResultsPage {
	WebDriver driver = null;

	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className=ObjectRepo.Search.searchItemsContainer_name)
	public List<WebElement> searchItems;
	
	@FindBy(xpath=ObjectRepo.Search.searchItemsAlert_xpath)
	public WebElement searchAlert;
	
	@FindBy(xpath = ObjectRepo.Search.fashionManufacturer_xpath)
	public WebElement fashionManufacturer;
}
