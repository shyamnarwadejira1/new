package com.May2022.qa.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.May2022.qa.Base.TestBaseBrowser;

public class utils extends TestBaseBrowser {
	
//	=============================================ExcelSheet2=====================================================
    public static String ReadWebsiteFromExcel(int c ,int r) throws EncryptedDocumentException, IOException {
    	FileInputStream file1 = new FileInputStream("C:\\Users\\Shyam\\OneDrive\\Desktop\\WebSite.xlsx");
   		String value1 = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(c).getCell(r).getStringCellValue();
   		return value1;
   		
}
//=============================================SetProperty=================================================================================
 public static String Setproperty() {
	String syspro = System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	return syspro;
	
}


//====================================================== Excel Sheet ===================================================================
public static String ReadValueFromExcel(int row,int cols) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("E:\\21May2022\\src\\main\\java\\com\\May2022\\qa\\TestData.xlsx");
	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cols).getStringCellValue();
	return value;
   
}

//==================================================== Take screen shot=================================================================
public static void TakesScreenShotM(WebDriver driver, String testname) throws IOException {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Date date = new Date();
	
	String filename =testname + date.toString().replace(" ", "_").replace(":", "_")+".png";
	File destination=new File("E:\\21May2022\\ScreenShots\\"+filename);
	FileUtils.copyFile(src, destination);
	
}

//================================================= Java Script Exicutor===============================================================

public static void JsBorder(WebDriver driver, WebElement ele) {
JavascriptExecutor js=  ((JavascriptExecutor)driver);
js.executeScript("arguments[0].style.border='3px solid red'", ele);

}

public static String JsText(WebDriver driver) {
JavascriptExecutor js=  ((JavascriptExecutor)driver);
String titl1 = js.executeScript("return document.title").toString();
System.out.println(titl1);
return titl1;
}

public static void Jsclick(WebDriver driver, WebElement login) {
JavascriptExecutor js=  ((JavascriptExecutor)driver);
js.executeScript("arguments[0].click();", login);
driver.navigate().back();

}
public static void JsAlert(WebDriver driver,WebElement login, String massage) {
JavascriptExecutor js=  ((JavascriptExecutor)driver);
js.executeScript("arguments[0].click();", login);
js.executeScript("alert('"+massage+"')");
driver.switchTo().alert().accept();

}
public static void ScrollUp(WebDriver driver,WebElement login, int x,int y) throws InterruptedException {
JavascriptExecutor js=  ((JavascriptExecutor)driver);
Thread.sleep(2000);
js.executeScript("scroll("+x+","+y+")");

}

public static void ClickIntoPage(WebDriver driver, WebElement Createacc) {
JavascriptExecutor js=  ((JavascriptExecutor)driver);
js.executeScript("arguments[0].scrollIntoView(true);",Createacc );
Createacc.click();

}

}
