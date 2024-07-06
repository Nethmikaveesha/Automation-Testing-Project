package selenium_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ACER\\Desktop\\Quality Assurance\\geckodriver-v0.33.0-win64");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///F:/HDSE/Software%20Security/SS/User%20Registration.html");
		//WebElement dropdown=driver.findElement(By.id("role"));
		//Select select1=new Select(dropdown);
		//select1.selectByIndex(1);
		
		//WebElement dropdown2=driver.findElement(By.name("dropdown2"));
		//Select select2=new Select(dropdown2);
		//select2.selectByVisibleText("manager");
		
		//WebElement dropdown3=driver.findElement(By.id("role"));
		//Select select3=new Select(dropdown3);
		//select3.selectByValue("manager");
		
		//WebElement dropdown4=driver.findElement(By.id("role"));
		//Select select4=new Select(dropdown4);
		//List<WebElement> dropdownOptions=select4.getOptions();
		// int optionCount=dropdownOptions.size();
		//System.out.println(optionCount);
	
		WebElement dropdown5=driver.findElement(By.id("role"));
		dropdown5.sendKeys("C");
		
		
	}

}
