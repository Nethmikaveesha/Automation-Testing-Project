package selenium_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ACER\\Desktop\\Quality Assurance\\geckodriver-v0.33.0-win64");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///F:/HDSE/Software%20Security/SS/User%20Registration.html");
		//WebElement Link= driver.findElement(By.xpath("/html/body/form/fieldset/button"));
		// String Link=gerAttribute("href");
		 //System.out.println(Link);
		 
		 //broken page 
		 WebElement Link1= driver.findElement(By.xpath("/html/body/form/fieldset/button"));
		 Link1.click();
		String title= driver.getTitle();
		System.out.println(title);
		if(title.contains("404"))
		{
			System.out.println("This page is not broken");
		}
		//back 
		//driver.navigate().back();
		//link 
		List<WebElement> links1=(List<WebElement>) driver.findElement(By.tagName("a")); 
		 int LinkCount=links1.size();
		 System.out.println(LinkCount);

	}

}
