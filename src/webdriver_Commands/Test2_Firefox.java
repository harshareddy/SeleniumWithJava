package webdriver_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2_Firefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		

	}

}
