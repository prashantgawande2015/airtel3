package march_practice_18th;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down {

	public static void main(String[] args) throws InterruptedException {
		// print swami
		System.out.println("shree swami samarth");
		// set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		// initilize the driver
		WebDriver driver = new ChromeDriver();
		// call webpage
		driver.get("https://www.amazon.com/");
		// maximize the pae
		driver.manage().window().maximize();
		  //create object of javascriptExecutor Interface
		
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		// scroll down
		js.executeScript("window.scroll(0,4000)");
		
		// scroll up
		//Thread.sleep(4000);
			//	js.executeScript("window.scroll(0,-100)");
				
		
		
		

	}

}
