package selenium12;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.get("http://primusbank.qedgetech.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//driver.findElement(By.linkText("Site Map")).click();
		driver.findElement(By.xpath("//td/table/tbody/tr[5]/td/div/input")).click();
		//List<WebElement> links=driver.findElements(By.linkText("Customer Service"));
		//System.out.println(links.size());

	}

}
