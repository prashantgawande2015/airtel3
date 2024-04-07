package practice_26t_dec;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACTION_CLASS_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// print swami
		System.out.println("Shree swami samarth");
		// Set the property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
			// initilize the webdriver
		WebDriver driver = new ChromeDriver();
		// load the webpage
		driver.get("https://www.google.com/");
		
		// create action class
		Actions objaction = new Actions(driver);
		WebElement google_serach = driver.findElement(By.xpath("//textarea[@name='q']"));
		
		google_serach.sendKeys("Sachin tendulkar");
		
		// per form key dwon event
		
		for(int i=0;i<5;i++)
		{	Thread.sleep(2000);
			objaction.sendKeys(Keys.ARROW_DOWN).build().perform();
			
		}
		

	}

}
