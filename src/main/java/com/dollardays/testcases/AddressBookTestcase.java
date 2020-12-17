package com.dollardays.testcases;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.LoginPage;
import com.dollardays.pages.SignInPage;
import com.dollardays.pages.AddressBook;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.JsonReader;
import com.dollardays.utilities.TestUtil;
import com.dollardays.utilities.VideoRecorder_utlity;
import com.dollardays.commons.*;
public class AddressBookTestcase extends BaseTest{

	//private WebDriver driver;

	@DDDataProvider(datafile = "testdata/testdata5.xlsx", sheetName = "Sheet1",  testcaseID = "TC1", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void AddressBook(Hashtable<String, String> datatable) throws Exception{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "valid MyAccountBook testcase");
		Thread.sleep(1000);
		//WebDriver driver = null;
		AddressBook addressBook=new AddressBook(driver);
		//accountoverviewPage.signIn(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		addressBook.MyAddressBook(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")), datatable.get("Lastnameedit"), datatable.get("Company"),datatable.get("Address"),datatable.get("Address2") , datatable.get("City"), datatable.get("State"),datatable.get("Ext"),datatable.get("Zip"));
		
		// sending State from excel sheet.
//				if ((datatable.get("State") != null && !(datatable.get("State").equals("")))) {
//					AddressBook.getdropdown().sendKeys((datatable.get("State")));
//					
//					//taxExemptpage.getAccount_TaxExemptStatedpdown().sendKeys((datatable.get("State")));
//					ExtentTestManager.getTest().log(Status.INFO, "User entered State. " + "State:" + datatable.get("State"));
//				}
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}

}
