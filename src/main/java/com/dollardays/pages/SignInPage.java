package com.dollardays.pages;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dollardays.commons.Base64;

public class SignInPage {

	WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath ="//i[@class= 'fa fa-chevron-down']")
	//@FindBy(xpath = "//a[normalize-space(.)='Sign in']")
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
	
	@FindBy(xpath = "//*[@id='header-main']/div/div/div[3]/div/ul/li[1]/a")
	private WebElement userDrodown;

	public WebElement getUserDrodown() {
		return userDrodown;
	}	
	
	@FindBy(xpath = "//a[normalize-space(.)='Sign Out']")
	private WebElement logoutBtn;

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}	
	//<i class="glyphicon icon-eye-close glyphicon-eye-close"></i>
	//<i class=" glyphicon icon-eye-open glyphicon-eye-open"></i>
	//@FindBy(xpath= "//span[normalize-space(.)='add-on input-group-addon']")
	@FindBy(xpath= "//span[contains(@class, 'input-group-addon')]")
	private WebElement passwordEye;
	
	public WebElement getpasswordEye() {
		return passwordEye;
	}
	
	@FindBy(xpath= "//*[@id='question_parent_24']")
	private WebElement checkbox;
	
	public WebElement getCheckBox() {
		return checkbox;
	}
	//@FindBy(xpath= "//a[@href='Forgot your email address or password?']")
	@FindBy(xpath="//a[normalize-space(.) = 'Forgot your email address or password?']")
	//@FindBy(linkText="Forgot your email address or password")
	private WebElement ForgotEmail;
	
	public WebElement getForgotEmail() {
		return ForgotEmail;
	}
	@FindBy(xpath="//*[@id='ctl00_cphContent_txtEmailAddress']")
	private WebElement EmailAddress;
	
	public WebElement getEmailAddress() {
		return EmailAddress;
	}
	
	@FindBy(xpath="//*[@id='ctl00_cphContent_btnSearch']")
	private WebElement LookUp;
	
	public WebElement getLookUp() {
		return LookUp;
	}
	
	@FindBy(xpath = "//a[normalize-space(.)='Deepthi K.']")
	private WebElement signOut;

	public WebElement getSignOut() {
		return signOut;
	}
	
	public void signIn(String username, String password) throws InterruptedException {
		Thread.sleep(2000);
		getSignIn().click();
		Thread.sleep(1000);
		getDropdownsignIn().click();
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getSignInBtn().click();
		
	}
	public void signIn1(String Username1, String Password1) throws InterruptedException {
		Thread.sleep(2000);
		getSignIn().click();
		getDropdownsignIn().click();
		getUsername().sendKeys(Username1);
		getPassword().sendKeys(Password1);
		getpasswordEye().click();
		getCheckBox().click();
		getSignInBtn().click();
	}

	//public void signIn2(String Username1, String Password1) throws InterruptedException {
		//Thread.sleep(1000);
		//getSignIn().click();
		//getDropdownsignIn().click();
		//getUsername().sendKeys(Username1);
		//getPassword().sendKeys(Password1);
		//getpasswordEye().click();
		//getCheckBox().click();
		//getForgotEmail().click();
		
		
		//getSignInBtn().click();
	//}
	public void signIn3(String Username1, String Password1) throws InterruptedException {
		Thread.sleep(5000);
		getSignIn().click();
		getDropdownsignIn().click();
		getUsername().sendKeys(Username1);
		getPassword().sendKeys(Password1);
		getpasswordEye().click();
		getCheckBox().click();
		Thread.sleep(1000);
		getForgotEmail().click();
		getEmailAddress().sendKeys(Username1);
	    getLookUp().click();
		//getSignInBtn().click();
	}
	public void ForgetEmailsignIn(String Username1, String Password1) throws InterruptedException {
		Thread.sleep(5000);
		getSignIn().click();
		getDropdownsignIn().click();
		getUsername().sendKeys(Username1);
		getPassword().sendKeys(Password1);
		getpasswordEye().click();
		getCheckBox().click();
		getForgotEmail().click();
		getEmailAddress().sendKeys();
	    getLookUp().click();
	    //driver.switchTo().alert().dismiss();
	    //driver.switchTo().alert().accept();
	    getEmailAddress().sendKeys("addsdefdgcg@e.com");
	    getLookUp().click();
		//getSignInBtn().click();
	}
	public void signIn4(String username, String password) throws InterruptedException {
		Thread.sleep(5000);
		getSignIn().click();
		getDropdownsignIn().click();
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		
		getSignInBtn().click();
		String expectedTitle = "DollarDays | Bulk Goods for Nonprofits, Businesses & Schools | Wholesale Products";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, " Successfully Logged into the HomePage");
		getSignOut().click();
		getLogoutBtn().click();
	}
	
	

}
