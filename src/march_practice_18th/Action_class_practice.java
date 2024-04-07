package march_practice_18th;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class_practice {

	public static void main(String[] args) throws InterruptedException {
		// print swami
		System.out.println("Shree swami samarth");
		// set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
			// initilize the webdriver
		WebDriver driver = new ChromeDriver();
		
		// call the webpage
		driver.get("https://www.google.com/");
		// find the xpath of google textbox
	Actions objaction = new Actions(driver);	
	WebElement 	google_textbox = driver.findElement(By.xpath("//textarea[@name='q']"));
	google_textbox.sendKeys("sachin Tendulkar");
	
	for( int i=0;i<5;i++)
		
	{
		Thread.sleep(2000);
		objaction.sendKeys(Keys.ARROW_DOWN).build().perform();
		
	}
		
		
	}

}
