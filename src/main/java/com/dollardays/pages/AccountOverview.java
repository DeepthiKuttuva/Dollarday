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

public class AccountOverview {
	WebDriver driver;

	public AccountOverview(WebDriver driver) {
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
	
	@FindBy(xpath = "//a[normalize-space(.)='Deepthi K.']")
	private WebElement Dropdown;

	public WebElement getDropdown() {
		return Dropdown;
	}
	
	@FindBy(xpath = "//a[normalize-space(.)='Accounts']")
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
    
    
    public WebElement getCurrentPassword(){
    	
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
    
    @FindBy(xpath ="//a[normalize-space(.)='Edit']")
    private WebElement Edit;
    public WebElement getEdit() {
    	return Edit;
    }
    
    @FindBy(xpath ="//*[@id='ctl00_cphContent_txtPhoneBill']")
    private WebElement SecondaryNumber;
    
    public WebElement getSecondaryNumber() {
    	return SecondaryNumber;
    }
    
    @FindBy(xpath ="//*[@id='ctl00_cphContent_btnUpdatePersonalInfo']")
    private WebElement PersonalSave;
    
    public WebElement getPersonalSave() {
    	return PersonalSave;
    }
    
    
    @FindBy(xpath ="//*[@id='ctl00_cphContent_txtLName']")
    private WebElement Lastname;
    
    public WebElement getLastname() {
    	return Lastname;
    }
    @FindBy(xpath ="//*[@id='ctl00_cphContent_txtLName']")
    private WebElement Lastname1;
    
    public WebElement getLastname1() {
    	return Lastname1;
    }
    
    @FindBy(xpath ="//*[@id='ctl00_cphContent_chkOptinBox1']")
    private WebElement News;
    
    public WebElement getNews() {
    	return News;
    }
    
    @FindBy(xpath ="//*[@id='ctl00_cphContent_btnUpdateNewsletter']")
    private WebElement NewsSave;
    
    public WebElement getNewsSave() {
    	return NewsSave;
    }
   
    @FindBy(xpath = "//span[normalize-space(.)='My Address Book']")
	private WebElement MyAddressBook;
	
	public WebElement getMyAddressBook() {
		return MyAddressBook;
	}
	@FindBy(xpath = "//*[@id='ctl00_cphContent_txtlastname']")
	private WebElement Lastnameedit;
	
	public WebElement getLastnameedit() {
		return Lastnameedit;
	}
			
	
	@FindBy(xpath ="//*[@id='ctl00_cphContent_txtAddrshipcompany']")
	private WebElement Company;
	public WebElement getCompany() {
		return Company;
	}
	
	@FindBy(xpath ="//*[@id='ctl00_cphContent_txtAddrshipaddr1']")
	private WebElement Street;
	public WebElement getStreet() {
		
		return Street;
	}
	
	
    @FindBy(xpath= "//*[@id='ctl00_cphContent_txtAddrshipaddr2']")
    private WebElement Address2;
    public WebElement getAddress2() {
    	return Address2;
    }
    @FindBy(xpath = "//*[@id='ctl00_cphContent_txtAddrshipcity']")
    private WebElement City;
    public WebElement getCity() {
    	return City;
    }
    @FindBy(xpath = "//*[@id='ctl00_cphContent_ddlshipstate']``")
    private WebElement dropdown;
    public WebElement getdropdown() {
    	 return dropdown;
    }

    
   
    //}
    
    
    public void signIn(String username, String password, String CurrentPassword, String NewPassword, String RepeatedPassword, String Lastname, String Lastname1, String SecondaryNumber) throws InterruptedException {
		Thread.sleep(1000);
		getSignIn().click();
		getDropdownsignIn().click();
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getSignInBtn().click();
		getDropdown().click();
		getAccounts().click();
		getEdit().click();
		getCurrentPassword().sendKeys(CurrentPassword);
		getNewPassword().sendKeys(NewPassword);
		getRepeatedPassword().sendKeys(RepeatedPassword);
		getSaveChanges().click();
		getLastname().clear();
		getLastname1().sendKeys(Lastname1);
		
		getSecondaryNumber().sendKeys(""+(Double.valueOf(SecondaryNumber)).intValue());
		getPersonalSave().click();
		driver.switchTo().alert().accept();
		getNews().click();
		getNewsSave().click();
	}
    public void AddressBook(String username, String password, String Lastnameedit, String Company, String Address, String Address2, String City) throws InterruptedException {
    	Thread.sleep(1000);
		getSignIn().click();
		getDropdownsignIn().click();
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getSignInBtn().click();
		getDropdown().click();
		getAccounts().click();
		getMyAddressBook().click();
		getLastnameedit().sendKeys(Lastnameedit);
		getCompany().sendKeys(Company);
		getStreet().sendKeys(Address);
		getAddress2().sendKeys(Address2);
		getCity().sendKeys(City);
		//dropdown.getOptions().get(1).click();
		getdropdown().click();
		//Select state = new state(driver.findElement(By.id("ctl00_cphContent_ddlshipstate")));
		//state.selectByVisibleText("California");
}
}