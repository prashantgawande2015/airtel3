package practice_26t_dec;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_webTable_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
// print swami
		System.out.println("Shree swami samarth");
		// set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			// initilize the webdriver
		WebDriver driver = new ChromeDriver();
		// call the webpage
		driver.get("https://demo.guru99.com/test/web-table-element.php");
	
		// find the xpath of tablecell 
	WebElement tablecell = driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]"));
	System.out.println(tablecell.getText());
	
	// find the num of ROW
	List<WebElement> totalROW = driver.findElements(By.xpath("//table/tbody/tr"));
	System.out.println("Total ROW="+totalROW.size());
		
	
	//find the num of COL
	List <WebElement> totalCOL = driver.findElements(By.xpath("//table/thead/tr/th"));
	System.out.println("Total col"+totalCOL.size());
	
	//now print all values of dynamic table
	boolean companystatus= false;
		
	for(int i=0; i<totalROW.size();i++)
	{
		for( int j=0;j<totalCOL.size();j++)
		{
			WebElement alltablecell = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
			
			System.out.print(alltablecell.getText()+" | ");
			
			String value = alltablecell.getText();
		   Thread.sleep(5000);
		 //  WebDriverWait objwait = new WebDriverWait(driver,30);
			 // objwait.until(ExpectedConditions.textToBePresentInElementValue());
			  
			if(value.contains("NCC"))
			{
				companystatus=true;
				break;
			}
			
		}
	}
	
	}

}
