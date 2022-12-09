package testdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	
	
	@Test
	public void browserLaunchTest()
	{
		
		//WebDriverManager.chromedriver().setup();
		
		//WebDriver driver=new ChromeDriver();
		
		WebDriver driver=WebDriverManager.chromedriver().create();
		
		
	}
}
