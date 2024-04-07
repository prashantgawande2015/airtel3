package practice_programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screen_shot_demo {

	public static void main(String[] args) throws IOException {
		// print swami
		System.out.println("SHREE SWAMI SAMARTH");
		//set the property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			// initilize the webDriver
		WebDriver driver = new ChromeDriver();
		// call the webpage
		driver.get("https://www.google.com/");
		
		// screen shot process
		// use Takesscreenshot interface with typecasting
		TakesScreenshot objshot= (TakesScreenshot)driver;
		// Capturing Screenshot using FILE class
		File objsourcefile = objshot.getScreenshotAs(OutputType.FILE);
		// store file at our computer location
		File objtargetfile = new File("C:\\Users\\HP\\OneDrive\\Desktop\\screenshots\\testing.png");
		
				Files.copy(objsourcefile, objtargetfile);
		

	}

}
