package com.gcr.reuse;

import org.openqa.selenium.WebDriver;

import com.diris.config.StartBrowserSpiceJet;
import com.gcr.objectrepository.Page_Home;
import com.gcr.wdcmds.ActionDriverSpiceJet;

public class CommonFunctionsSpiceJet {
	public WebDriver driver;
	public  ActionDriverSpiceJet aDriver;
	
	public CommonFunctionsSpiceJet()
	{
		driver = StartBrowserSpiceJet.driver;
		aDriver = new ActionDriverSpiceJet();
	}
		

	
	public void login() throws Exception
	{
		StartBrowserSpiceJet.childTest = StartBrowserSpiceJet.parentTest.createNode("Login");  // this line of code creates the atHomeLogin step in Html Report
		// below actions come under the login step in Html report
		aDriver.navigateToApplication();
		aDriver.type(Page_Home.txtUsername, "standard_user", "username tex box");
		aDriver.type(Page_Home.txtpassword, "secret_sauce", "Password text box");
		aDriver.click(Page_Home.btnLogin, "Sign in button");
		
	}
	
	
	
	/*public void atHomeLogout() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("AtHome Logout");
		aDriver.mouseHover(AtHomeHomePage.menuAccount, "Menu Account");
		aDriver.click(AtHomeHomePage.lnkLogout, "Logout link");
		
	}*/

}
