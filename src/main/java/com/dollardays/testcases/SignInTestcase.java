package com.dollardays.testcases;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;
import java.util.Map;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.LoginPage;
import com.dollardays.pages.SignInPage;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.JsonReader;
import com.dollardays.utilities.TestUtil;
import com.dollardays.utilities.VideoRecorder_utlity;

public class SignInTestcase extends BaseTest{

	@DDDataProvider(datafile = "testdata/testdata3.xlsx", sheetName = "Sheet1",  testcaseID = "TC1", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void invokeSignIn(Hashtable<String, String> datatable) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "valid sign in testcase");
		Thread.sleep(1000);
		SignInPage signinPage = new SignInPage(driver);
		signinPage.signIn(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		signinPage.captureScreenShot(driver,"SignIn"," SignIn_TC1_Screenshots");
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}
	@DDDataProvider(datafile = "testdata/testdata3.xlsx", sheetName = "Sheet1",  testcaseID = "TC2", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void invokeSignIn1(Hashtable<String, String> datatable) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "Invalid data Signin testcase");
		Thread.sleep(1000);
		SignInPage signinPage = new SignInPage(driver);
		signinPage.signIn(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		signinPage.captureScreenShot(driver,"SignIn"," SignIn_TC2_Screenshots");
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}
	
	@DDDataProvider(datafile = "testdata/testdata3.xlsx", sheetName = "Sheet1",  testcaseID = "TC3", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void invokeSignIn2(Hashtable<String, String> datatable) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "Null data sign in testcase");
		Thread.sleep(1000);
		SignInPage signinPage = new SignInPage(driver);
		signinPage.signIn(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		signinPage.captureScreenShot(driver,"SignIn"," SignIn_TC3_Screenshots");
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}
	
	@DDDataProvider(datafile = "testdata/testdata3.xlsx", sheetName = "Sheet1",  testcaseID = "TC4", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void invokeSignIn3(Hashtable<String, String> datatable) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "valid sign in testcase with visible password and keep me logged in");
		Thread.sleep(1000);
		SignInPage signinPage = new SignInPage(driver);
		signinPage.signIn1(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		signinPage.captureScreenShot(driver,"SignIn"," SignIn_TC4_Screenshots");
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}
	//@DDDataProvider(datafile = "testdata/testdata3.xlsx", sheetName = "Sheet1",  testcaseID = "TC5", runmode = "Yes")
	//@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	//public void invokeSignIn4(Hashtable<String, String> datatable) throws Exception{
		//VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		//ExtentTestManager.getTest().log(Status.INFO, "valid sign in testcase with Keep me logged in");
		//Thread.sleep(1000);
		//SignInPage signinPage = new SignInPage(driver);
		//signinPage.signIn1(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		//VideoRecorder_utlity.stopRecord();//End point of video recording
	//}
	@DDDataProvider(datafile = "testdata/testdata3.xlsx", sheetName = "Sheet1",  testcaseID = "TC5", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void invokeSignIn5(Hashtable<String, String> datatable) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "Forgot email or password");
		Thread.sleep(1000);
		SignInPage signinPage = new SignInPage(driver);
		signinPage.signIn3(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		signinPage.captureScreenShot(driver,"AddressBook"," SignIn_TC5_Screenshots");
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}
	@DDDataProvider(datafile = "testdata/testdata3.xlsx", sheetName = "Sheet1",  testcaseID = "TC6", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void invokeSignIn6(Hashtable<String, String> datatable) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "blank email and Wrong email id for look up");
		Thread.sleep(1000);
		SignInPage signinPage = new SignInPage(driver);
		signinPage.ForgetEmailsignIn(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		signinPage.captureScreenShot(driver,"SignIn"," SignIn_TC6_Screenshots");
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}
	
	@DDDataProvider(datafile = "testdata/testdata3.xlsx", sheetName = "Sheet1",  testcaseID = "TC7", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void invokeSignIn7(Hashtable<String, String> datatable) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "Valid sign out");
		Thread.sleep(1000);
		SignInPage signinPage = new SignInPage(driver);
		signinPage.signIn4(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		signinPage.captureScreenShot(driver,"SignIn"," SignIn_TC7_Screenshots");
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}
}

