Feature: check all the stuff with user and roles/permissions

  Scenario: check if user is authorized
    Given user is authenticated
    When we check for user authorization
    Then we get success and the STATUS is 200

  Scenario: check if user isn't authorized
    Given unauthorized user
    When we try to do something which needs authorization
    Then we get a failure



  Scenario: check if we can grant role X to user when role X is exist
    Given user is authenticated
    Given the following roles exist
      | role           |
      | ADMIN          |
      | X              |
    When  we grant user a role X
    Then  we get success and the STATUS is 200
    And user has the role X

"""
  Scenario: check if we can grant role X to user when role X isn't exist
    Given user is authenticated
    Given the following roles exist
      | role           |
      | ADMIN          |
      | CREATE_PROJECT |
      | UPDATE_PROJECT |
      | READ_PROJECT   |
    When  we grant user a role X
    Then  we get a failure
"""

  Scenario: check if we can successfully delete role from user
    Given user is authorized with role X
    When  we delete X role from user
    Then  we get success and the STATUS is 200
  #(for delete operation)
    And   user don't have X role anymore