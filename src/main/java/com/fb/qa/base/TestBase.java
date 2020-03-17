package com.fb.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fb.qa.util.TestUtil;

public class TestBase{

static WebDriver driver;
static Properties prop;
	
 public TestBase(){
	
	try{
   		prop= new Properties();
   		FileInputStream ip = new FileInputStream("/Users/deepakmeher/eclipse-workspace/FreeCRMTest/"
   				+ "src/main/java/com/fb/qa/config/config.properties");
   		prop.load(ip);

	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch( IOException e) {
		e.printStackTrace();
	}
  }	



public static void intialization() {
	
String browserName =prop.getProperty("browser");
	if(browserName.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "/Users/deepakmeher/eclipse/chromedriver");
	driver= new ChromeDriver();
}

    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
    
    
    driver.get(prop.getProperty("url"));
}	




}








