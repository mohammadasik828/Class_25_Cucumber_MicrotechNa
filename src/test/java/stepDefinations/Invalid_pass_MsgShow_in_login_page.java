package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Invalid_pass_MsgShow_in_login_page extends Base{
	@Then("I Will Enter password {string}")
	public void i_will_enter_password(String password) {
	    sendKeys(By.name("pwd"),password);	
	}
	@When("I click on login button")
	public void i_click_on_login_button() {
	    click(By.name("login-submit"));
	}
	@Then("I see Invalid user name and password {string}")
	public void i_see_invalid_user_name_and_password(String expectedMsg) {
	    String actualMsg = getText(By.id("error-msg"));
	    assertEquals(expectedMsg, actualMsg);
	}
}
