@fourModules
Feature: FourModules practice user stories
  @FM-1
  Scenario: Get the dropdown options
 Given I navigate to fourmodules website
 Then I click on CD-IELTS dropdown and Print the dropdown options
 Then I click on PTE dropdown and Print the dropdown options
 Then I click on CELPIP dropdown and Print the dropdown options
 And I click on CAEL dropdown and Print the dropdown options


   @FM-2
   Scenario: Surfing in the site
   Given I navigate to fourmodules website
   Then I click on CD-IELTS dropdown and Print the dropdown options
   Then I see two dropdown options About and Pricing & Packages
   And  I select option About
   Then I see current url as "https://www.fourmodules.com/ielts"
   When I see a button [Any Questions] on this page
   Then I click this [Any Questions] button
   And  I see a pop window with Title "How can we help"
   Then I press close x on this pop window
   When I press [Take Demo] button
   Then I see current url as "https://www.fourmodules.com/signup"