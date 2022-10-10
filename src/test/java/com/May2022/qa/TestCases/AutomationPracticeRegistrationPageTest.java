package com.May2022.qa.TestCases;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.May2022.qa.Base.TestBaseBrowser;
import com.May2022.qa.pages.AutomationPrcticeRegistrationPage;

public class AutomationPracticeRegistrationPageTest extends TestBaseBrowser {
	
	
	
	@BeforeClass
	public void SetUp() {
		InitialiseBrowser("chrome");
	
	}
	@AfterClass
	public void tearDown() {
		TestBaseBrowser.driver.close();
	}
	
	@Test
	public void automationPracticeRegistrationPageTest() {
		AutomationPrcticeRegistrationPage test = new AutomationPrcticeRegistrationPage(driver);
		test.VerifyAutomationPrcticeSignButn();
		test.VeryfyEmailTextField();
		test.VerifycreateAccountButn();
        test.VerifyMrRadioButton();
        test.VerifyFirstameTextField();
        test.VerifyLastNameTextField();
        test.VerifyLastNameTextField();
        test.VerifyPassWordTextField();
        test.VeryDayDropDownList(driver);
        test.VeryfyMonthsDropDown(driver);
        test.VeryfyYearsDropDown(driver);
        test.VerifyNewsLetterSelectBox();
        test.VerifyCompanyTextField();
        test.VerifyaddressTextFiElementld();
        test.Verifyaddress2TextFiElementld();
        test.VerifyCityTextField();
        
        
		
	}

}
