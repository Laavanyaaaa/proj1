package StepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import Commonutils.Browser;
import Commonutils.CreatePage;
import Commonutils.LoginPage;
import Commonutils.ReadData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest {
	WebDriver driver;
	LoginPage login;
	CreatePage quote;

	public LoginPageTest(Hooks hooks) {
		driver = hooks.driver;
	}

	@Given("User need to Login to Bp Url")
	public void user_need_to_login_to_bp_url() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		List<String> browserinfo = ReadData.getEcellData("browser", "sheet1", 1);
		Browser.openUrl(browserinfo.get(1));
		Thread.sleep(2000);

	}

	@When("Enter UserName")
	public void enter_user_name() throws Exception {
		login = new LoginPage(driver);
		login.loginInput(ReadData.getEcellData("Loginpage", 1, 0, "Sheet1"));
	}

	@When("Enter Password")
	public void enter_password() throws Exception {
		login.passwordInput(ReadData.getEcellData("Loginpage", 1, 1, "Sheet1"));
	}

	@Then("Click Login")
	public void click_login() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		login.loginSubmit();

	}
	
	@Given("Click CreateLnk")
	public void click_create_lnk() throws Exception {
		 quote = new CreatePage(driver);
	    quote.clickCreateLink();
	    Thread.sleep(2000);
	}

	
	@When("Select From Country")
	public void select_from_country() throws Exception 
	{
	    quote.drpdownFrom();
	    Thread.sleep(1000);
	}

	@When("Select State State")
	public void select_state_state() throws Exception 
	{
	    quote.todrpDwn();
	    Thread.sleep(1000);
	}

	@When("Enter Departing Date")
	public void enter_departing_date() throws Exception 
	{
	    quote.inputDepart();
	    Thread.sleep(1000);
	}

	@Then("Select Oneway checkbox")
	public void select_oneway_checkbox() throws Exception
	{
	   quote.chkOneWay();
	   Thread.sleep(1000);
	}

	@Then("Select no of Adults Dropdown")
	public void select_no_of_adults_dropdown() throws Exception
	{
	   quote.drpAdults();
	   Thread.sleep(1000);
	}

	@Then("Select no of Children Dropdown")
	public void select_no_of_children_dropdown() throws Exception 
	{
	    quote.drpChild();
	    Thread.sleep(1000);
	}

	@Then("Enter Name")
	public void enter_name() throws Exception 
	{
	   quote.inputName();
	   Thread.sleep(1000);
	}

	@Then("Enter Postcode")
	public void enter_postcode() throws Exception
	{
	    quote.inputPostCode();
	    Thread.sleep(1000);
	}

	@Then("Enter Telephone")
	public void enter_telephone() throws Exception
	{
	    quote.inputTelephone();
	    Thread.sleep(1000);
	}

	@Then("Enter Email")
	public void enter_email() throws Exception {
		quote.inputEmail();
		Thread.sleep(1000);
	    
	}

	@Then("Click Create quote button")
	public void click_create_quote_button() throws Exception
	{
	   quote.submitCreate();
	   Thread.sleep(1000);
	}


}
