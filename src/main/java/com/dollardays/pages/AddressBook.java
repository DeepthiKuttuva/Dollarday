package com.dollardays.pages;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dollardays.commons.Base64;
//import com.sun.org.apache.bcel.internal.generic.Select;
import com.dollardays.commons.*;
public class AddressBook {
	WebDriver driver;

	public AddressBook(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//span[normalize-space(.)='Sign in']")
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
	private WebElement Dropdown;

	public WebElement getDropdown() {
		return Dropdown;
	}
	
	@FindBy(xpath = "//a[@class='dropdown-item']")
	private WebElement Accounts;
	
	public WebElement getAccounts() {
		return Accounts;
	}
	@FindBy(xpath = "//span[normalize-space(.)='Account Overview']")
	private WebElement AccountOverview;
	
	public WebElement getAccountOverview() {
		return AccountOverview;
	}
	@FindBy(xpath = "//a[normalize-space(.)='Address Book']")
	private WebElement AddressBook;
	
	public WebElement getAddressBook() {
		return AddressBook;
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
    @FindBy(xpath = "//*[@id='ctl00_cphContent_ddlshipstate']")
    //@FindBy(xpath = "//select[@id='ddlstate']")
    private static WebElement dropdown;
    public static WebElement getdropdown() {
    	 return dropdown;
    }
    @FindBy(xpath = "//*[@id='ctl00_cphContent_txtAddrshipphoneExt']")
    private WebElement Ext;
    public WebElement getExt() {
    	return Ext;
    }
    
    @FindBy(xpath = "//*[@id='txtAddrshipzip']")
    private WebElement Zip;
    public WebElement getZip() {
    	return Zip;
    }
    @FindBy(xpath= "//input[@id='rbtnResLoc']")
    private WebElement ResLoc;
    public WebElement getResLoc() {
    	return ResLoc;
    }
    @FindBy(xpath="//*[@id='ctl00_cphContent_btnAddAddress']")
    private WebElement SaveChanges;
    public WebElement getSaveChanges() {
    	return SaveChanges;
    }
    public void MyAddressBook(String username, String password, String Lastnameedit, String Company, String Address, String Address2, String City, String State, String Ext, String Zip) throws InterruptedException {
    	Thread.sleep(1000);
		getSignIn().click();
		getDropdownsignIn().click();
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getSignInBtn().click();
		getDropdown().click();
		//getAccounts().click();
		getAddressBook().click();
		Thread.sleep(1000);
		getLastnameedit().clear();
		//getLastnameedit().sendKeys("");
		System.out.println("the value of last named it is "+Lastnameedit);
		Thread.sleep(1000);
		getLastnameedit().sendKeys(Lastnameedit);
		Thread.sleep(1000);
		getCompany().sendKeys(Company);
		getStreet().sendKeys(Address);
		getAddress2().sendKeys((""+(Double.valueOf(Address2)).intValue()));
		getCity().sendKeys(City);
		Thread.sleep(1000);
		//dropdown.getOptions().get(1).click();
		getdropdown().click();
		getdropdown().sendKeys(State);
		Thread.sleep(1000);
		//driver.switchTo().alert().accept();
		getExt().sendKeys(""+(Double.valueOf(Ext)).intValue());
		Thread.sleep(1000);
		getZip().sendKeys(""+Double.valueOf(Zip).intValue());
		//Thread.sleep(5000);
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(1000);

		WebElement elem = getResLoc();
//		
//	     WebDriverWait wait = new WebDriverWait(driver, 1200);
//	     wait.until(ExpectedConditions.elementToBeClickable(elem));

		//elem.click();
        js.executeScript("arguments[0].click();", elem);

		getSaveChanges().click();
		
		
		//Select state = new state(driver.findElement(By.id("ctl00_cphContent_ddlshipstate")));
		//state.selectByVisibleText("California");
}
	

}
