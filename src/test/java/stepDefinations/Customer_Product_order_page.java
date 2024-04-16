package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;

public class Customer_Product_order_page extends Base{
	@Then("I will click Order Product")
	public void i_will_click_order_product() {
	    click(By.xpath("//a[text()='Order Product']"));
	}

	@Then("I select product")
	public void i_select_product() {
	    click(By.xpath("//option[text()='Choose Product Name']"));
	    click(By.xpath("//option[text()='Laptop']"));
	}

	@Then("I enter order date")
	public void i_enter_order_date() {
	   sendKeys(By.name("ordDate"),"20-01-2022");
	}

	@Then("I click order Product button")
	public void i_click_order_product_button() {
	    click(By.xpath("//button[text()='Order Product']"));
	}

	@Then("I will see {string} home Page")
	public void i_will_see_home_page(String expecteValue) {
	    String actualValue = getText(By.id("orderList-title"));
	    assertEquals(actualValue, expecteValue);
	}

	@Then("I click confirm button")
	public void i_click_confirm_button() {
	   click(By.xpath("//td[text()='626']/following-sibling::td[6]/a"));
	}

	@Then("refresh Url")
	public void refresh_url() {
	    getUrl("https://it.microtechlimited.com/////orderList.php?id=4");
	}

	@Then("I will see {string} status")
	public void i_will_see_status(String expecteValue) {
	   String actualValue = getText(By.xpath("//td[text()='626']/following-sibling::td[5]"));
	assertEquals(actualValue, expecteValue);
	}
}
