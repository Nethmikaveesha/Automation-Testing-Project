package selenium_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("file:///F:/HDSE/Software%20Security/SS/User%20Registration.html");
		
		
WebElement searchBox=driver.findElement(By.id("tags"));

searchBox.sendKeys("s");

Thread.sleep(5000);
List <WebElement> result= driver.findElements(By.xpath("/html/body/form/fieldset/button"));
//loop 
for(WebElement searchResult:result)
{
	if(searchResult.getText().equals("SOAP"));
	searchResult.click();
	break;
}


	}

}
