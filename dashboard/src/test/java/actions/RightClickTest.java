package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		try
		{
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				WebElement btnVote = driver.findElement(By.id("vote-poll-1"));
				
				//creating a reference for mouse actions using Actions class
				Actions action = new Actions(driver);
				
				//action.contextClick(btnVote).build().perform();
				action.contextClick(btnVote).perform(); // after sel 4
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		driver.close();
	}

}
