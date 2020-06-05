package com.gcr.testScipts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.diris.config.StartBrowser;
import com.gcr.objectrepository.Page_Products;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class Test_SortProducts extends StartBrowser{
	public static WebDriver driver;
	public static ActionDriver aDriver;
	
  @Test
  public void sortProductsMethod() throws Exception {
	  CommonFunctions cf = new CommonFunctions();
		driver = StartBrowser.driver;  // this will start all extent reports on browser start.
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Create New Account"); 
		//cf.login();
		aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		cf.login();
		aDriver.selectValueFromDropDown(Page_Products.txtProductSort, "lohi", "Products sorted by lowest price - dropdown");
		aDriver.selectVisibleTxtFromDropDown(Page_Products.txtProductSort, "Price (high to low)", "Products sorted by highest price - dropdown");
	  	// selectByindex -- didnt find the index
		
		//Next to select the items and add to the cart
  }
}
