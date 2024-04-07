package practice_26t_dec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_file_upload2 {

	public static void main(String[] args) throws InterruptedException {
		
		// print swami
		System.out.println("Shree swami samarth");
		// set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
								//initilze the webdriver
		WebDriver driver = new ChromeDriver();
		// call the webpage
	
		driver.get("https://demo.guru99.com/test/upload/");
	    // find xpath of upload button & with sendkey method pass the path
		WebElement choosebutton= driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
	   Thread.sleep(2000);
		choosebutton.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\TestData.xlsx");
	   
	    // click on Terms and Condition checkbox
	   WebElement chcekbox= driver.findElement(By.xpath("//input[@id='terms']"));
	   chcekbox.click();
	    Thread.sleep(3000);
	    
	// now click on submit button
	    WebElement submitbutton =driver.findElement(By.xpath("//button[@id='submitbutton']"));
	    submitbutton.click();
	    
		 
		
		
		

	}

}
