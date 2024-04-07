package practice_20_th_JAN;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_file_upload {

	public static void main(String[] args) throws InterruptedException {
	// print swami
		System.out.println("SHREE SWAMI SAMARTH");
		// Set the property
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
					// initilze the webdriver
		WebDriver driver = new ChromeDriver();
		// use implicitaly wait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		// call the webpage
		driver.get("https://demo.guru99.com/test/upload/");
		// find the xpath of choose_btn 
		WebElement choose_btn = driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		
		
		// now upload the file using sendkeys() method & give the path
		
		choose_btn.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\TestData.xlsx");
		
		Thread.sleep(3000);
		// find the xpath of checkbox
		WebElement check_box =driver.findElement(By.xpath("// input[@id='terms']"));
		check_box.click();
		
		// find the xpath of submit button
		WebElement submit_btn = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submit_btn.click();
		
		
	}

}
