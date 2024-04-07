package practice_26t_dec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_n_Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// print swami
		System.out.println("Shree swami samarth");
		// Set the property
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
					
		// initilize the webdriver
		WebDriver driver = new ChromeDriver();
		// load the webpage
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		// find the xpaht of frame
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		
		driver.switchTo().frame(frame);
		// driver.switchTo().frame("//*[@id=\"content\"]/iframe");
		// find the xpath of drag
		Thread.sleep(5000);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		// now create the oject of actions class
		Actions objaction = new Actions(driver);
		// now use objaction.dragAndDrop() method

		objaction.dragAndDrop(drag, drop).build().perform();

	}

}
