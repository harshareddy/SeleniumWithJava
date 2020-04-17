package org.assignments.intellipath;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4 {
	
//	Launch Chrome Browser
//	Navigate to Test URL  https://netbanking.hdfcbank.com/netbanking/
//	Maximize the Browser Window
//	Get the Title of Page
//	Click on knowmore Link Text Window
//	After Switching Get the Title of Page 
//	Switch from 1st  Window to 0nd  Window
//	After Switching Get the Title of Page 
//	Close all windows of Browser 


	public static void main(String args[]) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.manage().window().maximize();
		System.out.println("Title  "+driver.getTitle());
		
		Thread.sleep(2000L);
		
		driver.switchTo().frame("login_page");
		
		driver.findElement(By.xpath("(//a[text()='Know More'])[1]")).click();
		
		Thread.sleep(5000L);
		
		List<String> win = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(win.get(1));
		
		System.out.println("Title after switcing "+driver.getTitle());
		
		Thread.sleep(2000L);
		
		driver.switchTo().window(win.get(0));
		Thread.sleep(2000L);
		
		driver.close();
		
		
		driver.switchTo().window(win.get(1));
		
		Thread.sleep(2000L);
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}
}
