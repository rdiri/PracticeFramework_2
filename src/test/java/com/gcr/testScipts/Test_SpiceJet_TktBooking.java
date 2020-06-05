package com.gcr.testScipts;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.diris.config.StartBrowser;
import com.gcr.objectrepository.Page_SpiceJetHome;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class Test_SpiceJet_TktBooking extends StartBrowser{
	
	public static WebDriver driver;
	public static ActionDriver aDriver;
	
	@SuppressWarnings("deprecation")
	@Test
	public void ticketBooking() throws Exception {

		CommonFunctions cf=new CommonFunctions();
		driver = StartBrowser.driver;
		aDriver=new ActionDriver();
		WebDriverWait wait = new WebDriverWait(driver, 15); 
		//cf.login();

		//Click two-way Trip radio Button
		StartBrowser.childTest = StartBrowser.parentTest.createNode("SpiceJet");
		aDriver.navigateToApplication("https://www.spicejet.com/");
		aDriver.click(Page_SpiceJetHome.rbtTripTwoWay, "Clicked Two-way trip - Radio Button");
		//WebDriverWait wait = new WebDriverWait(driver, 120);
		//wait.until(ExpectedConditions.elementToBeClickable(Page_SpiceJetHome.rbtTripTwoWay));
				
		//Click on Departure City Drop down
		aDriver.click(Page_SpiceJetHome.drpDepartureCity, "Clicked on Departure City - Drop Down");
		//wait.until(ExpectedConditions.elementToBeClickable(Page_SpiceJetHome.drpDepartureCity));
		//aDriver.selectValueFromDropDown(Page_SpiceJetHome.drpDepartureCity, "BLR", "Selected the Departure City Value from - Dropdown");
		
		aDriver.click(Page_SpiceJetHome.DepartureCityoption, "Clicked on Departure city - BLR");
		//Click on Destination City Drop down
		aDriver.click(Page_SpiceJetHome.drpDestinationCity, "Clicked on Destination City - DropDown");
		//aDriver.selectValueFromDropDown(Page_SpiceJetHome.drpDestinationCity, "HYD", "Slected the Destination City value from - Drop Down");
		//aDriver.click(Page_SpiceJetHome.DestinationCityoption, "Clicked on Destination City - Chennai");
		
		//Select Depart Date Calendar and Choose the current Date
			
		Date d=new Date(); 
		int date=d.getDate();
		int depDate = date+1;
		String dDate=Integer.toString(depDate);
		aDriver.click(By.linkText(dDate),"Departure date");
		//click on return date
		int rDate=d.getDate()+10;
		String retDate=Integer.toString(rDate);
		aDriver.click(By.linkText(retDate),"ReturnDate date");
		//aDriver.click(Page_SpiceJetHome.drpDestinationCity, "Clicked on Depart Date - Calendar");
		aDriver.click(Page_SpiceJetHome.CalendarCurrentDate,"Clicked on Current Date on - Departure Calendar");
		//Select Return Date Calendar and choose the future date
		
		aDriver.click(Page_SpiceJetHome.calendarReturnDate, "Clicked on Return date - Calendar");
		
		//Click on Passenger
		aDriver.click(Page_SpiceJetHome.drpPassengerInfo, "Clicked on Passenger - Drop Down");
		aDriver.selectValueFromDropDown(Page_SpiceJetHome.drpPassengerAdult, "2", "Selected Adult passengers");
		aDriver.selectValueFromDropDown(Page_SpiceJetHome.drpPassengerChild, "2", "Selected Child passengers");
		aDriver.selectValueFromDropDown(Page_SpiceJetHome.drpPassengerInfant, "1", "Selected Infant passengers");
		
		//select Currency
		aDriver.selectValueFromDropDown(Page_SpiceJetHome.drpCurrencyOption,"USD", "Selected Currency in USD");
		
		//Search
		aDriver.click(Page_SpiceJetHome.btnSearchFlights, "Clicked on Search - Button");
		


	}
}
