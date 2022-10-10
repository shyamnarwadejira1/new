package com.May2022.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.May2022.qa.Base.TestBaseBrowser;
public class AutomationPrcticeRegistrationPage extends TestBaseBrowser {
	
	
	// Declaration
	
	@FindBy (xpath = "//a[@rel='nofollow']") private WebElement SignInBtn;
	@FindBy (xpath = "//input[@id='email_create']") private WebElement emailField;
	@FindBy (xpath = "//i[@class='icon-user left']") private WebElement CreateAccBtn;
	@FindBy (xpath = "//input[@id='email']") private WebElement EmailAddressField;
	@FindBy (xpath = "//input[@id='passwd']") private WebElement PassWordField;
	@FindBy (xpath = "//i[@class='icon-lock left']") private WebElement SignInToAccount;
	@FindBy(xpath = "//input[@name='id_gender']") private WebElement mrRadioButn;
	@FindBy(xpath = "//input[@name='customer_firstname']") private WebElement FirstameTextField;
	@FindBy(xpath = "//input[@name='customer_lastname']") private WebElement LastameTextField;
	@FindBy(xpath = "//input[@name='passwd']") private WebElement PassWordTextField;
	@FindBy(xpath = "//select[@name='days']") private WebElement DayOfBirth;
	@FindBy(xpath = "//select[@name='months']") private WebElement MonthOfBirth;
	@FindBy(xpath = "//select[@name='years']") private WebElement YesrOfBirth;
	@FindBy(xpath = "//input[@name='newsletter']") private WebElement NewsletterSelectBox;
	@FindBy(xpath = "//input[@name='company']") private WebElement CompanyTextField;
	@FindBy(xpath = "//input[@name='address1']") private WebElement addressTextFiElementld;
	@FindBy(xpath = "//input[@name='address2']") private WebElement addressline2TextField;
	@FindBy(xpath = "//input[@name='city']") private WebElement CityTextField;
	@FindBy(xpath = "//select[@name='id_state']") private WebElement StateDropDownList;
	@FindBy(xpath = "//input[@name='postcode']") private WebElement PostalCodeTextField;
	@FindBy(xpath = "//select[@name='id_country']") private WebElement CountryDropDown; 
	@FindBy(xpath = "//textarea[@name='other']") private WebElement AdditionalInfoTextField;
	@FindBy(xpath = "//input[@name='phone']") private WebElement HomePhoneTextField;
	@FindBy(xpath = "//input[@name='phone_mobile']") private WebElement MobileNoRextField;
	@FindBy(xpath = "//input[@name='alias']") private WebElement AssignAnAddressField;
	@FindBy(xpath = "//button[@name='submitAccount']") private WebElement SubmitBut;
	
	
	 
	
	// initialization
	
     public AutomationPrcticeRegistrationPage (WebDriver driver) {
    	 PageFactory.initElements(driver, this);
     }
     
     
     // Usage
     
     public void VerifyAutomationPrcticeSignButn() {
    	 Assert.assertTrue(SignInBtn.isEnabled(), "SignInButton is not enabled");
    	 Reporter.log("VerifyAutomationPrcticeSignButn", true);
    	 SignInBtn.click();
		
	}
     
     public void VeryfyEmailTextField() {
    	 Assert.assertTrue(emailField.isDisplayed(), "Email field is not displayed");
    	 Reporter.log("VeryfyEmailTextField", true);
    	 emailField.sendKeys("AutomationPractice199@gmail.com");
    	 
		
	}
     public void VerifycreateAccountButn() {
    	 Assert.assertTrue(CreateAccBtn.isDisplayed(), "createAccountButn is not displayed");
    	 CreateAccBtn.click();
    	 Reporter.log("VerifycreateAccountButn", true);
		
	}
     
     public void VerifyMrRadioButton() {
    	 Assert.assertTrue(mrRadioButn.isDisplayed(), "MrRadioButton is not displayed");
    	 Assert.assertTrue(mrRadioButn.isEnabled(), "MrRadioButton is not Enabled");
    	 mrRadioButn.click();
    	 Reporter.log("VerifyMrRadioButton", true);
	}
     
     public void VerifyFirstameTextField() {
    	 Assert.assertTrue(FirstameTextField.isDisplayed(), "FirstameTextField is not displayed");
    	 FirstameTextField.sendKeys("Automation");
    	 Reporter.log("VerifyFirstameTextField", true);
	}
     
     
     public void VerifyLastNameTextField() {
    	 Assert.assertTrue(LastameTextField.isDisplayed(), "LastameTextField is not dipsplyed");
    	 LastameTextField.sendKeys("Practice");
    	 Reporter.log("VerifyLastNameTextField", true);
    	 
		
	}
     
