package practice_26t_dec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print swami
		System.out.println("shree swami samarth");
		// set the path
		System.setProperty("", null);
		// initilze the webdriver
		WebDriver driver = new ChromeDriver();
	
		// call the webpage
		driver.get("https://www.google.com/");
		
		
	}

}
