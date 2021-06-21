@spiceJet
Feature: SpiceJet practice user stories
  @SJ-1
  Scenario: Main page components
Given I navigate to "https://www.spicejet.com/" as a guest
Then I see Navbar that includes the following: "Flights", "Hotels", "Covide-19 Information", "Flight Status", "Check-In", "Manage Booking"
Then I see "Flights" is selected by default
And I see clickable radio buttons: "One Way", "Round Trip", "Multicity" under "Flights" options

    @SJ-2
    Scenario: Get the snapshot of the pop-up window
Given I navigate to "https://www.spicejet.com/" as a guest
When  I select "1 Adult" and "4 Infants"
Then  I see a pop-up, record the message and print it to the Console

  @SJ-3_4  @SJ-3
    Scenario: User should be able to search flight

Given I navigate to "https://www.spicejet.com/" as a guest
Then I select "One Way" radio button
Then I select Ajmer(KQH) departure city in the From field
Then I select Jaipur(JAI) arrival city in the To field
Then I select "June 24, 2021" date in the "Depart Date" field
Then I select "2" from Adults dropdown
And  I select "USD" from the Currency dropdown
When I click on "Search" CTA button
Then Clicking on "Search" CTA button will redirect me to "https://book.spicejet.com/Select.aspx"
And  Verify the user has advanced to the next page by printing to Console-Output the URL

  @SJ-3_4  @SJ-4
      Scenario: Negative scenario in case fares are not available

Given Verify the redirect page and print to Console
When  If no fares are available, record the message and print to the Console
Then  I click on Modify Search button
Then  I see and click the Go CTA button
Then  I see the page interstitial
