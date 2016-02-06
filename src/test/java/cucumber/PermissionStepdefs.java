package cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PermissionStepdefs {

  /*  @When("^I run a failing step")
    public void I_run_a_failing_step() throws Throwable {
        new Production().doWork();
    }*/

    @Given("^the following permissions exist$")
    public void theFollowingPermissionsExist() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^we check for permission \"([^\"]*)\"$")
    public void weCheckForPermission(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^the role X has permission \"([^\"]*)\"$")
    public void theRoleXHasPermission(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user delete permission \"([^\"]*)\"$")
    public void userDeletePermission(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^role X doesn't have permission \"([^\"]*)\" anymore$")
    public void roleXDoesnTHavePermissionAnymore(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^permission \"([^\"]*)\" doesn't exist anymore$")
    public void permissionDoesnTExistAnymore(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user add permission \"([^\"]*)\"$")
    public void userAddPermission(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^permission \"([^\"]*)\" exists from now$")
    public void permissionExistsFromNow(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^the following roles exist$")
    public void theFollowingRolesExist() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^have following permissions$")
    public void haveFollowingPermissions() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^we grant to user a role from list$")
    public void weGrantToUserARoleFromList() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user try to use allowed permission$")
    public void userTryToUseAllowedPermission() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @But("^don't have following permissions$")
    public void donTHaveFollowingPermissions() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user try to use not allowed permission$")
    public void userTryToUseNotAllowedPermission() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^the following roles exists$")
    public void theFollowingRolesExists() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^we add permission \"([^\"]*)\" to the role X$")
    public void weAddPermissionToTheRoleX(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user can use \"([^\"]*)\" permission$")
    public void userCanUsePermission(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^we delete permission \"([^\"]*)\" from the role X$")
    public void weDeletePermissionFromTheRoleX(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user can't use \"([^\"]*)\" anymore$")
    public void userCanTUseAnymore(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

