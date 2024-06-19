package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		try 
		{
			driver.get("https://demoqa.com/frames");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			
			WebElement frmFirst = driver.findElement(By.id("frame1"));
			
			//switching to the frame by webelement
			driver.switchTo().frame(frmFirst);

//			//switching to the frame by index
//			driver.switchTo().frame(0);
//			
//			//switching to the frame by name
//			driver.switchTo().frame("frame1");
//						
			String msg = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
			System.out.println(msg);
			
			driver.switchTo().defaultContent();
			
			String msg1 = driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/h1")).getText();
			System.out.println(msg1);
			
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
