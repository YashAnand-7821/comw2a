package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	 public void setup() {
		 
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	 }
	 
	@Test
	 public void doLogin()
	 {
		
		
		 driver.get("https://www.google.com/");
		 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("GIT/GITHUB");
	 }
	 
	@AfterTest
	 public void TearDown()
	 {
		 driver.quit();
	 }

}
