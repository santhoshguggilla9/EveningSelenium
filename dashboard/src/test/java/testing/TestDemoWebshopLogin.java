package testing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.DashBoard;
import pages.Login;
import pages.Logout;

public class TestDemoWebshopLogin {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		Properties prop = new Properties();
		String loc = "C:\\Users\\santh\\eclipse-workspace\\dashboard\\config.properties";
		
		BufferedReader reader = new BufferedReader(new FileReader(loc));
		prop.load(reader);
		
		DashBoard db = new DashBoard(driver,prop.getProperty("url"));
		Login lg = new Login(driver);
		Logout lout = new Logout(driver);
		
		db.funLogin();
		lg.login(prop.getProperty("username"),prop.getProperty("password"));
		lout.logout();
		
		driver.close();
	}
}
