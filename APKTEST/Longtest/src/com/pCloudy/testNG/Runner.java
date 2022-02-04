package com.pCloudy.testNG;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Runner {

	AppiumDriverLocalService service;
	AppiumDriver<WebElement> driver;
	String folder_name;
	DateFormat df;
	
	@BeforeTest
	public void setUpSuite()   {
		
	}
		
	@BeforeMethod
	public void prepareTest() throws IOException, InterruptedException {
		
	
		
	DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("pCloudy_Username", "danish.faraz@sstsinc.com");
		capabilities.setCapability("pCloudy_ApiKey", "hhpg97q6k483pdxj3df3hg8h");
		capabilities.setCapability("pCloudy_DurationInMinutes", 15);
		capabilities.setCapability("newCommandTimeout", 6000);
		capabilities.setCapability("launchTimeout", 90000);
		capabilities.setCapability("pCloudy_noReset", "false");
		capabilities.setCapability("pCloudy_DeviceManufacturer", "Samsung");
		capabilities.setCapability("pCloudy_DeviceVersion", "11.0.0");
		capabilities.setCapability("platformVersion", "11.0.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("uiautomator2ServerLaunchTimeout", 120000);
		capabilities.setCapability("uiautomator2ServerInstallTimeout", 120000);
		capabilities.setCapability("pCloudy_ApplicationName", "shop1-1640458429.apk");
		capabilities.setCapability("appPackage", "com.ma.android");
		capabilities.setCapability("appActivity", "com.ma.android.MainActivity");
		capabilities.setCapability("pCloudy_WildNet", "false");
		capabilities.setCapability("pCloudy_EnableVideo", "false");
		capabilities.setCapability("pCloudy_EnablePerformanceData", "false");
		capabilities.setCapability("pCloudy_EnableDeviceLogs", "false");
		 driver = new AndroidDriver<WebElement>(new URL("https://us.pcloudy.com/appiumcloud/wd/hub"), capabilities); 
		
		 System.out.println("Driver Initilaize"); 
		
		 
	
			
	}
	
	    //SAMSUNG_GalaxyNote20_Android_11.0.0_765c8
	    //SAMSUNG_GalaxyS10_Android_9.0.0_01e83
	    //SAMSUNG_GalaxyS20_Android_11.0.0_2e84e
		//SAMSUNG_GalaxyNote9_Android_10.0.0_6b251
	    //SAMSUNG_GalaxyA31_Android_11.0.0_32c0a
		//Samsung_GalaxyA21s_Android_11.0.0_b13a4
		//Samsung_GalaxyA50_Android_11.0.0_310bf
		//ONEPLUS_OnePlus6_Android_10.0.0_1688c
		//SAMSUNG_GalaxyS10_Android_11.0.0_3306e
	    //SAMSUNG_GalaxyM40_Android_11.0.0_efd9b
        //XIAOMI_PocoX2_Android_10.0.0_9e081
	    //XIAOMI_RedmiNote10_Android_11.0.0_73b22
	    //XIAOMI_Mi11Lite_Android_11.0.0_18ffa
	    //ONEPLUS_8_Android_11.0.0_c4689
	    //VIVO_Y20_Android_10.0.0_abb3b

	
	
		@Test 
		public void Test() throws IOException, InterruptedException {
			
			//driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Skip All\"]/android.widget.TextView")).click();
		  
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@text='SEARCH']")).click();
		
	
		Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@text='Beauty']")).click(); 
	
	Thread.sleep(3000);
		  
	
	driver.findElement(By.xpath("//*[@resource-id='filter-icon']")).click();
	
		  Thread.sleep(3000);
		  
		  
		  driver.findElement(By.xpath("//*[@text='Category']")).click();
		  driver.findElement(By.xpath("//*[@text='Sun Protection & Tanning (653)']")).click();
		  
		  driver.findElement(By.xpath("//*[@resource-id='filter-icon']")).click();
	
		  Thread.sleep(3000);
		  
	
		  driver.findElement(By.xpath("//*[@text='Sort By']")).click();
		  driver.findElement(By.xpath("//*[@text='Price - Low to High']")).click();
		  
		  driver.findElement(By.xpath("//*[@resource-id='filter-icon']")).click();
	
		  Thread.sleep(3000);
	   // flingToEnd (performs quick swipes. 10 swipes max)
			   try {
				   driver.findElement(MobileBy.AndroidUIAutomator(
						   "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(12)"));
			   } catch (InvalidSelectorException e) {
				   // ignore
			   }
			   Thread.sleep(3000);
			   
		  driver.findElement(By.xpath("//*[@text='Price Range']")).click();
		  driver.findElement(By.xpath("//*[@text='$15.00 and Below (158)']")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//*[@resource-id='filter-icon']")).click();
	
		  Thread.sleep(3000);
		  
	   // flingToEnd (performs quick swipes. 10 swipes max)
			try {
				driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(12)"));
			} catch (InvalidSelectorException e) {
				// ignore
			}
	
			Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@text='Comments']")).sendKeys("Hello Shop");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@text='Submit Feedback']")).click();
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//*[@text='Ok']")).click();
		  driver.findElement(By.xpath("//*[@text='Alba Botanica - Sunscreen - Hawaiian - Spf30 - 1 Oz']")).click();
	
		  MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				  "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(1)" +
				   ".scrollIntoView(new UiSelector().text(\"Lists\"))"));
		  Thread.sleep(3000);
	
		  driver.findElement(By.xpath("//*[@text='Lists']")).click();
		  driver.findElement(By.xpath("//*[@text='Sign In']")).click();
		  driver.findElement(By.xpath("//*[@text='Sign In']")).click();
		  
		  driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.chrome:id/terms_accept']")).click();
		 
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.chrome:id/negative_button']")).click();
		 
		  Thread.sleep(5000);
		
		
		  driver.findElement(By.xpath("//android.widget.EditText[@resource-id='email']")).sendKeys("pcloudy.support@gmail.com");
		  Thread.sleep(3000);
		 
		  driver.findElement(By.xpath("//android.widget.EditText[@resource-id='password']")).sendKeys("Pcloudy@12345");
		  
		  
		  //Click on search flights button
		  driver.findElement(By.xpath("//android.widget.Button[@resource-id='signIn']")).click();      
		 
		  Thread.sleep(8000);
	driver.findElement(By.xpath("//*[@text='HOME']")).click();
	
	driver.findElement(By.xpath("//*[@text='SEARCH']")).click();
	
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@text='Beauty']")).click(); 
	
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//*[@resource-id='filter-icon']")).click();
	
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//*[@text='Category']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@text='Sun Protection & Tanning (653)']")).click();
	
	driver.findElement(By.xpath("//*[@resource-id='filter-icon']")).click();
	
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//*[@text='Sort By']")).click();
	driver.findElement(By.xpath("//*[@text='Price - Low to High']")).click();
	
	driver.findElement(By.xpath("//*[@resource-id='filter-icon']")).click();
	
	Thread.sleep(3000);
	//flingToEnd (performs quick swipes. 10 swipes max)
		try {
			driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"));
		} catch (InvalidSelectorException e) {
			// ignore
		}
	
	driver.findElement(By.xpath("//*[@text='Price Range']")).click();
	driver.findElement(By.xpath("//*[@text='$15.00 and Below (158)']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@resource-id='filter-icon']")).click();
	
	Thread.sleep(3000);
	
	//flingToEnd (performs quick swipes. 10 swipes max)
		try {
			driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(12)"));
		} catch (InvalidSelectorException e) {
			// ignore
		}
	
		Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@text='Comments']")).sendKeys("Hello Shop");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@text='Submit Feedback']")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@text='Ok']")).click();
	driver.findElement(By.xpath("//*[@text='Alba Botanica - Sunscreen - Hawaiian - Spf30 - 1 Oz']")).click();
	
	MobileElement element11 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(1)" +
			 ".scrollIntoView(new UiSelector().text(\"Lists\"))"));
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@text='Lists']")).click();
	
	driver.findElement(By.xpath("//*[@text='My Lists']")).click();
	driver.findElement(By.xpath("//*[@text='MYLIST']")).click();
	driver.findElement(By.xpath("//*[@text='Ok']")).click();
	driver.findElement(By.xpath("//*[@text='Ok']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@resource-id='icon']")).click();
	driver.findElement(By.xpath("//*[@text='ACCOUNT']")).click();
	driver.findElement(By.xpath("//*[@text='My Lists']")).click();
	driver.findElement(By.xpath("//*[@text='MYLIST']")).click();
	driver.findElement(By.xpath("//*[@resource-id='more-toggle']")).click();
	driver.findElement(By.xpath("//*[@text='Delete']")).click();
	
	Thread.sleep(8000);
		  
		  driver.quit();
			
			
		}
		
			 @Test
		public void Test1() throws IOException, InterruptedException {
		
		//Click on Skip all
		  driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Skip All\"]/android.widget.TextView")).click();
		
		  Thread.sleep(3000);
		  //Click on Search
		  driver.findElement(By.xpath("//android.widget.TextView[@text='SEARCH']")).click();
		 
		  Thread.sleep(3000);
		  //Select Title Product
		  driver.findElement(By.xpath("//android.view.View[@resource-id='title']")).click();
		  
		  Thread.sleep(3000);
		//Select the product
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='product-name']")).click();
			
			Thread.sleep(3000);
			//Select ADD to Cart
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='button-text']")).click();
			Thread.sleep(3000);
		   
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='button-text']")).click();
		 
			Thread.sleep(3000);
		  //Select one way trip
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='button-text']")).click();
			Thread.sleep(5000);
		  //Select departure time
		 
		  
		 
		  driver.findElement(By.xpath("//android.widget.EditText[@resource-id='email']")).sendKeys("pcloudy.support@gmail.com");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//android.widget.EditText[@resource-id='password']")).sendKeys("Pcloudy@12345");
		  Thread.sleep(3000);
		  
		  //Click on search flights button
		  driver.findElement(By.xpath("//android.widget.Button[@resource-id='signIn']")).click();      
		
		  Thread.sleep(8000);
		  driver.findElement(By.xpath("//android.widget.TextView[@text='HOME']")).click();
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@text='CART']")).click();
		 
		  driver.quit();
		
			
		}
	
		@Test
		public void Test2() throws IOException, InterruptedException {
			
			
			
		//Click on Skip all
		  driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Skip All\"]/android.widget.TextView")).click();
		 
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@text='ACCOUNT']")).click();		
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='button-text']")).click();
		  
			Thread.sleep(5000);
		  //Select departure time
		//  driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.chrome:id/terms_accept']")).click();
		//  captureScreenShots();
		 //   Thread.sleep(3000);
		 //   driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.chrome:id/negative_button']")).click();
		//  captureScreenShots();
	   //   Thread.sleep(5000);
		  driver.findElement(By.xpath("//android.widget.EditText[@resource-id='email']")).sendKeys("pcloudy.support@gmail.com");
		 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//android.widget.EditText[@resource-id='password']")).sendKeys("Pcloudy@12345");
	  
		  //Click on search flights button
		  driver.findElement(By.xpath("//android.widget.Button[@resource-id='signIn']")).click();      
		 
		  Thread.sleep(8000);
		  driver.findElement(By.xpath("//android.widget.TextView[@text='HOME']")).click();
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@text='CART']")).click();
		  
		  driver.quit();			
			
		  
			
		}
		
		
		
	
			@Test
		public void Test3() throws IOException, InterruptedException {
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Skip All\"]/android.widget.TextView")).click();
		  
		Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@text='ACCOUNT']")).click();		
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='button-text']")).click();
		  
		   Thread.sleep(5000);
		  //Select departure time
		
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//android.widget.EditText[@resource-id='email']")).sendKeys("test.account@gmail.com");
		 Thread.sleep(3000);
		  driver.findElement(By.xpath("//android.widget.EditText[@resource-id='password']")).sendKeys("Test@12345");
		 Thread.sleep(3000);
		  //Click on search flights button
		  driver.findElement(By.xpath("//android.widget.Button[@resource-id='signIn']")).click();      
		
		  Thread.sleep(8000);
		  driver.findElement(By.xpath("//android.widget.TextView[@text='HOME']")).click();
		 
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@text='CART']")).click();
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='button-text']")).click(); 
		  
		  driver.findElement(By.xpath("//android.widget.EditText[@resource-id='search-bar-text-input']")).sendKeys("electronics");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='text-search-text']")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='product-name']")).click();
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='button-text']")).click();
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='icon']")).click();
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@text='HOME']")).click();
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@text='CART']")).click(); 
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='button-text']")).click();
		  Thread.sleep(3000);
	
			
			  driver.quit();
			
		
		
		
		} 
		
		@Test
		public void Test4() throws IOException, InterruptedException {
			
			driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Skip All\"]/android.widget.TextView")).click();		
	
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='button-text']")).click();
	
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='icon']")).click();
	
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='icon']")).click();
	
		  driver.findElement(By.xpath("//android.view.View[@text='1-800-GOT-JUNK?']")).click();
	
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='button-text']")).click();
	
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='icon']")).click();
	
		  driver.quit();
	
			
		} 
		
		@Test
		public void Test5() throws IOException, InterruptedException {
			
			driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Skip All\"]/android.widget.TextView")).click();
			Thread.sleep(3000);
					driver.findElement(By.xpath("//android.widget.TextView[@text='ACCOUNT']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.view.View[@text='Country/Region']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.view.View[@text='United States']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.widget.TextView[@text='ACCOUNT']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.view.View[@text='Country/Region']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.view.View[@text='United Kingdom']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.widget.TextView[@text='Yes, I agree to allow browser cookies to be installed, providing for a better shopping experience.']")).click();
					
					// flingToEnd (performs quick swipes. 10 swipes max)
					try {
						driver.findElement(MobileBy.AndroidUIAutomator(
								"new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"));
					} catch (InvalidSelectorException e) {
						// ignore
					}
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.widget.TextView[@text='Yes, I have read the Terms of Use and Privacy Policy and agree to proceed.']")).click();
					
					driver.findElement(By.xpath("//android.widget.TextView[@text='I Agree to Proceed']")).click();
					
					Thread.sleep(3000);
					
					
					driver.findElement(By.xpath("//android.widget.TextView[@text='ACCOUNT']")).click(); 
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.view.View[@text='Country/Region']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.view.View[@text='Canada']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.widget.TextView[@text='ACCOUNT']")).click(); 
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.view.View[@text='Country/Region']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.view.View[@text='Singapore']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.widget.TextView[@text='ACCOUNT']")).click(); 
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.view.View[@text='Country/Region']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.view.View[@text='Australia']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.widget.TextView[@text='ACCOUNT']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.view.View[@text='Country/Region']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.view.View[@text='Malaysia']")).click();
					
					   driver.quit();
			
		}
		
		@Test
		public void Test6() throws IOException, InterruptedException {
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Skip All\"]/android.widget.TextView")).click();
		
		Thread.sleep(3000);
		
	 // flingToEnd (performs quick swipes. 10 swipes max)
			try {
				driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"));
			} catch (InvalidSelectorException e) {
				// ignore
			}
			driver.findElement(By.xpath("//*[@text='See more']")).click();
			
			// flingToEnd (performs quick swipes. 10 swipes max)
					try {
						driver.findElement(MobileBy.AndroidUIAutomator(
								"new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"));
					} catch (InvalidSelectorException e) {
						// ignore
					}
			
			driver.findElement(By.xpath("//*[@text='Shop']")).click();
		  
		  
	
		  
		  driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("test.account@gmail.com");
			   
		
		  
		  driver.findElement(By.xpath("//*[@text='Yes, I want Cashback!*']")).click();
		  Thread.sleep(8000);
		  
		 
	
			
			  driver.quit();
			
			
			
		}
		
		@Test
		public void Test7() throws IOException, InterruptedException {
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Skip All\"]/android.widget.TextView")).click();
		  
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@text='SEARCH']")).click();
		
	
		Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@text='Beauty']")).click(); 
	
	Thread.sleep(3000);
		  
	
	driver.findElement(By.xpath("//*[@resource-id='filter-icon']")).click();
	
		  Thread.sleep(3000);
		  
		  
		  driver.findElement(By.xpath("//*[@text='Category']")).click();
		  driver.findElement(By.xpath("//*[@text='Sun Protection & Tanning (653)']")).click();
		  
		  driver.findElement(By.xpath("//*[@resource-id='filter-icon']")).click();
	
		  Thread.sleep(3000);
		  
	
		  driver.findElement(By.xpath("//*[@text='Sort By']")).click();
		  driver.findElement(By.xpath("//*[@text='Price - Low to High']")).click();
		  
		  driver.findElement(By.xpath("//*[@resource-id='filter-icon']")).click();
	
		  Thread.sleep(3000);
	   // flingToEnd (performs quick swipes. 10 swipes max)
			   try {
				   driver.findElement(MobileBy.AndroidUIAutomator(
						   "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(12)"));
			   } catch (InvalidSelectorException e) {
				   // ignore
			   }
			   Thread.sleep(3000);
			   
		  driver.findElement(By.xpath("//*[@text='Price Range']")).click();
		  driver.findElement(By.xpath("//*[@text='$15.00 and Below (158)']")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//*[@resource-id='filter-icon']")).click();
	
		  Thread.sleep(3000);
		  
	   // flingToEnd (performs quick swipes. 10 swipes max)
			try {
				driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(12)"));
			} catch (InvalidSelectorException e) {
				// ignore
			}
	
			Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@text='Comments']")).sendKeys("Hello Shop");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@text='Submit Feedback']")).click();
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//*[@text='Ok']")).click();
		  driver.findElement(By.xpath("//*[@text='Alba Botanica - Sunscreen - Hawaiian - Spf30 - 1 Oz']")).click();
	
		  MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				  "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(1)" +
				   ".scrollIntoView(new UiSelector().text(\"Lists\"))"));
		  Thread.sleep(3000);
	
		  driver.findElement(By.xpath("//*[@text='Lists']")).click();
		  driver.findElement(By.xpath("//*[@text='Sign In']")).click();
		  driver.findElement(By.xpath("//*[@text='Sign In']")).click();
		  
		  
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//android.widget.EditText[@resource-id='email']")).sendKeys("pcloudy.support@gmail.com");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//android.widget.EditText[@resource-id='password']")).sendKeys("Pcloudy@12345");
		  Thread.sleep(3000);
		  
		  //Click on search flights button
		  driver.findElement(By.xpath("//android.widget.Button[@resource-id='signIn']")).click();      
		  
	
	driver.findElement(By.xpath("//*[@text='HOME']")).click();
	
	driver.findElement(By.xpath("//*[@text='SEARCH']")).click();
	
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@text='Beauty']")).click(); 
	
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//*[@resource-id='filter-icon']")).click();
	
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//*[@text='Category']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@text='Sun Protection & Tanning (653)']")).click();
	
	driver.findElement(By.xpath("//*[@resource-id='filter-icon']")).click();
	
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//*[@text='Sort By']")).click();
	driver.findElement(By.xpath("//*[@text='Price - Low to High']")).click();
	
	driver.findElement(By.xpath("//*[@resource-id='filter-icon']")).click();
	
	Thread.sleep(3000);
	//flingToEnd (performs quick swipes. 10 swipes max)
		try {
			driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"));
		} catch (InvalidSelectorException e) {
			// ignore
		}
	
	driver.findElement(By.xpath("//*[@text='Price Range']")).click();
	driver.findElement(By.xpath("//*[@text='$15.00 and Below (158)']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@resource-id='filter-icon']")).click();
	
	Thread.sleep(3000);
	
	//flingToEnd (performs quick swipes. 10 swipes max)
		try {
			driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(12)"));
		} catch (InvalidSelectorException e) {
			// ignore
		}
	
		Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@text='Comments']")).sendKeys("Hello Shop");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@text='Submit Feedback']")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@text='Ok']")).click();
	driver.findElement(By.xpath("//*[@text='Alba Botanica - Sunscreen - Hawaiian - Spf30 - 1 Oz']")).click();
	
	MobileElement element11 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			"new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(1)" +
			 ".scrollIntoView(new UiSelector().text(\"Lists\"))"));
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@text='Lists']")).click();
	
	driver.findElement(By.xpath("//*[@text='My Lists']")).click();
	driver.findElement(By.xpath("//*[@text='MYLIST']")).click();
	driver.findElement(By.xpath("//*[@text='Ok']")).click();
	driver.findElement(By.xpath("//*[@text='Ok']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@resource-id='icon']")).click();
	driver.findElement(By.xpath("//*[@text='ACCOUNT']")).click();
	driver.findElement(By.xpath("//*[@text='My Lists']")).click();
	driver.findElement(By.xpath("//*[@text='MYLIST']")).click();
	driver.findElement(By.xpath("//*[@resource-id='more-toggle']")).click();
	driver.findElement(By.xpath("//*[@text='Delete']")).click();
	
	Thread.sleep(3000);
		  
		  driver.quit();
			
			
			
			
		}	
	
	/*	@Test
	public void Test9() throws IOException, InterruptedException {
		
		
		
	}
	
	@Test
	public void Test10() throws IOException, InterruptedException {
		
		
		
	}
	
	@Test
	public void Test11() throws IOException, InterruptedException {
		
		
		
	}
	
	@Test
	public void Test12() throws IOException, InterruptedException {
		
		
		
	}
	
	@Test
	public void Test13() throws IOException, InterruptedException {
		
		
		
	}
	@Test
	public void Test14() throws IOException, InterruptedException {
		
		
		
	}
	
	@Test
	public void Test15() throws IOException, InterruptedException {
		
		
		
	}
	
	@Test
	public void Test16() throws IOException, InterruptedException {
		
		
		
	}*/
	
	

	@AfterMethod
	public void endTest() throws  IOException {

		driver.quit();
	}

	//Capture screenshot
	public void captureScreenShots() throws IOException {
        folder_name="screenshot";
        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //Date format for screenshot file name
        df=new  SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
        //create dir with given folder name
        new File(folder_name).mkdir();
        //Setting file name
        String file_name=df.format(new Date())+".png";
        //copy screenshot file into screenshot folder.
        FileUtils.copyFile(f, new File(folder_name + "/" + file_name));
    }
}
