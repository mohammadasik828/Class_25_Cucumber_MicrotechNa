package stepDefinations;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Employee_Product_order_page_Functionalities extends Base{
	@When("I click Order Product button")
	public void i_click_order_product_button() {
	    click(By.linkText("Product Order"));
	}
	@Then("I see order product page {string}")
	public void i_see_order_product_page(String expectedValue) {
	   String actualValue = getText(By.xpath("//h2[text()='Order Product']"));
	}
}
