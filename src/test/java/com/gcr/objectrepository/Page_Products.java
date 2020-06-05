package com.gcr.objectrepository;

import org.openqa.selenium.By;

public class Page_Products {
	public static By txtProductSort=By.xpath("//select[@class='product_sort_container']");
	public static By imgAllproducts = By.xpath("//img[@class='inventory_item_img']");
	public static By imgProduct1 = By.xpath("//div[text()='Sauce Labs Backpack']");
	
	public static By imgProduct2 = By.xpath("//div[text()='Sauce Labs Fleece Jacket']");
	public static By imgShoppingCart=By.id("shopping_cart_container");
	
	public static By SelectProducts(String product)
	{
		return By.xpath("//div[text()='"+product+"']");
	}
	
	
	

}
