package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		try 
		{
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			WebElement btnClick = driver.findElement(By.id("promtButton"));
			btnClick.click();

			// creating reference for alert
			Alert simple = driver.switchTo().alert();
//			String msg = simple.getText();
//			System.out.println(msg);
			
			simple.sendKeys("testing");
			simple.accept();
			
			driver.switchTo().defaultContent(); // it will return the control to the main window.
		} 
		catch (Exception e) 
		{
			System.out.println(e);

		}
		finally
		{
			//driver.close();
		}

	}

}
