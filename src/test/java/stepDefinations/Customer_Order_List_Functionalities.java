package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Customer_Order_List_Functionalities extends Base{
	@When("I click order list button")
	public void i_click_order_list_button() {
	    click(By.xpath("//a[text()=' Order List ']"));
	}

	@Then("I see oder list page {string}")
	public void i_see_oder_list_page(String expectValue) {
		 String actualValue = getText(By.id("orderList-title"));
		 assertEquals(actualValue, expectValue);
	}
}
