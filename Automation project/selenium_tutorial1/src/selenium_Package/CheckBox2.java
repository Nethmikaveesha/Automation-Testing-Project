package selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ACER\\Desktop\\Quality Assurance\\geckodriver-v0.33.0-win64");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///F:/HDSE/Software%20Security/SS/User%20Registration.html");
		WebElement school1=driver.findElement(By.xpath("//*[@id=\"nibm\"]"));
		WebElement school2=driver.findElement(By.xpath("//*[@id=\"sliit\"]"));
		WebElement school3=driver.findElement(By.xpath("//*[@id=\"nsbm\"]"));
		
		 school1.click();
		 school2.click();
		 school3.click();
		 
	}

}
