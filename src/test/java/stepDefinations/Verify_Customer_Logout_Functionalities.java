package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;

public class Verify_Customer_Logout_Functionalities extends Base{
	@Then("I Click Logout button")
	public void i_click_logout_button() {
	    click(By.xpath("//a[text()='Log Out']"));
	}
	 
	
	 @Then("I See Customer Login Page {string}")
	 public void i_see_customer_login_page(String expectedValue) {
		 String actualValue = getText(By.xpath("//h1[text()='Customer Login ']"));
		 assertEquals(expectedValue, actualValue);
	 }
}
