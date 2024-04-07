package practice_20_th_JAN;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Load_google_page {

	public static void main(String[] args) {
		// print swami
		System.out.println("SHREE SWAMI SAMARTH");
	// set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

		//  initilize the webdriver
		WebDriver driver = new ChromeDriver();
		// set the implicitaly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// call the web page
		driver.get("https://www.google.com/");
		// maximize the web page
		driver.manage().window().maximize();
	
		
		
		

	}

}
