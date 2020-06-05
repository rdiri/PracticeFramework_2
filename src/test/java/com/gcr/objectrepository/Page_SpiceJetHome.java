package com.gcr.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Page_SpiceJetHome {
	
	//Trip Radio buttons
	public static By rbtTripOneWay = By.xpath("//div[@id='travelOptions']/div[1]/input[@value='OneWay']"); // all other locator showed 2 of the same.
	public static By rbtTripTwoWay = By.xpath("//div[@id='travelOptions']//td[2]/input[@value='RoundTrip']");
	
	public static By rbtTripMultiCity = By.xpath("//table[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td[2]");
	
	//Departure & Destination DropDowns
	public static By drpDepartureCity = By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']");
	public static By DepartureCityoption=By.xpath("//a[@value='BLR']");
	public static By drpDestinationCity = By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']");
	public static By DestinationCityoption=By.xpath("//a[@value='MAA']");
	
	//trip Calendar dates 
	public static By calendarDepartureDate = By.xpath("//input[@name='ctl00$mainContent$view_date1']");
	public static By calendarReturnDate = By.xpath("//input[@name='ctl00$mainContent$view_date2']");
	// current date locate
	public static By CalendarCurrentDate = By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']");
	
	//Passengers Selection Drop down
	public static By drpPassengerInfo = By.id("divpaxinfo");
	public static By drpPassengerAdult = By.id("ctl00_mainContent_ddl_Adult");
	public static By drpPassengerChild = By.id("ctl00_mainContent_ddl_Child");
	public static By drpPassengerInfant = By.id("ctl00_mainContent_ddl_Infant");
	
	//Currency 
	public static By drpCurrency = By.cssSelector("#ctl00_mainContent_DropDownListCurrency");
	public static By drpCurrencyOption = By.cssSelector("#ctl00_mainContent_DropDownListCurrency");
	
	
	//Search
	public static By btnSearchFlights = By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']");

}
