package march_practice_18th;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_ {

	public static void main(String[] args) {
		// print swami
		System.out.println("Shree swami samarth");
		// set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
			// initilize the driver
		WebDriver driver =new ChromeDriver();
		// call the webpage
		driver.get("https://demo.guru99.com/test/newtours/register.php");
			// maximize the web page
		driver.manage().window().maximize();
		// apply implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// find the xpath of country_dropdown;
		
		WebElement country_Dropdwon = driver.findElement(By.xpath("//select[@name='country']"));
		country_Dropdwon.click();
		// use SELECT class
		Select objselect = new Select(country_Dropdwon);
		objselect.selectByIndex(0);
		objselect.selectByValue("INDIA");
		
		
		// code to print the all dropdown elements
		
		List<WebElement> alldropdownoption = objselect.getOptions();
		for(WebElement option : alldropdownoption)
		{
			System.out.println(option.getText());
		}

	}

}
