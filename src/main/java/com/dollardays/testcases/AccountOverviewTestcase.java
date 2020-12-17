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
import com.dollardays.pages.SignInPage;
import com.dollardays.pages.AccountOverview;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.JsonReader;
import com.dollardays.utilities.TestUtil;
import com.dollardays.utilities.VideoRecorder_utlity;
import com.dollardays.commons.*;

public class AccountOverviewTestcase  extends BaseTest{

	@DDDataProvider(datafile = "testdata/testdata4.xlsx", sheetName = "Sheet1",  testcaseID = "TC1", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void AccountOverview(Hashtable<String, String> datatable) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "valid account overview testcase");
		Thread.sleep(1000);
		AccountOverview accountoverviewPage = new AccountOverview(driver);
		//accountoverviewPage.signIn(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		accountoverviewPage.signIn(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")), Base64.decrypt(datatable.get("CurrentPassword")), Base64.decrypt(datatable.get("NewPassword")), Base64.decrypt(datatable.get("RepeatedPassword")), datatable.get("Lastname"),datatable.get("Lastname1") , datatable.get("SecondaryNumber"));
		//String title ="www.dollardays.com says";
		//accountoverviewPage.getHandleToWindow(driver driver, String title);
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}
	
}