package StepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import Commonutils.Browser;
import Commonutils.ReadData;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks
{
	WebDriver driver;
	@Before
	public void setup() throws Exception
	{
	List<String> browserinfo = ReadData.getEcellData("browser", "sheet1", 1);
	driver = Browser.lanchBrowser(browserinfo.get(0));
	}
	@After()
	public void tearDown() throws Exception
	{
	Browser.tackScreenShot("imagename");
	Browser.closeBrowser();
	}
}
