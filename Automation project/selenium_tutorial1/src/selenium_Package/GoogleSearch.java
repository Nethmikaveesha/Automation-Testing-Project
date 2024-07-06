package selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ACER\\Desktop\\Quality Assurance\\geckodriver-v0.33.0-win64");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("vdLsw")).sendKeys("Selenium"+ Keys.ENTER);
        driver.close();
        
	}

}
