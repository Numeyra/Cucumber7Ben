#CitizenShip menusunun kayit ve silme özelligini

Feature: CitizenShip functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline:  Create  CitizenShip and Delete
    And Click on the  Element in Nationality
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | <name> |
      | shortName | <short> |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the Element from Dialog
      | <name> |

    Then Success message should be displayed
    Examples:
      | name       |  | short      |
      | nuCS1Ulk13 |  | nCS1Ulk13 |
      | nuCS1Ulk14 |  | nuCS1Ulk14 |
      | nuCS1Ulk15 |  | nuCS1Ulk15 |
      | nuCS1Ulk18 |  | nuCS1Ulk18 |
      | nuCS1Ulk17 |  | nuCS1Ulk17 |



