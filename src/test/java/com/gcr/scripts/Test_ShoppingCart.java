package com.gcr.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_ShoppingCart {
	public WebDriver driver;
	
	
		@BeforeClass
		public void initiateWebDriver()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@BeforeTest
		public void NavigateToURL()
		{
			driver.get("https://www.http://automationpractice.com/");
			driver.findElement(By.className("login"));
			driver.findElement(By.id("email")).sendKeys("dvrama@gmail.com");
			driver.findElement(By.id("passwd")).sendKeys("dvrama");
			driver.findElement(By.id("SubmitLogin"));
			driver.findElement(By.name("submit_search")).sendKeys("Blouse");
					
		}
		
		  @AfterClass
		  public void afterClass() 
		  {
			  driver.quit();
		  }


	}

	

