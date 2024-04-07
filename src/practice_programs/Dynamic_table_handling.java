package practice_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_table_handling {

	public static void main(String[] args) {
		
		// print swami
		System.out.println("SHREE SWAMI SAMARTH");
		// Set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			// initialize the webdriver
		WebDriver driver = new ChromeDriver();
		// call the webpage
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		// find the xpath of tablecell
		WebElement tablecell= driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]"));
		System.out.println(tablecell.getText());
		
		// print the number of ROW
		List<WebElement> total_row = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Total number of ROW"+total_row.size());
		
		// print the number of COL
		List<WebElement> total_COL = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("Total number of COL"+total_COL.size());
		
		// Print the all values of dynamic table
		
		for(int i=1;i< total_row.size();i++)
		{
			for(int j=1;j<total_COL.size();j++)
			{
				WebElement alltablecell= driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(alltablecell.getText()+ " | ");	
			}
			
			System.out.println();
		}
		
		

		
		
		
		
		
	}

}
