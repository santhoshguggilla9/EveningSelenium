package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	By email = By.id("Email");
//	By pwd = By.id("Password");
//	
//	By btnLogin = By.className("login-button");
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement pwd;
	
	@FindBy(className="login-button")
	WebElement btnLogin;
	
	public void login(String uname, String password)
	{
		email.sendKeys(uname);
		pwd.sendKeys(password);
		
		btnLogin.click();
	}
}
