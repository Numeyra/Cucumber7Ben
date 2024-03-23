#Senaryo
#CitizenShip sayfasina gidiniz.
#Create islemini parameter yöntemi ile dogrulayiniz.
#Daha sonra ayni bilgilerle tekrar Create  yapilmadigini dogrulayiniz.(negativ test)
#Ayri bir senaryoda girilen bigliyi silme islemini dogrulayiniz.



Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

  Scenario: Create a Citizenship with parameter
    When Create a CitizenShip name as "ulkercs1212" shortkod as "ukrkod1212"
    Then Success message should be displayed

  Scenario: Create a Citizenship with parameter
    When Create a CitizenShip name as "ulkercs1212" shortkod as "ukrkod1212"
    Then Already exist message should be displayed

  Scenario: Delete Citizenship
    When user delete name as "ulkercs1212"
    Then Success message should be displayed
