package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Employee_product_order_page_verification extends Base{
	@When("I click order List button")
	public void i_click_order_list_button() {
	    click(By.linkText("Order List"));
		
	}

	@Then("I Will see order product list page {string}")
	public void i_will_see_order_product_list_page(String expectedValue) {
	   String actualValue = getText(By.xpath("//h2[text()='Employee Id: 102 ']"));
		assertEquals(expectedValue, actualValue);
	}
}
