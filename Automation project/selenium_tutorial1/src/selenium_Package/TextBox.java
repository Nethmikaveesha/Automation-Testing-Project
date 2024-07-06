package selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ACER\\Desktop\\Quality Assurance\\geckodriver-v0.33.0-win64");
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///F:/HDSE/Software%20Security/SS/Send%20Message.html");
		WebElement messageBox= driver.findElement(By.id("message"));
		messageBox.sendKeys("Hi Everyone");

	}

}
