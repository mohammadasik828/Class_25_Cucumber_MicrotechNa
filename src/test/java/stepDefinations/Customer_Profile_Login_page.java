package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Customer_Profile_Login_page extends Base{
	@When("I Click on Login")
	public void i_click_on_login() {
	   click(By.xpath("//a[text()='LOG IN']"));
	}
	@Then("I enter User Id {string}")
	public void i_enter_user_id(String userId) {
	    sendKeys(By.name("mailuid"),userId);
	}
	@Then("I enter Password {string}")
	public void i_enter_password(String password) {
	   sendKeys(By.name("pwd"),password);
	}

	@When("I click Login button")
	public void i_click_login_button() {
	    click(By.name("login-submit"));
	}

	@Then("I will see {string}")
	public void i_will_see(String expectMsg) {
	   String actualMsg = getText(By.xpath("//h2[text()='Welcome David']"));
	   assertEquals(actualMsg, expectMsg);
	}
}
