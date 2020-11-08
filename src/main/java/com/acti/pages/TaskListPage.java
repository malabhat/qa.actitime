package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class TaskListPage extends DriverScript{
	@FindBy(xpath = "//div[@class ='title ellipsis']") WebElement addNewButton;
	@FindBy(xpath ="//div[@class='item createNewCustomer']") WebElement newCustomerItem;
	@FindBy(xpath ="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement customerNameTextbox;
	@FindBy(xpath ="//textarea[@class='textarea'])[8]") WebElement custDescriptionTextArea;	
	@FindBy(xpath ="//div[text()='Create Customer']") WebElement createCustomerButton;
	
	public TaskListPage() {
		
		PageFactory.initElements(driver, this);
	}
	public void clickAddNewButton(){
		addNewButton.click();
	}
	public void clickNewCustomerItem(){
		newCustomerItem.click();
	}
	public void enterCustomerName(String customerName){
		customerNameTextbox.sendKeys(customerName);
	}
	
}
