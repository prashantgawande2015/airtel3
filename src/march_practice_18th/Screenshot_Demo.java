package march_practice_18th;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_Demo {

	public static void main(String[] args) throws IOException {
		// print swami
		System.out.println("Shree swami samarth");
		// set the property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
			// initilize the driver
		WebDriver driver = new ChromeDriver();
		// load the webpage
		driver.get("https://www.google.com/");
		
		// use TakesScreeenshot interface
		
		         TakesScreenshot objshot = (TakesScreenshot)driver;
	             File objsource =objshot.getScreenshotAs(OutputType.FILE);
	             File objtarget = new File ("C:\\Users\\HP\\OneDrive\\Desktop\\screenshots\\28th_march_Screenshot.jpeg");
	             Files.copy(objsource, objtarget);
		
		

	}

}
