package SeleniumSessions;

import org.joda.time.Seconds;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String username = "admin";
		String password = "admin";
		
		//http://admin:admin@the-internet.herokuapp.com/basic_auth
		
		driver.get("http://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
//		Thread.sleep(4000);
		
		
//		driver.quit();
		
		
		
	}

}
