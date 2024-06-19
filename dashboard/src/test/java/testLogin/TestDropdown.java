package testLogin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdown {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement eleDropdown = driver.findElement(By.id("oldSelectMenu"));
		Select select = new Select(eleDropdown);
		
		// listing out all the options in the dropdown
//		List<WebElement> options = select.getOptions();
//		
//		options.forEach(option -> System.out.println(option.getText()));
		
		//selecting an option by index
		select.selectByIndex(3);
		
		//selecting an option by value
		select.selectByValue("5");
		
		//selecting an option by text
		select.selectByVisibleText("Green");
		System.out.println("Selected option is: " + select.getFirstSelectedOption().getText());
		
		
	}

}
