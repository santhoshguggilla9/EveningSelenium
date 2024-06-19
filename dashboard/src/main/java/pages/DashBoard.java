package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {

	WebDriver driver;
	
	public DashBoard(WebDriver driver, String url)
	{
		this.driver = driver;
		driver.get(url);
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, this);
	}
	
	
	//By btnLogin = By.className("ico-login");
	
	@FindBy(className="ico-login")
	WebElement btnLogin;

	public void funLogin()
	{
		btnLogin.click();
	}
}
