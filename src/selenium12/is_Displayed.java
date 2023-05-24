package selenium12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_Displayed {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		if(driver.findElement(By.linkText("Log in")).isDisplayed())
		{
			System.out.println("Test Passed");
			
		}
		else {
			System.out.println("Test Failed");
		}
		
	}

}
