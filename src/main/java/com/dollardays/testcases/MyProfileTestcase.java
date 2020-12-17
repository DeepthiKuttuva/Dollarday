package com.dollardays.testcases;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.LoginPage;
import com.dollardays.pages.MyProfile;
import com.dollardays.pages.SignInPage;
import com.dollardays.pages.AccountOverview;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.JsonReader;
import com.dollardays.utilities.TestUtil;
import com.dollardays.utilities.VideoRecorder_utlity;
import com.dollardays.commons.*;

public class MyProfileTestcase  extends BaseTest{

	@DDDataProvider(datafile = "testdata/testdata4.xlsx", sheetName = "Sheet1",  testcaseID = "TC1", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void invokeMyProfile(Hashtable<String, String> datatable) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "valid MyProfile testcase");
		ExtentTestManager.getTest().log(Status.INFO, "Editing the Login Information with valid details");
		ExtentTestManager.getTest().log(Status.INFO, "Editing The Personal information with valid details");
		ExtentTestManager.getTest().log(Status.INFO, "Editing the Email Preferences");
		Thread.sleep(1000);
		MyProfile MyProfilePage = new MyProfile(driver);
		//accountoverviewPage.signIn(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		MyProfilePage.myProfile(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")), Base64.decrypt(datatable.get("CurrentPassword")), Base64.decrypt(datatable.get("NewPassword")), Base64.decrypt(datatable.get("RepeatedPassword")), datatable.get("Firstname"), datatable.get("Lastname"), datatable.get("Ext"), datatable.get("SecondaryNumber"));
		//String title ="www.dollardays.com says";
		//accountoverviewPage.getHandleToWindow(driver driver, String title);
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}
	
	@DDDataProvider(datafile = "testdata/testdata4.xlsx", sheetName = "Sheet1",  testcaseID = "TC2", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void invokeMyProfile1(Hashtable<String, String> datatable) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "Null MyProfile testcase");
		ExtentTestManager.getTest().log(Status.INFO, "Editing the Login Information with null details");
		ExtentTestManager.getTest().log(Status.INFO, "Editing The Personal information with null details");
		ExtentTestManager.getTest().log(Status.INFO, "Editing the Email Preferences");
		Thread.sleep(1000);
		MyProfile MyProfilePage = new MyProfile(driver);
		//accountoverviewPage.signIn(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		MyProfilePage.myProfile(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")), Base64.decrypt(datatable.get("CurrentPassword")), Base64.decrypt(datatable.get("NewPassword")), Base64.decrypt(datatable.get("RepeatedPassword")), datatable.get("Firstname"), datatable.get("Lastname"), datatable.get("Ext"), datatable.get("SecondaryNumber"));
		//String title ="www.dollardays.com says";
		//accountoverviewPage.getHandleToWindow(driver driver, String title);
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}
	
	@DDDataProvider(datafile = "testdata/testdata4.xlsx", sheetName = "Sheet1",  testcaseID = "TC3", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void invokeMyProfile2(Hashtable<String, String> datatable) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "Invalid MyProfile testcase");
		ExtentTestManager.getTest().log(Status.INFO, "Editing the Login Information with invalid details");
		ExtentTestManager.getTest().log(Status.INFO, "Editing The Personal information with invalid details");
		ExtentTestManager.getTest().log(Status.INFO, "Editing the Email Preferences");
		Thread.sleep(1000);
		MyProfile MyProfilePage = new MyProfile(driver);
		//accountoverviewPage.signIn(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		MyProfilePage.myProfile(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")), Base64.decrypt(datatable.get("CurrentPassword")), Base64.decrypt(datatable.get("NewPassword")), Base64.decrypt(datatable.get("RepeatedPassword")), datatable.get("Firstname"),datatable.get("Lastname"), datatable.get("Ext"), datatable.get("SecondaryNumber"));
		//String title ="www.dollardays.com says";
		//accountoverviewPage.getHandleToWindow(driver driver, String title);
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}

	@DDDataProvider(datafile = "testdata/testdata4.xlsx", sheetName = "Sheet1",  testcaseID = "TC4", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void invokeMyProfile3(Hashtable<String, String> datatable) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "Null data for current password MyProfile testcase");
		ExtentTestManager.getTest().log(Status.INFO, "Editing the Login Information with valid details");
		ExtentTestManager.getTest().log(Status.INFO, "Editing The Personal information with valid details");
		ExtentTestManager.getTest().log(Status.INFO, "Checking the Newsletter Subsription");
		Thread.sleep(1000);
		MyProfile MyProfilePage = new MyProfile(driver);
		//accountoverviewPage.signIn(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		MyProfilePage.myProfile1(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")), Base64.decrypt(datatable.get("CurrentPassword")), Base64.decrypt(datatable.get("NewPassword")), Base64.decrypt(datatable.get("RepeatedPassword")),datatable.get("Firstname"), datatable.get("Lastname"), datatable.get("Ext"), datatable.get("SecondaryNumber"));
		//String title ="www.dollardays.com says";
		//accountoverviewPage.getHandleToWindow(driver driver, String title);
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}

}

