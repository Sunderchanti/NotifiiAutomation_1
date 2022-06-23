package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^user is in notifii dasboard$")
    public void user_is_in_notifii_dasboard() throws Throwable {
        System.out.println("open browser");
    }

    @When("^user login into notifii property account with username and password$")
    public void user_login_into_notifii_property_account_with_username_and_password() throws Throwable {
    	System.out.println("login sucessfully");
    }

    @Then("^sucessfullay logged into notifii property account$")
    public void sucessfullay_logged_into_notifii_property_account() throws Throwable {
    	System.out.println("open browser");
    }

    @And("^dashboard should displayed$")
    public void dashboard_should_displayed() throws Throwable {
    	System.out.println("dashboard visible");
    }

}