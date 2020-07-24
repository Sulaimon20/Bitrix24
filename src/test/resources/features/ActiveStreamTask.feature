Feature: As a user, I should be able to assign tasks by clicking on Task tab under Active Stream

  Background: User log in and is on the <Active Stream> home page
    Given user login


  Scenario:  User should be able to click on "High Priority" checkbox to set the current task to a top priority task
    When User clicks on <Task> button
    * User clicks <High Priority> dropdown box
    * User see fire icon colored


  Scenario: User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box
    When User clicks on <Task> button
    * User clicks on the letter <A> in the bottom of the message box
    Then The editor text-bar on the top of the message box is displayed

  @test3
  Scenario: User should be able to click on <upload files> icon to upload <files> and <pictures>
  from local disks, download from external drive, select documents from bixtrix24,
  and create files to upload.
    When User clicks on <Task> button
    Then User writes in <Thing to do> box text <Upload file> and text <The file  was uploaded> in <Message body> box
    * User clicks on <Upload files> icon and upload <TeamTestCases> file  and <LoginVyTrack> picture from local disks
    * User clicks <Send> button
    * User clicks on <Task> button om menu bar
    * User see the the uploaded files












