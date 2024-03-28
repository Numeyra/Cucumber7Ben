Feature: Fees multiple values functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Fee Functionality and Delete
  And Click on the Element in LeftNav
        | setup      |
        | parameters |
        | fees       |

       And Click on the Element in Dialog
         | addButton |

      And User sending the keys in Dialog
         | nameInput       | <name>   |
         | codeInput       | <code>   |
         | integrationCode | <intCode>|
         | priorityCode    | <priority>|

          And Click on the Element in Dialog
            | toggleBar  |
            | saveButton |

           Then Success message should be displayed

          And User delete the Element from Dialog
           | <name>|

         Then Success message should be displayed
    Examples:
      | name| code| intCode| priority  |
      |num2Fee1134|212325|Paypal|212152  |
      |num2Fee2144|222436|Paypal|212253  |
      |num2Fee3154|232347|Paypal|212354|
      |num2Fee4166|2422558|Paypal|212464  |
      |num2Fee5178|2521349|Paypal|212538  |