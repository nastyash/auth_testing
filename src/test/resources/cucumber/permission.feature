Feature: check different aspects of permission

  Scenario: check if permission "action:area" exists when permission "action:area" in the list
    Given the user is authorized as Admin
    Given the following permissions exist
      | permission    |
      | "*"           |
      | "action:area" |
    When we check for permission "action:area"
    Then we get success and the STATUS is 200

  Scenario: check if permission "action:area" exists when no permission "action:area" in the list
    Given the user is authorized as Admin
    Given the following permissions exist
      | permission    |
      | "*"           |
    When we check for permission "action:area"
    Then we get a failure

  Scenario: check if admin can delete the permission "action:area" which exists
    Given the user is authorized as Admin
    Given the role X has permission "action:area"
    Given the following permissions exist
      | permission    |
      | "*"           |
      | "action:area" |
    When user delete permission "action:area"
    Then we get success and the STATUS is 200
  #(for delete operation)
    And  role X doesn't have permission "action:area" anymore
    And  permission "action:area" doesn't exist anymore

  Scenario: check if admin can delete the permission "action:area" which doesn't exist
    Given the user is authorized as Admin
    Given the following permissions exist
      | permission    |
      | "*"           |
    When user delete permission "action:area"
    Then we get a failure
    #or get success if delete operation implemented like "delete if exist"

  Scenario: check if admin can add the permission "action:area"
    #every permissions defined uniquely so we can just rewrite or do nothing if permission already exist
    Given the user is authorized as Admin
    When user add permission "action:area"
    Then we get success and the STATUS is 200
    #(for add operation)
    And  permission "action:area" exists from now

  Scenario: check if permission is set for role
    Given user is authenticated
    Given the following roles exist
    And   have following permissions
      | role           | allowedPermissions                 |
      | ADMIN          | ["*"]                              |
      | CREATE_PROJECT | ["*:project"]                      |
      | UPDATE_PROJECT | ["update:project", "read:project"] |
      | READ_PROJECT   | ["read:project"]                   |
    When  we grant to user a role from list
    And   user try to use allowed permission
    Then we get success and the STATUS is 200


  Scenario: check if permission isn't set for role
    Given user is authenticated
    Given the following roles exist
    But   don't have following permissions
      | role           | notAllowedPermissions                |
      | UPDATE_PROJECT | ["create:project"]                   |
      | READ_PROJECT   | ["create:project", "update:project"] |
    When  we grant to user a role from list
    And   user try to use not allowed permission
    Then  we get a failure

  Scenario: check if we can add permission to the role
    Given user is authorized with role X
    Given the following roles exists
    And have following permissions
      | role           | allowedPermissions                 |
      | ADMIN          | ["*"]                              |
      | X              | ["read:project"]                   |
    When we add permission "update:project" to the role X
    Then we get success and the STATUS is 200
    And  user can use "update:project" permission

  Scenario: check if we can delete permission from the role
    Given user is authorized with role X
    Given the following roles exists
    And have following permissions
      | role           | allowedPermissions                 |
      | ADMIN          | ["*"]                              |
      | X              | ["read:project", "update:project"] |
    When we delete permission "update:project" from the role X
    Then we get success and the STATUS is 200
    And user can't use "update:project" anymore


