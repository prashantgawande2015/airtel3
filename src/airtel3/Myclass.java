package airtel3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//print the swami
		System.out.println("shree swami Samarth");
		// set the path
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
	}

}
