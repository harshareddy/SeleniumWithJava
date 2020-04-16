package org.assignments.intellipath;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2 {
	
//	Launch Chrome Browser
//	Navigate to Test URL  https://bhanusaii.wordpress.com/
//	Maximize the Browser Window
//	Get the Title of Page
//	Click on SELENIUM QUIZ-1 Link Text 
//	Switch from 0th Tab to 1st Tab
//	After Switching Get the Title of Page 
//	Switch from 1st  Tab to 0nd  Tab
//	After Switching Get the Title of Page 
//	Close all windows of Browser 

	
	public static void main(String args[]) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://bhanusaii.wordpress.com/");
		Thread.sleep(2000L);
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[text()='SELENIUM QUIZ-1']")).click();
		
		List<String> win = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(win.get(1));
		Thread.sleep(2000L);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(win.get(0));
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(win.get(1));
		
		driver.close();
		
		
	}

}
