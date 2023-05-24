package selenium12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_Attribute {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		String url=driver.findElement(By.linkText("Gmail")).getAttribute("href");
	
		System.out.println(url);
		
        System.out.println(driver.getTitle());
	}

}
