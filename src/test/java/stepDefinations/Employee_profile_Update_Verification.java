package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Employee_profile_Update_Verification extends Base{
	@Then("I will click update info button")
	public void i_will_click_update_info_button() {
	   click(By.name("send"));
	}
	@Then("I see {string} Employee Page")
	public void i_see_employee_page(String expectedValue) {
	  String actualValue = getText(By.xpath("//h2[text()='Update Employee Info'] "));
	  assertEquals(expectedValue, actualValue);
	}
	@Then("I Will update contact {string}")
	public void i_will_update_contact(String contactNumber) {
	  clear(By.name("contact"));
	  sendKeys(By.name("contact"),contactNumber);
	}
	@Then("I Will update address {string}")
	public void i_will_update_address(String addres) {
		 clear(By.name("address"));
		  sendKeys(By.name("address"),addres);
	}
	@Then("I Will click submit button")
	public void i_will_click_submit_button() {
	   click(By.name("update"));
	}
	@Then("I click refresh url")
	public void i_click_refresh_url() {
	    getUrl("http://it.microtechlimited.com//myprofile.php?id=102");
	}
	@Then("I will see Employee updated contact {string}")
	public void i_will_see_employee_updated_contact(String expectedValue) {
	   String actualValue = getValue(By.name("contact"),"value");
	   assertEquals(expectedValue, actualValue);
	}
	@Then("I will see Employee updated address {string}")
	public void i_will_see_employee_updated_address(String expectedValue) {
		String actualValue = getValue(By.name("address"),"value");
		   assertEquals(expectedValue, actualValue);
	}
}
