package march_practice_18th;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class2 {

	public static void main(String[] args) throws InterruptedException {
		
// print swami
		System.out.println("Shree swami samarth");
		// set the property path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
			//  initilze the webdriver
		WebDriver driver = new ChromeDriver();
		// call the webpage
		driver.get("https://www.google.com/");
		// find the xpath of Google_textbox page
		WebElement 	google_textbox = driver.findElement(By.xpath("//textarea[@name='q']"));
			// send the keya into the textbox
		google_textbox.sendKeys("APJ Abdul kalam");
		Actions objaction = new Actions(driver);

		for(int i=0;i<5;i++)
		{
			Thread.sleep(2000);
			objaction.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		
				
		
		
		
		

	}

}
