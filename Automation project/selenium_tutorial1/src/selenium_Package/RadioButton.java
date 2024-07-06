package selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ACER\\Desktop\\Quality Assurance\\geckodriver-v0.33.0-win64");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///F:/HDSE/Software%20Security/SS/User%20Registration.html");
		 WebElement school1=driver.findElement(By.xpath("//*[@id=\"university\"]"));
		 school1.click();
		 WebElement school2=driver.findElement(By.xpath("//*[@id=\"school\"]"));
		 if(school2.isSelected()==true)
		 {
			 System.out.println("School button is selected");
			 
		 }
		 if(school2.isSelected()==false)
		 {
			 System.out.println("School button is unselected");
		 }
		 WebElement college=driver.findElement(By.xpath("//*[@id=\"college\"]"));
		 if(college.isSelected()==false)
		 {
			 college.click();
		 }
	}

}
