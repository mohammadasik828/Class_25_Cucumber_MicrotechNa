package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Employee_login extends Base {

	@When("I Will see Employee Login Page {string}")
	public void i_will_see_employee_login_page(String expectedValue) {
		String actualValue = getText(By.xpath("//h1[text()='Employee Login ']"));
		assertEquals(expectedValue, actualValue);
	}

	@Then("I Enter user id {string}")
	public void i_enter_user_id(String emailId) {
		sendKeys(By.name("mailuid"), emailId);
	}

	@Then("I Enter password {string}")
	public void i_enter_password(String password) {
		sendKeys(By.name("pwd"), password);
	}

	@When("I click login button")
	public void i_click_login_button() {
		click(By.name("login-submit"));
	}

	@Then("I Will see {string}")
	public void i_will_see(String expectedValue) {
		String actualValue = getText(By.xpath("//h2[text()='Welcome Test ']"));
		assertEquals(expectedValue, actualValue);
	}
}
