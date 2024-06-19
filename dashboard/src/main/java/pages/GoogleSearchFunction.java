package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchFunction {

	WebDriver driver;
	
	public GoogleSearchFunction()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	
	By eleSearch = By.name("q");
	
	public void SearchKey(String key)
	{
		driver.findElement(eleSearch).sendKeys(key);
	}
	public void teardown()
	{
		driver.close();
	}
}
