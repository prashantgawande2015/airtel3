package practice_26t_dec;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_find_on_webpage {

	public static void main(String[] args) {
		// print swami
		System.out.println("shree swami samarth");
		// set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	// initilize the webdriver
		WebDriver driver = new ChromeDriver();
		// use implicitaly wait()
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// call the webpage
		driver.get("https://www.google.com/");
		// maximize the page
		driver.manage().window().maximize();
		
	List<WebElement> total_link_count=	driver.findElements(By.tagName("a"));
	System.out.println(total_link_count.size());
	
	// to print all the links
	for(int i=0; i<total_link_count.size();i++)
	{
		String linktext = total_link_count.get(i).getText();
		System.out.println(linktext);
	}

	}

}
