package practice_20_th_JAN;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class_practice {

	public static void main(String[] args) throws InterruptedException {
		
// print swami
		System.out.println("SHREE SWAMI SAMARTH");
		// set the path
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
				
// intilze the webdriver
		WebDriver driver = new ChromeDriver();
		// use the implicitaly wait
	//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
// call the webpage
		driver.get("https://www.google.com/");
// use action class
		Actions objactions = new Actions(driver);
		// find the xpath of textbox of google textbox
		WebElement google_Serach = driver.findElement(By.xpath("//textarea[@name='q']"));
		google_Serach.sendKeys("sachin tendulkar");
		
		for(int i=0;i<5;i++)
		{
			Thread.sleep(2000);
		objactions.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		
		
		
		
		
	}

}
