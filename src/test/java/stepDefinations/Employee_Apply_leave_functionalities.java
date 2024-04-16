package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Employee_Apply_leave_functionalities extends Base{
	@When("I Click Apply leave button")
	public void i_click_apply_leave_button() {
	    click(By.xpath("//a[text()='Apply Leave']"));
	}
	@Then("I See employee leave Page {string}")
	public void i_see_employee_leave_page(String expectedValue) {
	  String actualValue = getText(By.xpath("//h2[text()='Apply Leave Form']"));
	  assertEquals(expectedValue, actualValue);
	}
	@Then("I write reason for apply leave {string}")
	public void i_write_reason_for_apply_leave(String reason) {
	    sendKeys(By.name("reason"),reason);
	}
	@Then("I Enter Start Date {string}")
	public void i_enter_start_date(String startDate) {
	    sendKeys(By.name("start"),startDate);
	}
	@Then("I Enter End Date {string}")
	public void i_enter_end_date(String endDate) {
		sendKeys(By.name("end"),endDate);
	}
	@Then("I will click submit button")
	public void i_will_click_submit_button() {
	    click(By.xpath("//button[text()='Submit']"));  
	}
	@Then("I will refresh Url")
	public void i_will_refresh_url() {
	   getUrl("http://it.microtechlimited.com/////eloginwel.php?id=102");
	}
	@Then("I will see Apply leave reason and Status")
	public void i_will_see_apply_leave_reason_and_status() {   
	}
}
