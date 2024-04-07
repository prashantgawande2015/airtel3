package practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class_practice {

	public static void main(String[] args) throws InterruptedException {
		// print swami
		System.out.println("shree swami samarth");
		// set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			// initilize the webdriver
		WebDriver driver = new ChromeDriver();
		// call the webpage
		driver.get("https://www.google.com/");
		// maximize the page
		driver.manage().window().maximize();
		// find the xpath of google_search textbox
		// create object of action class
		Actions objaction = new Actions(driver);
		
		WebElement google_Search = driver.findElement(By.xpath("//textarea[@name='q']"));
		// enter the text into google_search textbox
		google_Search.sendKeys("sachin Tendulakar");
		// use for loop to move the cursor from top to down
		for(int i=0;i<5;i++)
		{
			Thread.sleep(2000);
            objaction.sendKeys(Keys.ARROW_DOWN).build().perform();

			
		}
		

	}

}
