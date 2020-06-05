package com.gcr.testScipts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.diris.config.StartBrowser;
import com.gcr.objectrepository.Page_Home;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class Test_Login extends StartBrowser{
	public static WebDriver driver;
	public static ActionDriver aDriver;
  @Test
  public void loginMethod() throws Exception {
	  	CommonFunctions cf = new CommonFunctions();
		driver = StartBrowser.driver;  // this will start all extent reports on browser start.
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Create New Account"); 
		//cf.login();
		aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		cf.login();
		
		
	  
	  
	  
	  
	  
  }
  
}
