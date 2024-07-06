package selenium_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("file:///F:/HDSE/Software%20Security/SS/User%20Registration.html");
		
		WebElement FrameButton= driver.findElement(By.xpath("/html/body/form/fieldset/button"));
        FrameButton.click();
       // driver.switchTo().frame(1);
       
        WebElement FrameButton1= driver.findElement(By.xpath("/html/body/form/fieldset/input"));
        FrameButton1.click();
        
        //frame 
       List<WebElement> noOfFrames=(List<WebElement>) driver.findElement(By.tagName("/html/body/form"));
       int frameCount=noOfFrames.size();
       System.out.println("Frame count is"+frameCount);
	}

}
