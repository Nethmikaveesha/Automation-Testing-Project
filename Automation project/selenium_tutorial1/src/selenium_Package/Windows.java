package selenium_Package;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ACER\\Desktop\\Quality Assurance\\geckodriver-v0.33.0-win64");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///F:/HDSE/Software%20Security/SS/User%20Registration.html");
		String oldWindow=driver.getWindowHandle();
		WebElement HomeButton= driver.findElement(By.xpath("/html/body/form/fieldset/button"));
        HomeButton.click();
        
        Set<String> newWindows= driver.getWindowHandles();
        
        int windowCount=newWindows.size();
        System.out.println("Windows count is:"+ windowCount);
        
        for(String window:newWindows)
        {
        if(!window.equals(oldWindow))
        {
        driver.switchTo().window(window).close();
        }
        }
        
       //
        //driver.quit();
        
        
	}

}
