package org.assignments.intellipath;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_3 {

//	
//	Assignment-3
//	Launch Chrome Browser
//	Navigate to Test URL  https://bhanusaii.wordpress.com/
//	Maximize the Browser Window
//	Get the Title of Page
//	Click on SELENIUM QUIZ-1 Link Text 
//	Switch from 0th Tab to 1st Tab
//	After Switching Get the Title of Page 
//	Switch from 1st  Tab to 2nd  Tab
//	After Switching Get the Title of Page 
//	Close 2nd Tab
//	Close 1st Tab 
	
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://bhanusaii.wordpress.com/");
		
		Thread.sleep(2000L);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='SELENIUM QUIZ-1']")).click();
		
		
		Thread.sleep(1000L);
		
		List<String> win = new ArrayList<String>(driver.getWindowHandles());
		
		 driver.switchTo().window(win.get(1));
		 
		 System.out.println(driver.getTitle());
		 
		 driver.switchTo().window(win.get(0));
		 
		 System.out.println(driver.getTitle());
		 
		 Thread.sleep(2000L);
		 
		 driver.switchTo().window(win.get(1));
		 driver.close();
		 
		driver.switchTo().window(win.get(0));
		
		driver.close();
		 
		 
		
		
		
		
		
	}
}
