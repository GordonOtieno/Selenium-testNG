package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ReadXlsData;

public class MyFirstTestCase extends BaseTest {
	  @Test(dataProviderClass = ReadXlsData.class, dataProvider = "bvt-data" )
       public static void loginTest( String username, String pass) throws InterruptedException {
    	   
		driver.findElement(By.xpath(properties.getProperty("signin_link"))).click();
		driver.findElement(By.xpath(properties.getProperty("email_field"))).sendKeys(username);
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click();
		Thread.sleep(2000);
		WebElement t= driver.findElement(By.xpath(properties.getProperty("password_field")));
		t.click();
		t.sendKeys(pass);
		driver.findElement(By.xpath(properties.getProperty("password_field"))).click();
		
	}
//	  @DataProvider(name = "testdata")
//	  public Object[][] tData(){
//		  
//		  return new Object[][] {
//			  {"otienogordon95s@gmail.com","otieno95"},
//			  {"otienogordon95@gmail.com","otienso95"},
//			  {"otienogordon95@gmail.com","otieno95"}
//		  };
//	  }

}
