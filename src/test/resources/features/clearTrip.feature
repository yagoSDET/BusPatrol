@clearTrip
//Please run test one by one using tags @CT-1, @CT-2,@CT-3
  in this Website,since it doesnt allow to run all tests together
Feature: ClearTrip practice user stories
  @CT-1
Scenario: Negative scenario when searching flights

Given I navigate to clearTrip homepage
When I select Round trip radio button
Then I select June24, 2021 as Depart on Date
And I select June30, 2021 as Return on Date
And I select 3 from Adults dropdown
And I select 2 from Children dropdown
And I select 1 from Infants dropdown
When I click on [Search Flights] button
Then I see an error message "Sorry, but we can't continue until you fix everything that's marked in RED"
And Print the above error message on Console

  @CT-2
Scenario: Navigate to Hotels page
Given I navigate to clearTrip homepage
When I click on Hotels Button displayed on Left hand Side
Then I verify I am on hotels page
Then I Print the title Search for Hotels on Console

  @CT-3
Scenario:User should be able to search for hotel with details
 Given I navigate to clearTrip homepage
 When I click on Hotels Button displayed on Left hand Side
 Then I enter Canada under Where
 And I select Trois Rives from Auto suggestive dropdown
 Then I click on Travellers dropdown and select More Travellers
 Then Select 2 from Rooms dropdown
 And Select Number of Adults as 1 , Children as 1 and Age of Child 1 as 3 for Room 1
 And Select Number of Adults as 3 , Children as 2 and Age of Child 1 as 1 child 2 as 4 for Room 2
 When click button Search Hotels
 Then Print the search result displayed if any
