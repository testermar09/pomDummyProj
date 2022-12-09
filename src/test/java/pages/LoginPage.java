package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class LoginPage extends BasePage  {
	
	//WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
		//this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement login;
	
	public void enterUserName()
	{
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0617");
		username.sendKeys("reyaz0617");
	}
	
	public void enterPassword()
	{
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
		password.sendKeys("reyaz123");
	}
	
	public void clickLogin()
	{
		//driver.findElement(By.xpath("//input[@name='login']")).click();
		
		login.click();
		
	}

	
	
	
}
