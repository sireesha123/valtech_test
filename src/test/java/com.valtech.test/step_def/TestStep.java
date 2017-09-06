package com.valtech.test.step_def;

import com.valtech.test.HomePage;
import com.valtech.test.NavigatePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class TestStep {
    private HomePage homePage;

    private NavigatePage navigatePage;

    public TestStep(HomePage homePage, NavigatePage navigatePage) {
        this.homePage = homePage;
        this.navigatePage = navigatePage;
    }

    @Given("^I am on homepage$")
    public void i_am_on_homepage() {
        assertThat(homePage.isOnHomePage(), is(equalTo(true)));
    }

    @Then("^I should see \"([^\"]*)\" section$")
    public void i_should_see_section(String expected) {
        assertThat(homePage.isLatestNewsLink(), equalToIgnoringCase(expected));
    }

    @When("^I navigate to \"([^\"]*)\"$")
    public void i_navigate_to(String navigateOption) {
        homePage.selectOptionFromNavigation(navigateOption);
    }

    @Then("^I should see respective \"([^\"]*)\"$")
    public void i_should_see_respective(String expected) {
        assertThat(navigatePage.isHeaderDisplayed(), equalToIgnoringCase(expected));
    }

    @When("^I navigate to contactUs$")
    public void iNavigateToContactUs() {
        navigatePage.navigeToContactUs();
    }

    @Then("^I should see offices count$")
    public void iShouldSeeOfficesCount() {
        assertThat(navigatePage.getListOfCountries(), equalTo(72));
    }
}
