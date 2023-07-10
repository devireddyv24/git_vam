@demoQA
Feature: Validate Progress functanility in widgets

Background:
Given Launch demoQA site and click on widgets
  @testcase1
  Scenario: Valiadte user clicks on Progress_bar

    When click on Progress bar
    Then user at progress bar page

     @testcase2
  Scenario: Validate the user click on start button 

    When click on Progress bar
    And user click on start button
    Then user view the progress of start
     @testcase3
  Scenario: Valiadate user clicks on stop button after starting it

    When click on Progress bar
    And user click on start button
    And user click on stop button
    Then user view the progree to stop
     @testcase4
  Scenario: Valiadate user progress can reach 100% after clicking start

    When click on Progress bar
     And user click on start button
    Then validate progress reached it fully

     @testcase5
  Scenario: Valiadte user clicks on Reset after complition of progress

    When click on Progress bar
     And user click on start button
    And user click on reset button
    Then validate the Reset is enabeld
     @testcase6
  Scenario: valiadte user clicks on start and stop button randomly

    When click on Progress bar
     And user click on start button
     And user click on stop button
    Then validate the start and stop fun works perfect