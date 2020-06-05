package com.gcr.testScipts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.diris.config.StartBrowser;
import com.gcr.objectrepository.Page_Products;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class Test_ShoppingCart extends StartBrowser {
	public static WebDriver driver;
	public static ActionDriver aDriver;
  @Test
  public void addItemstoShoppingCart() throws Exception {
	  CommonFunctions cf = new CommonFunctions();
	  driver = StartBrowser.driver;  // this will start all extent reports on browser start.
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Create New Account"); 
		aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		cf.login();
		
		aDriver.click(Page_Products.SelectProducts("Sauce Labs Bike Light"), "Clicked on product");
	  
  }
}
