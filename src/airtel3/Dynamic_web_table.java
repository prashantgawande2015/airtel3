package airtel3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_web_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print swami
		System.out.println("shree swami samarth");
		// set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			// initilize the driver
		WebDriver driver = new ChromeDriver();
		// call the webpage
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		// find the x-path any cellvalue
		WebElement cellvalue = driver.findElement(By.xpath("//table/tbody/tr[4]/td[1]"));
		
		// now find the total num of ROW
		
		List<WebElement> totalrow =driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Total number of ROWS="+totalrow.size());
		
		
		// now find total number of ROW
		
		List <WebElement> totalcol= driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("Total number of COL="+totalcol.size());
		
		
		// LOGIN to find the perticular company name which is dynamic in table.
		boolean companystatus= false;
		for(int i=0;i<totalrow.size();i++)
		{
			
			WebElement element = totalrow.get(i);
			String value = element.getText();
			if(value.contains("IDFC L"))
			{
				System.out.println("hi");
				companystatus=true;
				System.out.println(value);
				break;
			}
			
			
		}
		
		

	}

}
