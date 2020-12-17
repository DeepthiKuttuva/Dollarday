
package com.dollardays.pages;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dollardays.commons.Base64;
import com.sun.org.apache.bcel.internal.generic.Select;
import com.dollardays.commons.*;

public class MyProfile {
	WebDriver driver;

	public MyProfile(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space(.)='Sign in']")
	private WebElement signIn;

	public WebElement getSignIn() {
		return signIn;
	}

	@FindBy(xpath = "//a[normalize-space(.)='Sign In']")
	private WebElement dropdownsignIn;

	public WebElement getDropdownsignIn() {
		return dropdownsignIn;
	}

	@FindBy(xpath = "//*[@id='inputLoginUsername']")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(xpath = "//*[@id='inputLoginPassword']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//button[normalize-space(.)='Sign in']")
	private WebElement signInBtn;

	public WebElement getSignInBtn() {
		return signInBtn;
	}
	
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
	//@FindBy(xpath = "//a[normalize-space(.)='Deepthi K.']")
	private WebElement Dropdown;

	public WebElement getDropdown() {
		return Dropdown;
	}

	@FindBy(xpath = "//a[normalize-space(.)='!@!#!@$ K.']")
	private WebElement Dropdown1;

	public WebElement getDropdown1() {
		return Dropdown1;
	}

	@FindBy(xpath = "//a[@class ='dropdown-item']")
	private WebElement Accounts;

	public WebElement getAccounts() {
		return Accounts;
	}

	@FindBy(xpath = "//span[normalize-space(.)='Account Overview']")
	private WebElement AccountOverview;

	public WebElement getAccountOverview() {
		return AccountOverview;
	}

	@FindBy(xpath = "//*[@id='ctl00_cphContent_txtCurrentPassword']")
	private WebElement CurrentPassword;

	public WebElement getCurrentPassword() {

		return CurrentPassword;
	}

	@FindBy(xpath = "//span[normalize-space(.)='deepthi.aries@gmail.com']")

	private WebElement EmailAddress;

	public WebElement getEmailAddress() {
		return EmailAddress;
	}

	@FindBy(xpath = "//*[@id='ctl00_cphContent_txtNewPassword']")
	private WebElement NewPassword;

	public WebElement getNewPassword() {
		return NewPassword;
	}

	@FindBy(xpath = "//*[@id='ctl00_cphContent_txtRepeatedPassword']")
	private WebElement RepeatedPassword;

	public WebElement getRepeatedPassword() {
		return RepeatedPassword;
	}

	@FindBy(xpath = "//*[@id='ctl00_cphContent_btnUpdatePassword']")
	private WebElement SaveChanges;

	public WebElement getSaveChanges() {
		return SaveChanges;
	}

	@FindBy(xpath = "//a[text()='Edit'][@href='profile.aspx']")
	// @FindBy(xpath = "//a[@href='profile.aspx']")
	// @FindBy(linkText= "Edit")
	// @FindBy(xpath ="//a[normalize-space(.)='Edit']")
	private WebElement Edit;

	public WebElement getEdit() {
		return Edit;
	}

	@FindBy(xpath = "//*[@id='ctl00_cphContent_txtPhoneBill']")
	private WebElement SecondaryNumber;

	public WebElement getSecondaryNumber() {
		return SecondaryNumber;
	}

	@FindBy(xpath = "//*[@id='ctl00_cphContent_btnUpdatePersonalInfo']")
	private WebElement PersonalSave;

	public WebElement getPersonalSave() {
		return PersonalSave;
	}

	@FindBy(xpath = "//*[@id='ctl00_cphContent_txtFName']")
	private WebElement Firstname;

	public WebElement getFirstname() {
		return Firstname;
	}

	@FindBy(xpath = "//*[@id='ctl00_cphContent_txtLName']")
	private WebElement Lastname;

	public WebElement getLastname() {
		return Lastname;
	}
	// @FindBy(xpath ="//*[@id='ctl00_cphContent_txtLName']")
	// private WebElement Lastname1;

	// public WebElement getLastname1() {
	// return Lastname1;
	// }

	@FindBy(xpath = "//*[@id='ctl00_cphContent_chkOptinBox1']")
	private WebElement News;

	public WebElement getNews() {
		return News;
	}

	@FindBy(xpath = "//*[@id='ctl00_cphContent_btnUpdateNewsletter']")
	private WebElement NewsSave;

	public WebElement getNewsSave() {
		return NewsSave;
	}

	@FindBy(xpath = "//*[@id='ctl00_cphContent_txtPhoneMainExt']")
	private WebElement Ext;

	public WebElement getExt() {
		return Ext;
	}

	public void myProfile(String username, String password, String CurrentPassword, String NewPassword,
			String RepeatedPassword, String Firstname, String Lastname, String Ext, String SecondaryNumber)
			throws InterruptedException {
		Thread.sleep(1000);
		getSignIn().click();
		getDropdownsignIn().click();
		Thread.sleep(1000);
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getSignInBtn().click();
		getDropdown().click();
		getAccounts().click();
		Thread.sleep(1000);
		getEdit().click();
		getCurrentPassword().sendKeys(CurrentPassword);
		getNewPassword().sendKeys(NewPassword);
		getRepeatedPassword().sendKeys(RepeatedPassword);
		getSaveChanges().click();
		Thread.sleep(1000);
		getFirstname().clear();
		getFirstname().sendKeys(Firstname);
		getLastname().clear();
		getLastname().sendKeys(Lastname);
		getExt().clear();
		getExt().sendKeys("" + (Double.valueOf(Ext)).intValue());
		getSecondaryNumber().clear();
		getSecondaryNumber().sendKeys("" + (Double.valueOf(SecondaryNumber)).intValue());
		getPersonalSave().click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		getNews().click();
		getNewsSave().click();
	}

	public void myProfile1(String username, String password, String CurrentPassword, String NewPassword,
			String RepeatedPassword, String Firstname, String Lastname, String Ext, String SecondaryNumber)
			throws InterruptedException {
		Thread.sleep(1000);
		getSignIn().click();
		getDropdownsignIn().click();
		Thread.sleep(1000);
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getSignInBtn().click();
		Thread.sleep(1000);
		getDropdown1().click();
		getAccounts().click();
		Thread.sleep(1000);
		getEdit().click();
		getCurrentPassword().sendKeys(CurrentPassword);
		getNewPassword().sendKeys(NewPassword);
		getRepeatedPassword().sendKeys(RepeatedPassword);
		getSaveChanges().click();
		Thread.sleep(1000);
		getFirstname().clear();
		getFirstname().sendKeys(Firstname);
		getLastname().clear();
		getLastname().sendKeys(Lastname);
		getExt().clear();
		getExt().sendKeys("" + (Double.valueOf(Ext)).intValue());
		getSecondaryNumber().clear();
		getSecondaryNumber().sendKeys("" + (Double.valueOf(SecondaryNumber)).intValue());
		getPersonalSave().click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		getNews().click();
		getNewsSave().click();
	}

}
