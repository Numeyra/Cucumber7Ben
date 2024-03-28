Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Country
    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | nuUlk19 |
      | codeInput | nuKod11    |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

#    And User delete the Element from Dialog
#      | ismetUlk19 |

#    Then Success message should be displayed

  Scenario: CitizenShip Create and Delete
    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | nuSCUlk19 |
      | shortName | nuSC1     |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the Element from Dialog
      | nuSCUlk19 |

    Then Success message should be displayed


  Scenario: Create Nationality and Delete
    And Click on the  Element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | nuNTUlk198 |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the Element from Dialog
      | nuNTUlk198 |

    Then Success message should be displayed

  Scenario: Fee Functionality and Delete
    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput       | nuFee123|
      | codeInput       | 1223121 |
      | integrationCode | 1212    |
      | priorityCode    | 234563   |

    And Click on the Element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete the Element from Dialog
      | nuFee123 |

    Then Success message should be displayed