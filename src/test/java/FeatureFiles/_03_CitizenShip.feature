#Senaryo
  #Citizenships sayfasina
  #1 adet CitizenShips kaydi yapilabildigini dogrulayiniz.


  Feature: CitizenShip Functionality

    @SmokeTest
    Scenario: Create a CitizenShip
      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login successfully
      And Navigate to CitizenShip
      When Create a CitizenShip
      Then Success message should be displayed