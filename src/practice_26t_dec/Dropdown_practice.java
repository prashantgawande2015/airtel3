package practice_26t_dec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// print swami
		System.out.println("Shree swami samarth");
		// Set the property
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
						// initilize the driver
		WebDriver driver = new ChromeDriver();
		// callthe webpage
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		// find the xpath of dropdown list
		WebElement country_Dropdwon = driver.findElement(By.xpath("//select[@name='country']"));
		country_Dropdwon.click();
		
		// use select class
		Select objselect = new Select(country_Dropdwon);
		objselect.selectByIndex(0);
		objselect.selectByValue("INDIA");
		
		// now print the all the element of dropdown
		
	 List<WebElement> alldropdownoptions = objselect.getOptions();
		
		for(WebElement option: alldropdownoptions)
		{
			System.out.println(option.getText());
		}
		
		
		
	}

}
