package march_practice_18th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print swami
				System.out.println("Shree swami samarth");
				// set the property
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
					// initilize the driver
				WebDriver driver = new ChromeDriver();
				// call the webpage
				driver.get("https://jqueryui.com/droppable/");
				// maximize the page
				driver.manage().window().maximize();
				// apply the implicit wait as global wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// find xpath of frame
				WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
				driver.switchTo().frame(frame);
				Actions objaction = new Actions(driver);
				
				// find the xpath of webElement drag 
				WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
					// find xpath of weblement drop 
				WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
				
				objaction.dragAndDrop(drag, drop).build().perform();
				System.out.println("drag n drop operation executed succssfully");
	}

}
