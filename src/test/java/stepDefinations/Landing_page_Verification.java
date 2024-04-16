package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Landing_page_Verification extends Base{
	@Given("I am in Chrome Browser")
	public void i_am_in_chrome_browser() {
	    
	}
	@When("I navigate landing page url {string}")
	public void i_navigate_landing_page_url(String url) {
	    getUrl(url);
	}
	@Then("The Landing Page appear {string}")
	public void the_landing_page_appear(String expecteMsg) {
	 String actualMsg =  getText(By.xpath("//h1[text()='Welcome to MicroTech NA.']"));
		assertEquals(actualMsg, expecteMsg);		
	}
}
