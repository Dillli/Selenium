package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWIndowHandleList {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://google.com");
		System.out.println(driver.getWindowHandle());
		

		
		WebElement google = driver.findElement(By.xpath("//div[@id='searchform']//div[@class='FPdoLc tfB0Bf']//input[@aria-label='Google Search'and @name='btnK']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", google);
		Set<String> handles = driver.getWindowHandles();
		
		List<String> windowsList = new ArrayList<String>(handles);
		
		String parentWindowID = windowsList.get(0);
		String childWindowID = windowsList.get(1);

		System.out.println(parentWindowID);
		System.out.println(childWindowID);

		
	}

}
