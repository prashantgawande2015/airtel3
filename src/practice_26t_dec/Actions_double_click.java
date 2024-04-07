package practice_26t_dec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_double_click {

	public static void main(String[] args) {
		// print swami
		System.out.println("shree swami samarth");
		// Set the property
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
						
// intitilie the driver
		WebDriver driver= new ChromeDriver();
		// call the webpage
		driver.get("https://greentechnology.com/");
		
	//  create the object of Actions class
		Actions objecation = new Actions(driver);
		
		
		
	}

}
