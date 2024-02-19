package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoho.com/");
		driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div/div/div[3]/div/div[4]/div/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='login_id']")).sendKeys("otienogordon95@gmail.com");
		driver.findElement(By.xpath("//*[@id='nextbtn']")).click();
		Thread.sleep(2000);
		WebElement t= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		t.click();
		t.sendKeys("otieno95");
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();
		
		

	}

}
