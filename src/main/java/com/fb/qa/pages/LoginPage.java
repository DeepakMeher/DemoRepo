package com.fb.qa.pages;

import com.fb.qa.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends TestBase{


	//PageFactory - OR:

    @FindBy(name="username")  
    WebElement username;
    
    @FindBy(name="password")
    WebElement password;
    
}