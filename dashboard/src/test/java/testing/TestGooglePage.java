package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchFunction;

public class TestGooglePage {

	public static void main(String[] args) {
		
		GoogleSearchFunction find = new GoogleSearchFunction();

		find.SearchKey("tosca");
				
		//find.teardown();
	}

}
