package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;

public class Customer_Profile_Verification_Feature extends Base{
	@Then("I will click My Profile")
	public void i_will_click_my_profile() {
	   click(By.xpath("//a[text()='My Profile']")); 
	}

	@Then("I will seen My Info {string}")
	public void i_will_seen(String expecteMsg) {
	    String actualMsg = getText(By.xpath("//div[@class='card-body']/h2"));
	    assertEquals(actualMsg, expecteMsg);
	}

	@Then("I will see My First & Last name {string},{string}")
	public void i_will_see_my_first_last_name(String expectFirstName, String expectLastName) {
	    String actualFirstName = getValue(By.name("firstName"),"value");
	    assertEquals(actualFirstName, expectFirstName);
	    
	    String actualLastName = getValue(By.name("lastName"),"value");
	    assertEquals(actualLastName, expectLastName);	    		
	}

	@Then("I will see Email Address {string}")
	public void i_will_see_email_address(String expecteEmailId) {
		String actualEmailId = getValue(By.xpath("//input[@type='email']"),"value");
	    assertEquals(actualEmailId, expecteEmailId);
	}
	
	@Then("I will see Date of Birth & Gender {string},{string}")
	public void i_will_see_date_of_birth_gender(String expecteDateOfBirth, String expecteGender) {
		String actualDateOfBirth = getValue(By.name("birthday"),"value");
	    assertEquals(actualDateOfBirth, expecteDateOfBirth);
	    String actualGender = getValue(By.name("gender"),"value");
	    assertEquals(actualGender, expecteGender);
	}
	
	@Then("I will see Contact number {string}")
	public void i_will_see_contact_number(String expecteContactNumber) {
		String actualContactNumber = getValue(By.xpath("//input[@type='number']"),"value");
	    assertEquals(actualContactNumber, expecteContactNumber);
	}
	@Then("I will see Address {string}")
	public void i_will_see_address(String expecteAddress) {
	   String actualAddress = getValue(By.name("address"),"value");
	   assertEquals(actualAddress, expecteAddress);
	}

}
