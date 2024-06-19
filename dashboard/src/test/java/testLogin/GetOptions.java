package testLogin;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetOptions {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
	
		try 
		{
			driver.get("https://www.google.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
			WebElement dottedOption = driver.findElement(By.className("gb_d"));
			dottedOption.click();
			
			System.out.println("Main Handle: " + driver.getWindowHandle());		
			
			WebElement frm = driver.findElement(By.xpath("//iframe[@name='app']"));
			driver.switchTo().frame(frm);
			
			 List<WebElement> appItems = driver.findElements(By.xpath("//div[@aria-label='Google apps']//a"));
	         for (WebElement item : appItems) {
	             System.out.println(item.getText());
         }
		} catch (Exception e) {
		e.printStackTrace();
		}
		finally	{
			driver.quit();
		}

	}
}
