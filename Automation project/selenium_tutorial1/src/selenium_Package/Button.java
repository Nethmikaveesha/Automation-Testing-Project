package selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ACER\\Desktop\\Quality Assurance\\geckodriver-v0.33.0-win64");
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///F:/HDSE/Software%20Security/SS/Send%20Message.html");
		WebElement button=driver.findElement(By.xpath("/html/body/form/fieldset/input"));
		int x= button.getLocation().getX();
		int y= button.getLocation().getX();
		System.out.println("X value is"+x);
		System.out.println("Y value is"+y);
		
       String color= button.getCssValue("background-color");
       System.out.println("Color is"+color);
       
       int width=button.getSize().getWidth();
       int height=button.getSize().getWidth();
       
       System.out.println("Height value is"+height);
		System.out.println("Width value is"+width);
		
		button.click();
	}

}
