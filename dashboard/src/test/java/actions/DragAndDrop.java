package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		try
		{
				driver.get("https://demoqa.com/droppable");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				WebElement eleSource = driver.findElement(By.id("draggable"));
				
				WebElement eleTarget = driver.findElement(By.id("droppable"));
				
				Actions builder = new Actions(driver);
				builder.dragAndDrop(eleSource, eleTarget).perform();
				
				String msg = eleTarget.getText();
				
				if(msg.equals("Dropped!"))
					System.out.println("Test Passed.");
				else
					System.out.println("Test Failed.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
