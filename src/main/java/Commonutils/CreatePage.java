package Commonutils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreatePage 
{
WebDriver driver;

public CreatePage(WebDriver driver)
{
	this.driver=driver;
}
public WebElement getElement(String locator)
{
	By Locator=By.xpath(locator);
	return driver.findElement(Locator);
}

public void clickCreateLink() throws Exception
{
	WebElement clk=this.getElement(ReadData.getLocatore("login", "createQuoteLink"));
	clk.click();
}
public void drpdownFrom() throws Exception
{
	WebElement frm=this.getElement(ReadData.getLocatore("login", "fromDP"));
	Select select=new Select(frm);
	select.selectByVisibleText("Austria - Graz (GRZ)");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", frm);
}
public void todrpDwn() throws Exception
{
	WebElement to=this.getElement(ReadData.getLocatore("login", "toDP"));
	Select select=new Select(to);
	select.selectByVisibleText("Belgium - Brussels (BRU)");
}
public void inputDepart() throws Exception
{
	WebElement dept=this.getElement(ReadData.getLocatore("login", "departingTB"));
	dept.sendKeys("12/04/2024");
}
public void chkOneWay() throws Exception
{
	WebElement ret=this.getElement(ReadData.getLocatore("login", "onewayChk"));
	ret.click();
}
public void drpAdults() throws Exception
{
	WebElement adul=this.getElement(ReadData.getLocatore("login", "adultsDP"));
   Select sel=new Select(adul);
   sel.selectByVisibleText("1");
}
public void drpChild() throws Exception
{
	WebElement chld=this.getElement(ReadData.getLocatore("login", "childrenDP"));
	Select sel=new Select(chld);
	sel.selectByVisibleText("1");
}
public void inputName() throws Exception
{
	WebElement nam=this.getElement(ReadData.getLocatore("login", "nameTB"));
	nam.sendKeys("spring");
}
public void inputPostCode() throws Exception
{
	WebElement post=this.getElement(ReadData.getLocatore("login", "postcodeTB"));
	post.sendKeys("FLCU01");
}
public void inputTelephone() throws Exception
{
	WebElement Contct=this.getElement(ReadData.getLocatore("login", "telephoneTB"));
	Contct.sendKeys("1234555553");
}
public void inputEmail() throws Exception
{
	WebElement eml=this.getElement(ReadData.getLocatore("login", "emailTB"));
	eml.sendKeys("spring@gmail.com");
}
public void submitCreate() throws Exception
{
	WebElement btn=this.getElement(ReadData.getLocatore("login", "btnCreateQuote"));
	btn.click();
}
}
