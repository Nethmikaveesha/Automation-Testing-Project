package selenium_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class OpenFirefox {

	public static void main(String[] args) {
		// 1. Open firefox
		// 2.Goto google https://www.google.com/
		// 3.Close firefox
       
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ACER\\Desktop\\Quality Assurance\\geckodriver-v0.33.0-win64");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.close();
		
	}

}
