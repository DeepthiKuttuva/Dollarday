package com.dollardays.pages;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dollardays.commons.Base64;

public class CreatePage {
	WebDriver driver;

	public CreatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space(.)='Sign in']")
	private WebElement signIn;
	
	public WebElement getSignIn() {
		return signIn;
	}
	@FindBy(xpath = "//a[normalize-space(.)='Create account']")
	private WebElement CreateAccount;

	public WebElement getCreateAccount() {
		return CreateAccount;
	}
	@FindBy(xpath = "//*[@id='ctl00_cphContent_txtFName']")
	private WebElement FirstName;

	public WebElement getFirstName() {
		return FirstName;
	}
	@FindBy(xpath = "//*[@id='ctl00_cphContent_txtLName']")
	private WebElement LastName;

	public WebElement getLastName() {
		return LastName;
	}
	@FindBy(xpath = "//*[@id='ctl00_cphContent_txtClientEmail']")
	private WebElement Email;

	public WebElement getEmail() {
		return Email;
	}
	@FindBy(xpath = "//*[@id='ctl00_cphContent_txtPhoneMain']")
	private WebElement Phone;

	public WebElement getPhone() {
		return Phone;
	}
	@FindBy(xpath = "//*[@id='ctl00_cphContent_txtPassword']")
	private WebElement Password;
	
	public WebElement getPassword() {
		return Password;
	}
	@FindBy(xpath = "//*[@id='ctl00_cphContent_txtPasswordConfirm']")
	private WebElement ConfirmPassword;
	
	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}
	@FindBy(xpath = "//*[@id='ctl00_cphContent_btnRegister']")
	private WebElement Register;
	
	public WebElement getRegister() {
		return Register;
	}
	public void create(String FirstName, String LastName, String Email, String Phone, String Password, String ConfirmPassword) throws InterruptedException {
		Thread.sleep(1000);
		
		getSignIn().click();
		
		getCreateAccount().click();
		Thread.sleep(1000);
		getFirstName().sendKeys(FirstName);
		getLastName().sendKeys(LastName);
		getEmail().sendKeys(Email);
		getPhone().sendKeys(Phone);
		getPassword().sendKeys(Password);
		getConfirmPassword().sendKeys(ConfirmPassword);
		Thread.sleep(1000);
		getRegister().click();
	}
	
	
	
	
}