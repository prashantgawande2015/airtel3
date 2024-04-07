package practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_file_upload {

	public static void main(String[] args) throws InterruptedException {
		
		// print swami
		System.out.println("SHREE SWAMI SAMARTH");
		// Set the property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
				// initialize the webdriver
		WebDriver driver= new ChromeDriver();
		// load the webpage
		driver.get("https://demo.guru99.com/test/upload/");
		// find xpath of the choose_file button
		
	WebElement choose_btn=	driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
	
	
	// with sendkeys method pass the file path
	choose_btn.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Sample_text_file.xlsx");	
	Thread.sleep(3000);
	
	// find the xpath of checkbox
	WebElement checkbox_check = driver.findElement(By.xpath("//input[@type='checkbox']"));
	checkbox_check.click();
	// click on submit button
	WebElement submit_btn = driver.findElement(By.xpath("//button[@id='submitbutton']"));
	submit_btn.click();
	

	}

}
