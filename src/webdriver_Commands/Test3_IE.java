package webdriver_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test3_IE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		
		WebDriver ie = new InternetExplorerDriver();
		
		ie.get("https://facebook.com");
		
		Thread.sleep(5000);
		
		System.out.println(ie.getTitle());
		
		ie.close();
		

	}

}
