package practice_20_th_JAN;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_practice {

	public static void main(String[] args) {
		// print swami
		System.out.println("shree swami samarth");
		// set the path
		// set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// set the implicit wait
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		// call the webpage
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		// maximize the webpage
		driver.manage().window().maximize();
		// find the xpath of country dropdown
	WebElement country_dropdown=driver.findElement(By.xpath("//select[@name='country']"));
	country_dropdown.click();
	// use the Select Class
	Select objselect = new Select(country_dropdown);
	// select by index
	objselect.selectByIndex(5);
	// select by name
	objselect.selectByValue("INDIA");
	// Print the all the element from drop_down

	List <WebElement > alldrop_downoption = objselect.getOptions();
	for(WebElement option:alldrop_downoption )
	{
		System.out.println(option.getText());
	}
	
	
	
	

	}

}
