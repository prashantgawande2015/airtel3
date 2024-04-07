package practice_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwon_practice {

	public static void main(String[] args) {
		// print swami
		System.out.println("Shree swami samarth");
		// set the property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			// intilise the driver
		WebDriver driver = new ChromeDriver();
		// call the webpage
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		// find the xpath of country_dropdown
		WebElement country_dropdown= driver.findElement(By.xpath("//select[@name='country']"));
		// use Select class & create its object
		
		Select objselect = new Select(country_dropdown);
		// print by index
		objselect.selectByValue("INDIA");
		//print by value
		objselect.selectByIndex(3);
		// print the all elements of dropdown
		
		List<WebElement> alldropdownoption = objselect.getOptions();
		
       for(WebElement option: alldropdownoption)
       {
    	   System.out.println(option.getText());
       }
	}

}