     public void VerifyPassWordTextField() {
    	 Assert.assertTrue(PassWordTextField.isDisplayed(), "PassWordTextField is not displayed");
    	 PassWordTextField.sendKeys("Automation@123");
    	 Reporter.log("VerifyPassWordTextField", true);
		
	}
     public void VeryDayDropDownList(WebDriver driver) {
//    	 Assert.assertTrue(DayOfBirth.isSelected(), "DayOfBirth dropdown list is not selected");
    	 Select select = new Select(DayOfBirth);
    	 select.selectByValue("3");
    	 Reporter.log("VeryDayDropDownList", true);
		
	}
     public void VeryfyMonthsDropDown(WebDriver driver) {
//    	 Assert.assertTrue(MonthOfBirth.isSelected(), "MonthOfBirth dropdown is not selected");
    	 Select select = new Select(MonthOfBirth);
    	 select.selectByVisibleText("April ");
    	 Reporter.log("VeryfyMonthsDropDown", true);
		
	}
     
     public void VeryfyYearsDropDown(WebDriver driver) {
//    	 Assert.assertTrue(YesrOfBirth.isSelected(), "YearOfBirth dropdown is not selected");
    	 Select select = new Select(YesrOfBirth);
    	 select.selectByValue("1996");
    	 Reporter.log("VeryfyYearDropDown", true);
		
	}
     
     public void VerifyNewsLetterSelectBox() {
//    	 Assert.assertTrue(NewsletterSelectBox.isSelected(), "NewsletterSelectBox is not selected");
    	 NewsletterSelectBox.click();
    	 Reporter.log("VerifyNewsLetterSelectBox", true);
		
	}
     public void VerifyCompanyTextField() {
    	 Assert.assertTrue(CompanyTextField.isDisplayed(), "CompanyTextField is not displayed");
    	 CompanyTextField.sendKeys("XYZ");
    	 Reporter.log("VerifyCompanyTextField", true);
		
	}
     
     public void VerifyaddressTextFiElementld() {
    	 Assert.assertTrue(addressTextFiElementld.isDisplayed() , "addressTextFiElementld is not displayed");
    	 addressTextFiElementld.sendKeys("Bhosari");
    	 Reporter.log("VerifyaddressTextFiElementld", true);
		
	}
     
     public void Verifyaddress2TextFiElementld() { 
    	 Assert.assertTrue(addressline2TextField.isDisplayed() , "addressline2TextField is not displayed");
    	 addressline2TextField.sendKeys("Pune");
    	 Reporter.log("Verifyaddress2TextFiElementld", true);
		
	}
     
     public void VerifyCityTextField() {
    	 Assert.assertTrue(CityTextField.isDisplayed(), "CityTextField is not displayed");
    	 CityTextField.sendKeys("pune");
    	 Reporter.log("VerifyCityTextField", true);
    	 
    	 
		
	}
     public void verifyStateDropDownList(WebDriver driver) {
//    	 Assert.assertTrue(StateDropDownList.isSelected(), "StateDropDownList is not selected");
    	 Select select = new Select(StateDropDownList);
    	 select.selectByValue("1996");
    	 Reporter.log("verifyStateDropDownList", true);
		
	}
     public void verifyPostalCodeTextField() {
    	 Assert.assertTrue(PostalCodeTextField.isDisplayed(), "PostalCodeTextField is not Displayed");
    	 PostalCodeTextField.sendKeys("123456");
    	 Reporter.log("verifyPostalCodeTextField", true);
	}
     
     public void verifyCountryDropDown(WebDriver driver) {
    	 Assert.assertTrue(CountryDropDown.isSelected(), "CountryDropDown is not selected");
    	 Select select = new Select(CountryDropDown);
    	 select.selectByIndex(4);
    	 Reporter.log("verifyCountryDropDown", true);
	}
     
     public void VerifyAdditionalInfoTextField() {
    	 Assert.assertTrue(AdditionalInfoTextField.isDisplayed(), "AdditionalInfoTextFieldis not displayed");
    	 AdditionalInfoTextField.sendKeys("puneeeeee");
    	 Reporter.log("VerifyAdditionalInfoTextField", true);
    	 
	}
     
     public void VerifyHomePhoneTextField() {
    	 Assert.assertTrue(HomePhoneTextField.isDisplayed(), "HomePhoneTextField is not displayed");
    	 HomePhoneTextField.sendKeys("1234567890");
    	 Reporter.log("VerifyHomePhoneTextField", true);
		 	
	}
     public void VerifyMobilePhoneTextField() {
    	 Assert.assertTrue(MobileNoRextField.isDisplayed(), "MobilePhoneTextField is not displayed");
    	 MobileNoRextField.sendKeys("1234567890");
    	 Reporter.log("VerifyMobilePhoneTextField", true);
     
}
     public void VerifyAssignAnAddressField() {
    	 Assert.assertTrue(AssignAnAddressField.isDisplayed(), "AssignAnAddressField is not displayed");
    	 AssignAnAddressField.sendKeys("shyaaaam");
    	 Reporter.log("VerifyAssignAnAddressField", true);
	}
     public void VeryfySubmitBut() {
    	 Assert.assertTrue(SubmitBut.isDisplayed(), "SubmitBut is not displayed");
    	 Assert.assertTrue(SubmitBut.isEnabled(), "SubmitBut is not Enabled");
//    	 SubmitBut.click();
    	 Reporter.log("VeryfySubmitBut", true);
    	 
		
	}
}
