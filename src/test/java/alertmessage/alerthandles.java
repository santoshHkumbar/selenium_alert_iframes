package alertmessage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerthandles {
	WebDriver driver;
	
	
	 @BeforeTest
	 public void bt() {
		 //open the website 
		 WebDriverManager.chromedriver().setup();
		 //open with Chrome browser
		 driver = new ChromeDriver();
		 //Visiting the applications
		 driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		 //window to be maximize
		 driver.manage().window().maximize();	

}
	 @Test
	 public void alertbox() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//alert messages
		   driver.findElement(By.id("alertBox")).click();
		   Alert A = driver.switchTo().alert();
		   A.accept();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	 
	 @Test(dependsOnMethods = {"alertbox"})
	 public void confirmbox() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//alert messages
		   driver.findElement(By.id("confirmBox")).click();
		   Alert A = driver.switchTo().alert();
		   A.accept();
		 
	 }
	 @Test(dependsOnMethods = {"confirmbox"})
	 public void promptbox(){
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//alert messages
		   driver.findElement(By.id("promptBox")).click();
		   Alert A = driver.switchTo().alert();
		   A.accept();
		 
	 }
	 @AfterTest
	 public void close() {
		 driver.close();
	 }
}
