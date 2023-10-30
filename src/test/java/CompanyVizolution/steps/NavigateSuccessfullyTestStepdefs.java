package CompanyVizolution.steps;

import CompanyVizolution.pages.AboutUsPage;
import CompanyVizolution.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class NavigateSuccessfullyTestStepdefs {
    @Given("^User is on HomePage$")
    public void userIsOnHomePage() {
    }

    @When("^User clicks on Accept All button for accepting Cookies$")
    public void userClicksOnAcceptAllButtonForAcceptingCookies() {
        new HomePage().acceptAllCookieButton();
    }

    @And("^User selects Top Menu Bar \"([^\"]*)\"$")
    public void userSelectsTopMenuBar(String menu) {
        new HomePage().selectMenu(menu);
    }

    @And("^User clicks on Tab Menu Item \"([^\"]*)\"$")
    public void userClicksOnTabMenuItem(String menuItem) {
        new HomePage().selectMenuItem(menuItem);
    }

    @And("^User verifys the page by Header Title \"([^\"]*)\"$")
    public void userVerifysThePageByHeaderTitle(String expected) {
        Assert.assertEquals(expected, new AboutUsPage().verifyOurStoryTitle());
    }

    @And("^User scrolls down the page$")
    public void userScrollsDownThePage() throws InterruptedException {
        new AboutUsPage().slider();

    }

    @And("^User clicks on Learn more button$")
    public void userClicksOnLearnMoreButton() {
        new AboutUsPage().clickOnLearnMoreButton();
    }

    @Then("^User is taken to Five(\\d+) website successfully$")
    public void userIsTakenToFiveWebsiteSuccessfully(int arg0) {
    }

}
