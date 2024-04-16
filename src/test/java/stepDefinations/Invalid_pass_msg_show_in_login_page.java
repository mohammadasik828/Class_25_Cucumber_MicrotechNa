package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Invalid_pass_msg_show_in_login_page extends Base{
	@Then("I enter emailid {string}")
	public void i_enter_emailid(String emailId) {
	    sendKeys(By.name("mailuid"),emailId);
	}

	@Then("I enter Passwordd {string}")
	public void i_enter_passwordd(String password) {
	   sendKeys(By.name("pwd"),password);
	}

	@When("I click loginn button")
	public void i_click_loginn_button() {
	    click(By.name("login-submit"));
	}

	@Then("I will check {string}")
	public void i_will_check(String expecteMsg) {
	  String actualMsg = getText(By.id("error-msg"));
	  assertEquals(actualMsg, expecteMsg);
	}

}
