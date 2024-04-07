package march_practice_18th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_page_open {

	public static void main(String[] args) {
		// print swami
		System.out.println("shree swami samarth");
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
			
// initilize the driver
		WebDriver driver =new ChromeDriver();
		// call the webpage
		driver.get("https://www.google.com/");
		
		
		
		
	}

}
