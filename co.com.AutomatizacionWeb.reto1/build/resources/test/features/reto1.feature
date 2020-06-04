# Autor: velkysargel@hotmail.com
@stories
Feature: : Automation Demo Site
  I as a user want to access the Web Automation Demo Site
  @scenario1
  Scenario: Access Automation Demo Site
    Given Carlos wants to access the Web Automation Demo Site
    When  He performs the registration on the page
    |firstName |lastName |Address    |emailAddress           |phone     |languages|skills |country|selectCountry   |year|month|day|password|confirmPassword|
    |Velkys    | Oberto  |LA Chorrera|velkysargel@hotmail.com|1112334578|English  |Android|Panama |Australia       |1967|April|12 |Clave78 |Clave78        |
    Then He verifies that the screen loads with text - Double Click on Edit Icon to EDIT the Table Row.