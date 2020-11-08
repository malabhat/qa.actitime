package com.acti.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.acti.base.DriverScript;
import com.acti.pages.LoginPage;

public class TC01_LoginTest extends DriverScript{
	@BeforeMethod
	public void preCondition()
	{
		initBrowser();
		launchApplication();
	}	
	@Test
	public void testLoginFunction(){		
		
		
		LoginPage loginpage = new LoginPage();
		loginpage.loginToApplication("admin", "manager");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	@Test
	public void testVerifyLogoDisplayed()
	{
		LoginPage loginpage = new LoginPage();
		 boolean flag = loginpage.verifyActiLogo();
		 System.out.println(flag);
	}
	@AfterMethod
	public void postCondition()
	{
		closeApplication();
	}
}
