# Selenium-project
A Test automation project using Selenium tool built on POM design using Maven as build tool and TestNG for tests and generate extent report.

The project "apparelStore" is a test automation project dedicated to test the functionalities of the website "Apparel Store" (url: http://automationpractice.com/index.php) 

Project features: 
1. This project is built on Selenium with POM design pattern and makes use of testNG for testing all the scenarios and maven as the build tool
2. All the test cases, test data, page objects, configurations and utilities are within the package src/test/java
3. In order to run all the test cases we can execute by using testng.xml
4. we can run them on different browsers by specifying the same in testng.xml file
5. The same can be run using pom.xml file using maven clean test
6. These test cases generate an overall report named STMExtentReport.html in the test-output directory with screenshots for failed test cases


Pre-requisites for running test cases: 
Test data: (project_workspace)\apparelStore\src\test\java\com\apparelStore\testData\TestData.xlsx)
1. Test data for account creation tests need to be updated after used.
