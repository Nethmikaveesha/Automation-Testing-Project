package selenium_Package;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ACER\\Desktop\\Quality Assurance\\geckodriver-v0.33.0-win64");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///F:/HDSE/Software%20Security/SS/User%20Registration.html");
		WebElement AlertButton= driver.findElement(By.xpath("/html/body/form/fieldset/button"));
		AlertButton.click();
		Alert  alert1=(Alert) driver.switchTo().alert();
		// alert.accept(); alert 
		// alert.dismiss(); alert
		// String text=alert.getText();  alert
		
		//line break 
		//if(text.contains("\n"))
		//{
		//System.out.println("Line breaks availabel");
		//else
		//{
		//System.out.println("Line breaks not available");
		//}

	}

}
