package com.qa.Pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base;

public class LoginPage extends Base {
	
	HomePage homepage;
	
	@FindBy(name="email")
	WebElement name;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement loginBTN;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String verifyLoginTitle() {
		return driver.getTitle();
	}
	
	public HomePage verifyLogin(String un,String pwd ) {
		Properties prop = new Properties();
		name.sendKeys(un);
		password.sendKeys(pwd);
		loginBTN.click();
		
		return new HomePage();
		
	}

}
