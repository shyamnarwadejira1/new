package com.May2022.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {
	
	// Declaration
	@FindBy (xpath = "//a[@rel='nofollow']") private WebElement SignInBtn;
	@FindBy(xpath ="//input[@id='email']") private WebElement EmailTextField ;
	@FindBy(xpath ="//input[@id='passwd']") private WebElement PassTextField ;
	@FindBy(xpath = "//a[starts-with(@title,'Recover')]") private WebElement ForgotPassword;
	@FindBy(xpath = "//button[@id='SubmitLogin']") private WebElement AccoountSignInBtn;
	
	// initialization
	
     public LoginPage(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
     }
	
     
   //  usage
     
     public void VerifyAutomationPracticeSignInBtn() {
    	Assert.assertTrue(SignInBtn.isDisplayed(), "Sign in btn is not displayed");
		Assert.assertTrue(SignInBtn.isEnabled(), "Sign in btn is not Enabled");
		SignInBtn.click();
		Reporter.log("VerifyAutomationPracticeSignInBtn", true);
	}
	
	public void VerifyAutomationPracticEmailTextField() {
		Assert.assertTrue(EmailTextField.isDisplayed(), "mailTextField is not displayed");
		Assert.assertTrue(EmailTextField.isEnabled(), "Emailtext field is not ensbled");
		EmailTextField.clear();EmailTextField.sendKeys("AutomationPractice199@gmail.com");
		EmailTextField.click();
		Reporter.log("VerifyAutomationPracticEmailTextField", true);
		
	}
	public void VerifyAutomationPracticPassTextField() {
		Assert.assertTrue(PassTextField.isDisplayed(), "PassTextField is not displayed");
		Assert.assertTrue(PassTextField.isEnabled(), "PassTextField field is not ensbled");
		PassTextField.clear();PassTextField.sendKeys("Automation@123");
		PassTextField.click();
		Reporter.log("VerifyAutomationPracticPassTextField", true);
		
	}
	public void VerifyAutomationPracticForgotPassword() {
		Assert.assertTrue(ForgotPassword.isDisplayed(), "ForgotPassword is not displayed");
		Assert.assertTrue(ForgotPassword.isEnabled(), "ForgotPassword field is not ensbled");
		Reporter.log("VerifyAutomationPracticForgotPassword", true);
		
	}
	
	public void VerifyAutomationPracticAccoountSignInBtn() {
		Assert.assertTrue(AccoountSignInBtn.isDisplayed(), "AccoountSignInBtn is not displayed");
		Assert.assertTrue(AccoountSignInBtn.isEnabled(), "AccoountSignInBtn field is not ensbled");
		AccoountSignInBtn.click();
		Reporter.log("VerifyAutomationPracticAccoountSignInBtn", true);
		
	}

}
