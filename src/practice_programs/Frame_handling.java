package practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_handling {

	public static void main(String[] args) {
		// print swami 
		System.out.println("shree swami samarth");
		// set the path
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		// 	// initilize the WebDriver
		WebDriver driver = new ChromeDriver();
		// call the webpage
		driver.get("https://demo.guru99.com/test/guru99home/");
		// switch to frame
		driver.switchTo().frame("a077aa5e");
		// find xpath of frame
		WebElement frame_element = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		frame_element.click();
		// now swithc to default element
		driver.switchTo().defaultContent();
	WebElement email_textbox= driver.findElement(By.xpath("//input[@placeholder='Enter Email']"));
	email_textbox.sendKeys("test123@gmail.com");
	
		

	}

}
