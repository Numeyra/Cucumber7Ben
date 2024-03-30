#Senaryo
  #Inventory bölümündeki
  #item Categories calismasini test ediniz
  #girisi yapip ,sonrasinda silmesini yapiniz

Feature: Inventory functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create Inventory and Delete
    And Click on the Element in LeftNav
      | inventory      |
      | setupInventory |
      | inventoryCat   |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name> |

    And Click on the Element in Dialog
      | userTyp |
      | <type>  |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the Element from Dialog
      | <name> |

    Then Success message should be displayed
    Examples:
      | name   | type          |
      | nuIn12 | student       |
      | nuIn22 | administrator |
      | nuIn32 | student       |
      | nuIn42 | administrator |
      | nuIn52 | student       |