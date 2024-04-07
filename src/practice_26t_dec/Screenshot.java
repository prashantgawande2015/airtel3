package practice_26t_dec;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//print swami
		System.out.println("shree swami samath");
		
// set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			// initilize the driver
		WebDriver driver = new ChromeDriver();
		
		// call the webpage
		driver.get("https://www.google.com/");
		
		TakesScreenshot objshot = (TakesScreenshot) driver;
		File objsource=  objshot.getScreenshotAs(OutputType.FILE);
		File objtarget = new File("C:\\Users\\HP\\OneDrive\\Desktop\\test.jpeg");
		
		Files.copy(objsource, objtarget);
		
		
		
	}

}
