package Rams1112;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import loginpage.LOGINPAGE;

public class Ramspro {
	@Test
		public void Rams() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://rams.0gdev.ae/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
            
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scroll(0,3000)"); 
            Thread.sleep(5000);
            Actions sasi = new Actions(driver);
		    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"proceed-link\"]"))).build().perform();//mobile
			
			
			/*
			 * driver.findElement(By.xpath("//*[@id=\"Username\"]"));
			 * driver.findElement(By.xpath("//*[@id=\"Password\"]"));
			 * LOGINPAGE.username.sendKeys("Rams2024");
			 * LOGINPAGE.possword.sendKeys("123456"); LOGINPAGE.loginbutton.click();
			 */

	}

}
	
