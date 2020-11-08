package com.acti.testcases;

import org.testng.annotations.Test;

import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;
import com.acti.pages.TaskListPage;

public class TC02_CreateCustomer extends BaseTest{
	
	@Test
	public void testCreateCustomer() throws Exception{
		
	
		loginpage.loginToApplication("admin", "manager");				
		enterTimePage.clickTaskMenu();		
		taskPage.clickAddNewButton();
		taskPage.clickNewCustomerItem();
		taskPage.enterCustomerName("Joe Biden");
		
	}

}
