package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.LoginPage;
import pagefactory.SearchPage;

public class SearchStepDefs {
	
	WebDriver driver;
	SharedSteps s;
	SearchPage sp;
	
	public SearchStepDefs(SharedSteps s) {
		this.s=s;
	}
	
	@Given("I am on Search page of demowebshop")
	public void i_am_on_search_page_of_demowebshop() {
		driver = s.getdriver();
	    sp = PageFactory.initElements(driver, SearchPage.class);
	    driver.get("http://demowebshop.tricentis.com/");
	    sp.ClickLoginLink();
	}

	@When("I search the product")
	public void i_search_the_product() {
		sp.ClickOnComputers();
	}

	@When("I click on Add to cart")
	public void i_click_on_add_to_cart() {
		sp.add_to_cart();
	}

	@Then("I click on Logout")
	public void i_click_on_logout() {
		sp.log_out();
	}

}
