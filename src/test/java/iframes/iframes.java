package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframes {
	WebDriver driver;
	
	 @BeforeTest
	 public void bt() {
		 //opemn the website 
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();	
}
	 @Test
	 public void iframeslist(){
		 WebElement size=		 driver.findElement(By.xpath("//iframe[@name='iframe-name']"));
		 System.out.println(size.getSize());
		 driver.switchTo().frame(size);
		 driver.findElement(By.linkText("Job Support")).click();
		 
		 
	 }
}
