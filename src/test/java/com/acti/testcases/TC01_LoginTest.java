package com.acti.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.acti.base.DriverScript;
import com.acti.pages.LoginPage;

public class TC01_LoginTest extends BaseTest{
	
	@Test
	public void testLoginFunction(){			
		
		
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
		 boolean flag = loginpage.verifyActiLogo();
		 System.out.println(flag);
	}
	
}
