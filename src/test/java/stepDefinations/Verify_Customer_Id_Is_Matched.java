package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Verify_Customer_Id_Is_Matched extends Base{
	@Given("I am in Landing Page")
	public void i_am_in_landing_page()  {
		getUrl("http://it.microtechlimited.com");
		
	}
	@Then("Click  Login menu")
	public void click_login_menu() {
	 click(By.xpath("//a[text()='LOG IN']"));
		
	}
	@Then("Click Customer Login")
	public void click_customer_login() {
		 click(By.xpath("//a[text()='Customer Login']"));
		
	}
	@Then("Enter email id")
	public void enter_email_id() {
	   sendKeys(By.name("mailuid"),"david@gmail.com");
	}

	@Then("Enter pass")
	public void enter_pass() {
	    sendKeys(By.name("pwd"),"1234");
		
	}

	@Then("Click Login button")
	public void click_login_button() {
	  click(By.name("login-submit"));
	}

	@Then("Verify you are Home Page {string}")
	public void verify_you_are_home_page(String expecteMsg) {
	  String actualMsg = getText(By.xpath("//h2[text()='Welcome David']"));
	  assertEquals(actualMsg, expecteMsg);
	}

	@Then("Click Order Product")
	public void click_order_product() {
	  click(By.xpath("//a[text()=' Order List ']"));
	}

	@Then("Verify Customer Id is Matched {string}")
	public void verify_customer_id_is_matched(String expecteMsg) {
	   String actualMsg = getText(By.xpath("//h2[text()='Customer Id: 4 ']"));
	   assertEquals(actualMsg, expecteMsg);
	}
}
