@boardGame
Feature: BoardGameGeek practice user stories
  @BG-1
  Scenario: User should be able to find given movie name


Given I navigate to boardgamegeek website as a guest
Then  I fill in the "Title" field with "Harry Potter and the Sorcerer's Stone Trivia Game"
Then  I fill in the Year Released Range field with 1999 and 2000
Then  I select 15 min from the Min Playing Time drop down
And   I select 1.5 hour from the Max Playing Time drop down
When  I click Submit it takes me to a new page
Then  I see Harry Potter and the Sorcerer Stone Trivia Game link on the page and Print on console

