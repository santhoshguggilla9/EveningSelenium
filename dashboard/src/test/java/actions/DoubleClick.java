package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		try
		{
				driver.get("https://demoqa.com/buttons");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				WebElement btnDclick = driver.findElement(By.id("doubleClickBtn"));
				
				//creating a reference for mouse actions using Actions class
				Actions action = new Actions(driver);
				
				//action.contextClick(btnVote).build().perform();
				action.doubleClick(btnDclick).perform(); // after sel 4
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//driver.close();
	}

}
