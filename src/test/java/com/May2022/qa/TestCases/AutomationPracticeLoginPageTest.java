package com.May2022.qa.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.May2022.qa.Base.TestBaseBrowser;
import com.May2022.qa.pages.LoginPage;

public class AutomationPracticeLoginPageTest extends TestBaseBrowser  {
	
	@BeforeClass
	public void setUp() {
		InitialiseBrowser("chrome");
	}
	
	@AfterClass
	public void TearDown() {
	TestBaseBrowser.driver.close();
	}
	
	@Test
	public void AutomationPrcticeLoginPageTest() {
		LoginPage lp  = new LoginPage(driver);
		lp.VerifyAutomationPracticeSignInBtn();
		lp.VerifyAutomationPracticEmailTextField();
		lp.VerifyAutomationPracticPassTextField();
		lp.VerifyAutomationPracticForgotPassword();
		lp.VerifyAutomationPracticAccoountSignInBtn();
	}

}
