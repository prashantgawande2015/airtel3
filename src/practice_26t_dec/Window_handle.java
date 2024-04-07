package practice_26t_dec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {

	public static void main(String[] args) {
		// print swami
		System.out.println("SHREE SWAMI SAMARTH");
		// set the path
		System.setProperty("webdriver.chrome.driver", null);
		
		// initilize the webdriver
		WebDriver driver = new ChromeDriver();
		// call the webpage
		driver.get(null);
		
		

	}

}
