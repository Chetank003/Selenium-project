package com.apparelStore.testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apparelStore.config.ConfigProperties;
import com.apparelStore.pages.ApparelStorePage;
import com.apparelStore.pages.SearchResultsPage;
import com.apparelStore.utils.BaseClass;
import com.apparelStore.utils.ExcelConfig;

public class SearchTests extends BaseClass{
	
	@DataProvider
	public Object[][] getData() throws IOException{
		String filePath = ConfigProperties.ConfigClass.testDataPath;
		String sheetName = "searchData";
		return ExcelConfig.readFromExcel(filePath, sheetName);
	}
	
	@Test(dataProvider = "getData")
	public void itemsSearchTest(Hashtable<String, String> data){
		logger = extent.createTest("Verify items search scenarios for Ethnic Store");
		ApparelStorePage apparelStore = new ApparelStorePage(driver);
		String item = data.get("searchItem");
		apparelStore.searchField.sendKeys(item);
		utility.waitTillClickableAndClick(driver, apparelStore.searchBtn);
		SearchResultsPage searchPage = new SearchResultsPage(driver);
		int numItems = searchPage.searchItems.size();
		assertEquals(data.get("NumItemsListed"), String.valueOf(numItems));
	}
	
	@Test
	public void manufacturerTest() {
		logger = extent.createTest("Verify whether the products of the particular manufacturer are displayed for Ethnic Store");
		ApparelStorePage apparelStore = new ApparelStorePage(driver);
		utility.waitTillClickableAndClick(driver, apparelStore.searchBtn);
		SearchResultsPage searchPage = new SearchResultsPage(driver);
		utility.waitTillClickableAndClick(driver, searchPage.fashionManufacturer);
		int numItems = searchPage.searchItems.size();
		assertEquals(7, numItems);
	}
}
