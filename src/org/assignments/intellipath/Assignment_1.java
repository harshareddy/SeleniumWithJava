package org.assignments.intellipath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

//	1. Launch Chrome Browser
//	2. Navigate to Test URL https://www.google.com/
//	3. Maximize the Browser Window
//	4. Get Current URL of Page
//	5. Navigate to Test URL https://bhanusaii.wordpress.com/
//	6. Get Current URL of Page
//	7. Navigate back to Base URL https://www.google.com/
//	8. Get Current URL of Page
//	9. Navigate forward Test URL https://bhanusaii.wordpress.com/
//	10. Get Current URL of Page
//	11. Refresh the Current Page
//	12. Get Current URL of Page
//	13. Close the Browser
	
	
	public static void main(String args[]) throws InterruptedException
	{
		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000L);
		
		driver.navigate().to("https://bhanusaii.wordpress.com/");
		
		Thread.sleep(2000L);
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.navigate().back();
	    
	    Thread.sleep(2000L);
	    
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.navigate().forward();
	    
	    Thread.sleep(2000L);
	    
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.navigate().refresh();
	    
	    Thread.sleep(2000L);
	    
	    System.out.println(driver.getCurrentUrl());
	    
	   driver.close();
	    
	
	
		
		
		
	}
}
