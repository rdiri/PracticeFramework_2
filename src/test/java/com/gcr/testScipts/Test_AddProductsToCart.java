package com.gcr.testScipts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.diris.config.StartBrowser;
import com.gcr.objectrepository.Page_CheckOutOverview;
import com.gcr.objectrepository.Page_InformationForCheckout;
import com.gcr.objectrepository.Page_Products;
import com.gcr.objectrepository.Page_ShoppingCart;
import com.gcr.reuse.CommonFunctions;
import com.gcr.wdcmds.ActionDriver;

public class Test_AddProductsToCart extends StartBrowser{
	public static WebDriver driver;
	public static ActionDriver aDriver;

	@Test
	public void addToCartMethod() throws Exception {

		CommonFunctions cf = new CommonFunctions();
		driver = StartBrowser.driver;  // this will start all extent reports on browser start.
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Create New Account"); 

		aDriver = new ActionDriver();
		aDriver.navigateToApplication();
		cf.login();

		
		aDriver.click(Page_Products.imgProduct1, "click on the First product");
		//aDriver.click(Page_Products.imgProduct2, "click on the second product");
		//how to navigate through each product and get each item link text. 
		// check for the item with link text that shows "Sauce Labs Backpack' and Sauce Labs Onesie
		//get that item price and add to cart. 

		aDriver.click(Page_Products.imgShoppingCart, "click on shopping-cart - image");
		//how to check the count of items added to cart
		aDriver.click(Page_ShoppingCart.btnCheckOut, "clicked on Checkout - Button");
		aDriver.type(Page_InformationForCheckout.txtFirstName, "Sam", "Entered First Name in - Text Box");
		aDriver.type(Page_InformationForCheckout.txtLastName, "Brook", "Entered Last Name in - Text Box");
		aDriver.type(Page_InformationForCheckout.txtzipCode, "56745", "Entered Zip Code in - Text Box");
		aDriver.click(Page_InformationForCheckout.btnContinue, "Clicked on Continue - Button");

		//How to Validate the payment information and amount

		aDriver.click(Page_CheckOutOverview.btnFinish, "Clicked on FINISH - Button");
		String FinishpageUrl=driver.getCurrentUrl();
		System.out.println(FinishpageUrl);

		Assert.assertEquals(FinishpageUrl, "https://www.saucedemo.com/checkout-complete.html");
		System.out.println("Successfully navigated");


		//how to validate if it navigated to the finish page, how to validate the url



	}
}
