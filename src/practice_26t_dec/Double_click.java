package practice_26t_dec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) {
		// print swami
System.out.println("shree swami samarth");
       // set the path
//Set the property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
			
// initilize the driver
WebDriver driver = new ChromeDriver();
// maximize the browser
driver.manage().window().maximize();
// set the implicitaly wait
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//call the webpage
driver.get("https://demoqa.com/buttons");
// find the xpath of button tobe click 2times
WebElement btn_2time_click = driver.findElement(By.xpath("//button [@id='doubleClickBtn']"));

// now create the object of  Actions class to 

Actions objaction = new Actions(driver);
objaction.doubleClick(btn_2time_click).doubleClick().build().perform();
String msg_name = btn_2time_click.getText();
//System.out.println(driver.findElement(By.xpath("//button [@id='doubleClickBtn']")).getText());



	}

}
