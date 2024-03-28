Feature: Datatable Functionality


  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: Create Country
      And Click on the Element in LeftNav
      |setup|
      |parameters|
      |countries|

      And Click on the Element in Dialog
      |addButton|

      And User sending the keys in Dialog
      |nameInput|numülk236|
      |codeInput|nuKOd23|

      And Click on the Element in Dialog
      |saveButton|
      Then Success message should be displayed

     #    And User delete the Element from Dialog
     #    |numülk2367|

     # Then Success message should be displayed

  Scenario: CitizeShip Create
    And Click on the Element in LeftNav

      |setup|
      |parameters|
      |citizenship|
And Click on the Element in Dialog
  |addButton|

    And User sending the keys in Dialog
      |nameInput|numSc12|
      |shortName|nuSc1|

    And Click on the Element in Dialog
      |saveButton|
    Then Success message should be displayed

        And User delete the Element from Dialog
          |numSc12|

      Then Success message should be displayed

Scenario: Create Nationality and Delete
  And Click on the Element in LeftNav

    |setup|
    |parameters|
    | nationalities|
  And Click on the Element in Dialog
    |addButton|

  And User sending the keys in Dialog
    |nameInput|numNTulk12|


  And Click on the Element in Dialog
    |saveButton|
  Then Success message should be displayed

  And User delete the Element from Dialog
    |numNTulk12|

  Then Success message should be displayed

