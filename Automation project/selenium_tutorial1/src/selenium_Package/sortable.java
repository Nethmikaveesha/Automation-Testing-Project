package selenium_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("file:///F:/HDSE/Software%20Security/SS/User%20Registration.html");
		List <WebElement> FrameButton= driver.findElements(By.xpath("/html/body/form/fieldset/button"));
		
		Actions actions=new Actions(driver);
		//actions.clickAndHold(listItems.get(6)).moveToElement(listItems.get(0)).release().build().perform();
		

	}

}
