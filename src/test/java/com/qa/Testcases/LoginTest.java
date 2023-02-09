package com.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Base;
import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;

public class LoginTest extends Base {
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialize();
		
	 loginpage = new LoginPage();
	}
	@Test(priority=1)
	public void testLoginPageTitle() {
		
		String title = loginpage.verifyLoginTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		
	}
	
	@Test(priority=2)
	public void testLogin() {
		
		homepage = loginpage.verifyLogin(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
