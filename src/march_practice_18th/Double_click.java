package march_practice_18th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) {
		//print swami
		System.out.println("shree swami samarth");
		// set the property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
			//inilize the driver
		WebDriver driver= new ChromeDriver();
		// call the webpage
		driver.get("https://demoqa.com/buttons");
		//maximize the window
		driver.manage().window().maximize();
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		// use ACtion class
		Actions objaction= new Actions(driver);
		
		// find xpath of btn where need perfomr double click
	
	WebElement btn_2time_click = driver.findElement(By.xpath("//button [@id='doubleClickBtn']"));
	//objaction.doubleClick(btn_2time_click).doubleClick().build().perform();
	objaction.doubleClick(btn_2time_click).doubleClick().build().perform();
		String msg_name = btn_2time_click.getText();
		
		System.out.println("double click operation done succssfully");
		
		
	}

}
