package practice_20_th_JAN;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screen_shot_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// print swami
		System.out.println("SHREE SWAMI SAMARTH");
		// set the path
		System.setProperty("webdriver.chrome.driver", null);
		// initilze the driver
		WebDriver driver = new ChromeDriver();
		// call the webpage
		driver.get("");;
		
		// user TakesScreenshot() interface
		TakesScreenshot objshot =(TakesScreenshot)driver;
		// use FILE class 
		File objsource = objshot.getScreenshotAs(OutputType.FILE);
		// use FILE class to store the file
		File objtartet = new File("C:\\Users\\HP\\OneDrive\\Desktop\\screenshots\\testing123.png");
		Files.copy(objsource, objtartet);
		
	
	
		
		
		
	}

}
