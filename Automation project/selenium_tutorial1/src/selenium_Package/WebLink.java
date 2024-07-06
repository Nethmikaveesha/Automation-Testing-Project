package selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("http://stackoverflow.com/questions/tagged/java");
        WebElement link  = driver.findElement(By.linkText("Bicycles"));

        System.out.println(link.getAttribute("href")); // shows http://bicycles.stackexchange.com/
        System.out.println(link.getAttribute("linkText"));
	}

}
