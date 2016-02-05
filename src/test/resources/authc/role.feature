Feature: check different aspects of role

  Scenario: check if role X exists
    Given the user is authorized as Admin
    Given the following roles exist
      | role           |
      | ADMIN          |
      | X              |
    When we check for role X
    Then we get success and the STATUS is 200

  Scenario: check if role X exists when no role X in the list
    Given the user is authorized as Admin
    Given the following roles exist
      | role           |
      | ADMIN          |
    When we check for role X
    Then we get a failure


  Scenario: check if admin can delete the role X which exists
    Given the user is authorized as Admin
    Given the userX is authorized with role X
    Given the following roles exist:
      | role           |
      | ADMIN          |
      | X              |
    When user delete role X
    Then we get success and the STATUS is 200
  #(for delete operation)
    And  userX doesn't have role X anymore
    And  the role X doesn't exist anymore

  Scenario: check if admin can delete the role X which doesn't exist
    Given the user is authorized as Admin
    Given the following roles exist:
      | role           |
      | ADMIN          |
    When user delete role X
    Then we get failure  #or get success if delete operation implemented like "delete if exist"

  Scenario: check if admin can add the role X which doesn't exist
    Given the user is authorized as admin
    Given the following roles exist:
      | role           |
      | ADMIN          |
    When user add role X
    Then we get success and the STATUS is 200
  #(for add operation)
    And  role X exists from now

  Scenario: check if admin can add the role X which exists
    Given the user is authorized as admin
    Given the following roles exist:
      | role           |
      | ADMIN          |
      | X              |
    When user add role X
    Then we get a failure
    #And message that the role X already exists
    #or get success if add operation implemented like "merge"
