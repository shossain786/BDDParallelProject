package com.saddy.stepdef;

import com.saddy.drivers.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefinitions {
    @Before
    public void setUp() {
        String browser = System.getProperty("browser", "chrome");
        WebDriverManager.setDriver(browser);
    }

    @After
    public void tearDown() {
        WebDriverManager.quitDriver();
    }
    @Given("I navigate to google page")
    public void i_navigate_to_google_page() {
    }

    @When("I click on the email link")
    public void i_click_on_the_email_link() {
    }

    @Then("I should see label of the Email page is {string}")
    public void i_should_see_label_of_the_email_page_is(String string) {
    }

    @Given("I navigate to yahoo page")
    public void i_navigate_to_yahoo_page() {
    }
    @When("I click on the Finance link")
    public void i_click_on_the_finance_link() {
    }
    @Then("I should see Title of the Email page is {string}")
    public void i_should_see_title_of_the_email_page_is(String string) {
    }
    @Then("I close the browser")
    public void i_close_the_browser() {
    }

}
