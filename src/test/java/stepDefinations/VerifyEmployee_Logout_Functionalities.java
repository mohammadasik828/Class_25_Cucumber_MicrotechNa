package stepDefinations;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;

public class VerifyEmployee_Logout_Functionalities extends Base{
	@Then("I Click Employee Logout button")
	public void i_click_employee_logout_button() {
	    click(By.linkText("Log Out"));
	}
}
