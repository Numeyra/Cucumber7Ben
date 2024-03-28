# Nationality menusunun kayıt ve silme özelliğini
# (DataTable ile) 5 farklı değer seti ile çalıştırınız.

Feature: Nationality functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline:  Create Nationality and Delete
And Click on the  Element in Nationality
| setup         |
| parameters    |
| nationalities |

And Click on the Element in Dialog
| addButton |

And User sending the keys in Dialog
| nameInput |  <name> |

And Click on the Element in Dialog
| saveButton |

Then Success message should be displayed

And User delete the Element from Dialog
| <name> |

Then Success message should be displayed
    Examples:
      | name       |
      | nuNT1Ulk13 |
      | nuNT1Ulk14 |
      | nuNT1Ulk15 |
      | nuNT1Ulk17 |
      | nuNT1Ulk18 |



