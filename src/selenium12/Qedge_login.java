package selenium12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qedge_login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		
		
		driver.get("http://apnacollege.in");
		driver.findElement(By.id("el_1658195955378_341")).click();
		driver.findElement(By.id("username")).sendKeys("Shubham Sultane");
		driver.findElement(By.id("email")).sendKeys("shubhamsultane@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sam@1996");
		driver.findElement(By.name("extralogin-cf_phonenumber")).sendKeys("8208137739");
		driver.findElement(By.className("btn-lbl")).click();
		
		driver.findElement(By.className("lw-topbar-option-link-lbl nowrap")).click();
		driver.findElement(By.className("lw-topbar-option-link-lbl nowrap")).click();
		driver.close();
		

	}

}


