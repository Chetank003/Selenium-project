package com.apparelStore.config;

public class ConfigProperties {
	public static class ConfigClass{
		public static final String storeUrl = "http://automationpractice.com/index.php";
		public static final String loginEmail = "testaccount@email.com";
		public static final String loginPassword = "testaccount";
		public static final String chromeDriverPath = "./drivers/chromedriver.exe";
		public static final String ieDriverPath = "./drivers/IEDriverServer.exe";
		public static final String firefoxDriverPath = "./drivers/geckodriver.exe";
		public static final String testDataPath = System.getProperty("user.dir") + "/src/test/java/com/apparelStore/testdata/TestData.xlsx";
	}
}
