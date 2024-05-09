package Commonutils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
WebDriver driver;
public LoginPage(WebDriver driver)
{
	this.driver=driver;
}
public WebElement getElement(String locater)
{
By Locater = By.xpath(locater);
return driver.findElement(Locater);
}

public void loginInput(String input) throws Exception
{
	WebElement usr=this.getElement(ReadData.getLocatore("login", "usernameL"));
	usr.sendKeys(input);
}

public void passwordInput(String password) throws Exception
{
	WebElement pwd=this.getElement(ReadData.getLocatore("login", "PasswordL"));
	pwd.sendKeys(password);
}

public void loginSubmit() throws Exception
{
	WebElement btn=this.getElement(ReadData.getLocatore("login", "LoginL"));
	btn.click();
	Thread.sleep(3000);
}
}
