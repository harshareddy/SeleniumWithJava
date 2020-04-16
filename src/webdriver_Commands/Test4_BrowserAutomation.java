package webdriver_Commands;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4_BrowserAutomation {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
				            driver.get("https://netbanking.hdfcbank.com/netbanking/");
				            //add wait Time  5sec 
		                   Thread.sleep(5000);
							//click on know more link text
							driver.switchTo().frame("login_page");
			
							driver.findElement(By.xpath("(//a[text()='Know More'])[1]")).click();
							Thread.sleep(5000);	
							
						
							
							//Handle Window
							ArrayList<String> wins=new ArrayList<String>(driver.getWindowHandles());
							System.out.println(wins);
							Thread.sleep(5000);	
							
							//switch from 0th window to 1st window
							driver.switchTo().window(wins.get(1)); //2nd Window in Browser
							
							Thread.sleep(5000);
							//switch from 0th window to 1st window
							driver.switchTo().window(wins.get(0)); //1ST Window in Browser
							
							Thread.sleep(5000);
							
							
				        //close the browser
							driver.close();
							
							//switch from 0th window to 1st window
							
						driver.switchTo().window(wins.get(1)); //1st Window in Browser

							Thread.sleep(5000);	
							//close the browser
							driver.close();
							
							
							//driver.quit();
							
		
		
		
	}

}