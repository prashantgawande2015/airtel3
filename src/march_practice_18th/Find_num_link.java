package march_practice_18th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_num_link {

	public static void main(String[] args) {
		// print swami
		System.out.println("Shree swami Samarth");
		// set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
			// initilze the webdriver
		WebDriver driver = new ChromeDriver();
		// call the webpage
		driver.get("https://www.google.com/");
		// maximize the page
		driver.manage().window().maximize();
		List<WebElement> total_link_count = driver.findElements(By.tagName("a"));
		System.out.println(total_link_count.size());
		
	for (int i=0;i<total_link_count.size();i++)
	{
		String name = total_link_count.get(i).getText();
		System.out.println(name);
	}
		

	}

}
