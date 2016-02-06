package cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * Created by anastasiaknyazeva on 2/5/16.
 */
public class UserStepdefs {

    @When("^we check for user authorization$")
    public void weCheckForUserAuthorization() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^unauthorized user$")
    public void unauthorizedUser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^we try to do something which needs authorization$")
    public void weTryToDoSomethingWhichNeedsAuthorization() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^we grant user a role X$")
    public void weGrantUserARoleX() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user has the role X$")
    public void userHasTheRoleX() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^we delete X role from user$")
    public void weDeleteXRoleFromUser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user don't have X role anymore$")
    public void userDonTHaveXRoleAnymore() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
