package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MyFirstTestCase extends BaseTest {
	  @Test
       public static void loginTest() throws InterruptedException {
    	   
		driver.findElement(By.xpath(properties.getProperty("signin_link"))).click();
		driver.findElement(By.xpath(properties.getProperty("email_field"))).sendKeys("otienogordon95@gmail.com");
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click();
		Thread.sleep(2000);
		WebElement t= driver.findElement(By.xpath(properties.getProperty("password_field")));
		t.click();
		t.sendKeys("otieno95");
		driver.findElement(By.xpath(properties.getProperty("password_field"))).click();
		
	}

}
