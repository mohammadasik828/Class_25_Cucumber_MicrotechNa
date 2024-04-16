package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;

public class Customer_Profile_Update_Feature extends Base {
	@Then("I will click update info")
	public void i_will_click_update_info() {
		click(By.name("send"));
	}
	@Then("I see {string} page")
	public void i_see_page(String expecteCustInfo) {
		String actualCustInfo = getText(By.xpath("//h2[text()='Update Customer Info']"));
		assertEquals(actualCustInfo, expecteCustInfo);
	}
	@Then("I update contact")
	public void i_update_contact() {
     clear(By.name("contact"));
     sendKeys(By.name("contact"),"01752726848");
	}
	@Then("I update address")
	public void i_update_address() {
		clear(By.name("address"));
		sendKeys(By.name("address"),"Taltola");
	}
	@Then("I click submit button")
	public void i_click_submit_button() {
		click(By.name("update"));
	}
	@Then("I will click refresh url")
	public void i_will_click_refresh_url() {
		getUrl("http://it.microtechlimited.com//custMyProfile.php?id=%20%204");
	}
	@Then("I will see updated contact")
	public void i_will_see_updated_contact() {
		String actualValue = getValue(By.name("contact"),"value");
		assertEquals("01752726848", actualValue);
	}
	@Then("I will see updated address")
	public void i_will_see_updated_address() {
		String actualValue = getValue(By.name("address"),"value");
		assertEquals("Taltola", actualValue);
	}

}
