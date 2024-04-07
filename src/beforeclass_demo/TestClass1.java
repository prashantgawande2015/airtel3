package beforeclass_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	WebDriver driver;
	//@BeforeClass
	@BeforeMethod
	public void launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@Test
  public void TC_launch_google_page() {
		driver.get("https://www.google.com/");
  }
  
  @Test
  public void TC_launch_facebook_page() {
	  driver.get("https://www.facebook.com/");
  }
  
 
 // @AfterClass
  @BeforeMethod
   public void close_browser()
   {
	  driver.close();
   }
}
