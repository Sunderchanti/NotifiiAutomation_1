Feature: Notifii website login

 Scenario: login into notiffi website
   
    Given user is in notifii dasboard
    When user login into notifii property account with username and password
    Then sucessfullay logged into notifii property account
    And dashboard should displayed
 
 