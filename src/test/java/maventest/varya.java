package maventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class varya {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://norinco.stagingzar.com/login");
	driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Admin@123");
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[4]/button")).click();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         


	}

}
