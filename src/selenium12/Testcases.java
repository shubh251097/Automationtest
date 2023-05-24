package selenium12;

import java.util.*;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Testcases {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		//driver.findElement(By.linkText("Images")).click();
		
		List<WebElement> links  = driver.findElements(By.linkText("Images"));
		System.out.println(links.size());
		
		
		driver.navigate().to("https://www.flipkart.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
				
        driver.get("https://www.swiggy.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        
        
	}

}
