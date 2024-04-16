package stepDefinations;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;


public class Employee_profile_verification extends Base{
	

	@Then("I click My Profile button")
	public void i_click_my_profile_button() throws InterruptedException {
	    click(By.xpath("//a[text()='My Profile']"));
	    Thread.sleep(5000);
	}
	
}
