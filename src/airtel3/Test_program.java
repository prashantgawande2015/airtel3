package airtel3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Test_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print swami
		System.out.println("Shree Swami Samarth");
		// set property
		// set the property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	
		// Initialize the web Driver
		
		WebDriver driver = new ChromeDriver();
		// print the webpage
		driver.get("https://www.facebook.com/");
		
		
	}

}
