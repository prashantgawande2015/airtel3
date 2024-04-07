package march_practice_18th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Double_click2 {

	public static void main(String[] args) {
		// print swami
		System.out.println("shree swami samarth");
		// set the path
		System.setProperty("webdriver.chrome.driver", "");
	// initize the webdriver
		WebDriver driver =new ChromeDriver();
		
		// call the webpage
		driver.get("https://demoqa.com/buttons");
		// find the xpaht of double_click btn
		Actions objaction = new Actions(driver);
		WebElement btn_double_click = driver.findElement(By.xpath(""));
		
		objaction.doubleClick(btn_double_click).doubleClick().build().perform();
		
		String msg = btn_double_click.getText();
		System.out.println("DOBLE CLICK opratio  done ");
		
		

	}

}
