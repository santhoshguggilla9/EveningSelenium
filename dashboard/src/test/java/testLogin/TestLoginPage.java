package testLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.navigate().back(); // moves backwards
		
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().refresh(); //refresh the page
		
		driver.navigate().back();
		
		driver.navigate().forward(); //moves to next page
		
		
		//driver.close();
		
		
	}

}
