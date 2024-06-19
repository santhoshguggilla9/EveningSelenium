package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	WebDriver driver;
	
	public Logout(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//By logout = By.className("ico-logout");
	
	@FindBy(className="ico-logout")
	WebElement logout;
	
	public void logout()
	{
		logout.click();
	}
}
