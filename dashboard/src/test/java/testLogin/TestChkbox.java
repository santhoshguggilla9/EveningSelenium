package testLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChkbox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		WebElement remeberChk = driver.findElement(By.id("RememberMe"));
		remeberChk.click();
		
		boolean isChecked = remeberChk.isSelected();
		
		if(isChecked == true)
			System.out.println("Checkbox checked");
		else
			System.out.println("not checked");
		
//		WebElement genderRadio = driver.findElement(By.id("gender-male"));
//		genderRadio.click();
		
		
		
	}

}
