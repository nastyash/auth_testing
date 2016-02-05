package authc;

import org.apache.shiro.subject.Subject;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import spock.lang.Specification;


/**
 * Created by anastasiaknyazeva on 2/5/16.
 */
public class BaseStepdefs { //extends Specification {

    @Given("^the user is authorized as Admin$")
    public void theUserIsAuthorizedAsAdmin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // Subject user = (Subject) Mock(); //{
           // user.isAuthenticated() << true;
       // };

        throw new PendingException();
    }

    @Given("^user is authenticated$")
    public void userIsAuthenticated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^user is authorized with role X$")
    public void userIsAuthorizedWithRoleX() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^we get success and the STATUS is (\\d+)$")
    public void weGetSuccessAndTheSTATUSIs(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^we get a failure$")
    public void weGetAFailure() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
