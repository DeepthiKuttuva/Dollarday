package com.dollardays.testcases;


import org.testng.annotations.Test;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.CreatePage;
//import com.dollardays.pages.LoginPage;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.JsonReader;
import com.dollardays.utilities.TestUtil;
import com.dollardays.utilities.VideoRecorder_utlity;
import com.dollardays.commons.BrowserUtil;

public class CreateTestcase extends BaseTest{

	@DDDataProvider(datafile = "testdata/testdata2.xlsx", sheetName = "Sheet1",  testcaseID = "TC1", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void invokeCreate(Hashtable<String, String> datatable) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "create testcase with already existing account");
		Thread.sleep(1000);
		CreatePage createPage = new CreatePage(driver);
		createPage.create(datatable.get("FirstName"),datatable.get("LastName"),datatable.get("Email"),datatable.get("Phone"), Base64.decrypt(datatable.get("Password")),Base64.decrypt(datatable.get("ConfirmPassword")));
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,0)");
		createPage.captureScreenShot(driver,"Create"," Create_TC1_Screenshots");
		//createPage.takeSnapShot("TC1","DollarDays\\Screenshots\\CreateAccount");
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}
	@DDDataProvider(datafile = "testdata/testdata2.xlsx", sheetName = "Sheet1",  testcaseID = "TC2", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void invokeCreate1(Hashtable<String, String> datatable1) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "create testcase with null data");
		Thread.sleep(1000);
		CreatePage createPage = new CreatePage(driver);
		createPage.create(datatable1.get("FirstName"),datatable1.get("LastName"),datatable1.get("Email"),datatable1.get("Phone"), Base64.decrypt(datatable1.get("Password")),Base64.decrypt(datatable1.get("ConfirmPassword")));
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,0)");
		createPage.captureScreenShot(driver,"Create"," Create_TC2_Screenshots");
		//createPage.takeSnapShot("TC1","DollarDays\\Screenshots\\CreateAccount");
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}
	@DDDataProvider(datafile = "testdata/testdata2.xlsx", sheetName = "Sheet1",  testcaseID = "TC3", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void invokeCreate2(Hashtable<String, String> datatable1) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "create testcase with invalid data");
		Thread.sleep(1000);
		CreatePage createPage = new CreatePage(driver);
		createPage.create(datatable1.get("FirstName"),datatable1.get("LastName"),datatable1.get("Email"),datatable1.get("Phone"), Base64.decrypt(datatable1.get("Password")),Base64.decrypt(datatable1.get("ConfirmPassword")));
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,0)");
		createPage.captureScreenShot(driver,"Create"," Create_TC3_Screenshots");
		//createPage.takeSnapShot("TC1","DollarDays\\Screenshots\\CreateAccount");
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}
	@DDDataProvider(datafile = "testdata/testdata2.xlsx", sheetName = "Sheet1",  testcaseID = "TC4", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void invokeCreate3(Hashtable<String, String> datatable1) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "create testcase with names bigger than 65 characters");
		Thread.sleep(1000);
		CreatePage createPage = new CreatePage(driver);
		createPage.create(datatable1.get("FirstName"),datatable1.get("LastName"),datatable1.get("Email"),datatable1.get("Phone"), Base64.decrypt(datatable1.get("Password")),Base64.decrypt(datatable1.get("ConfirmPassword")));
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,0)");createPage.captureScreenShot(driver,"Create"," Create_TC4_Screenshots");
		//createPage.takeSnapShot("TC1","DollarDays\\Screenshots\\CreateAccount");
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}
}