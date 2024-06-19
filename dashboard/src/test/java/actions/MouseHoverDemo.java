package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		try
		{
				driver.get("https://export.ebay.com/in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				WebElement element = driver.findElement(By.id("top-level-link_2451"));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				Actions action = new Actions(driver);
				
				action.moveToElement(element).perform();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
