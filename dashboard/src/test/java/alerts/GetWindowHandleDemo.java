package alerts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		try 
		{
			driver.get("https://demoqa.com/browser-windows");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			String ParentWindow = driver.getWindowHandle();
			System.out.println("Parent window is: " +ParentWindow);
			
			WebElement btnWindow = driver.findElement(By.id("windowButton"));
			btnWindow.click();
			
			Set<String> allHandles = driver.getWindowHandles();
			System.out.println(allHandles);
			
			Iterator<String> itr =  allHandles.iterator();
			
			while(itr.hasNext())
			{
				String ChilWindow = itr.next();
				
				if(!ParentWindow.equalsIgnoreCase(ChilWindow))
				{
					driver.switchTo().window(ChilWindow);
					WebElement getText = driver.switchTo().window(ChilWindow).findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
					System.out.println("Message in child window is: " + getText.getText());
					driver.close();
				}
			}
			driver.switchTo().window(ParentWindow);
			driver.findElement(By.xpath("//*[@id=\"messageWindowButton\"]")).click();
		
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
