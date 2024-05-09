package Commonutils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser
{
	public static WebDriver driver;

	public static WebDriver lanchBrowser(String browsername)
	{

	if(browsername.equals("chrome"))
	driver = new ChromeDriver();
	else if (browsername.equals("edge"))
	driver = new EdgeDriver();
	else
	driver=new FirefoxDriver();

	return driver;
	}
	public static void openUrl(String url)
	{
	driver.get(url);
	}
	public static void closeBrowser()
	{
	driver.close();
	}

	public static void tackScreenShot(String imegename) throws Exception, Exception
	{
	TakesScreenshot ts =(TakesScreenshot) driver;
	FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(".//screnshot//"+imegename+".png"));
	}
}
