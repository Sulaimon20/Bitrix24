
Feature: As a user, I should be able to assign tasks by clicking on Task tab under Active Stream
  Background: User log in and is on the <Active Stream> home page
    Given user login
  @test
  Scenario:  User should be able to click on "High Priority" checkbox to set the current task to a top priority task
    When User clicks on <Task> button
    * User clicks <High Priority> dropdown box
    * User see fire icon colored


  Scenario: User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box
    When User clicks on <Task> button
    * User clicks on the letter <A> in the bottom of the message box
    Then The editor text-bar on the top of the message box is displayed







