import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linear {
public static void main (String [] args) {
	System.setProperty("webdriver.gecko.driver", "./geckodriver");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("http://alex.academy/exe/signup/www/index.php");
	
	driver.findElement(By.id("id_fname")).sendKeys("Greg");
	driver.findElement(By.id("id_lname")).sendKeys("Zink");
	driver.findElement(By.id("id_email")).sendKeys("greg@mail.ru");
	driver.findElement(By.id("id_phone")).sendKeys("415 551-5544");
	
	driver.findElement(By.id("id_submit_button")).click();
	
	System.out.println(driver.getTitle().equals("Confirmation") ? "PASS" : "FAILED" );
	
	driver.quit();
}
}
