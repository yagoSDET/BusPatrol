package StepDefinitions;

import Pages.ClearTripPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

public class ClearTripSteps {

ClearTripPage clearTrip = new ClearTripPage();

    @Given("I navigate to clearTrip homepage")
    public void navigateToClearTrip()
    {
        Driver.getDriver().get("https://www.cleartrip.com/");
    }

    @When("I select Round trip radio button")
    public void selectRoundTrip()
    {
clearTrip.roundTrip.click();
    }

    @Then("I select June24, 2021 as Depart on Date")
    public void departDate() throws InterruptedException {
        clearTrip.pickDate.click();
Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].click();", clearTrip.departDate);

    }

    @Then("I select June30, 2021 as Return on Date")
    public void returnDate() {
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].click();", clearTrip.returnDate);
    }

    @Then("I select 3 from Adults dropdown")
    public void adults() {
        Select adltFly = new Select(clearTrip.adultFly);
        adltFly.selectByIndex(2);
//        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
//        js.executeScript("arguments[0].click();", clearTrip.adultFly);
    }

    @Then("I select 2 from Children dropdown")
    public void children() {
        Select childFly = new Select(clearTrip.childFly);
        childFly.selectByIndex(2);
    }

    @Then("I select 1 from Infants dropdown")
    public void infant() {
        Select infFly = new Select(clearTrip.infFly);
        infFly.selectByIndex(1);
    }

    @When("I click on [Search Flights] button")
    public void searchFlights() {
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].click();", clearTrip.buttonSearch);
    }

    @Then("I see an error message \"Sorry, but we can't continue until you fix everything that's marked in RED\"")
    public void errorMessage() {
        for(String windowChild: Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(windowChild);
        }
        String expectedText = "Sorry, but we can't continue until you fix everything that's marked in RED";
        String actualText = clearTrip.errorMsg.getText();
        Assert.assertNotEquals( expectedText, actualText);

    }

    @Then("Print the above error message on Console")
    public void printError() throws InterruptedException {
String actualError = clearTrip.errorMsg.getText();
        System.out.println("Actual error message is: " + actualError);
        Thread.sleep(5000);
    }
// CT-2 Scenario: Navigate to Hotels page
    @When("I click on Hotels Button displayed on Left hand Side")
    public void clickHotels() {
clearTrip.hotel.click();
    }

   @Then("I verify I am on hotels page")
   public void verifyHotels() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
       System.out.println("---------!!!!!--------!!!!!!!!-------");
       System.out.println(actualUrl);
       System.out.println("---------!!!!!---------!!!!!!!!------");
       String expectUrl = "https://www.cleartrip.com/hotels";
     Assert.assertEquals(expectUrl,actualUrl);

   }

    @Then("I Print the title Search for Hotels on Console")
    public void printTitle() throws InterruptedException {
String printH = clearTrip.printHotel.getText();
        System.out.println("---------!!!!!---------------");
        System.out.println(printH);
        System.out.println("---------!!!!!---------------");
        Thread.sleep(3000);
    }
//CT-3 Scenario:User should be able to search for hotel with details
    @Then("I enter Canada under Where")
    public void selectWhere() throws InterruptedException {
clearTrip.toWhere.sendKeys("Canada");
Thread.sleep(3000);
    }

    @Then("I select Trois Rives from Auto suggestive dropdown")
    public void selectDropdown() throws InterruptedException {

        for(WebElement city: clearTrip.allCities){
            String eachCity = city.getText();
            System.out.println(eachCity);
            if(eachCity.equals("Trois-Rives, Quebec,Canada")) {
                city.click();
            }
        }
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.ESCAPE).build().perform();

        Thread.sleep(2000);

    }

    @Then("I click on Travellers dropdown and select More Travellers")
    public void travDropdown() throws InterruptedException {
        clearTrip.moreTravel.click();
    }

    @Then("Select 2 from Rooms dropdown")
    public void selectRoom() {
clearTrip.roomNumb.click();
    }

    @Then("Select Number of Adults as 1 , Children as 1 and Age of Child 1 as 3 for Room 1")
    public void firstRoomDetails() {
        clearTrip.adult1Numb.click();
        clearTrip.child1Numb.click();
        clearTrip.childAge.click();


    }

    @Then("Select Number of Adults as 3 , Children as 2 and Age of Child 1 as 1 child 2 as 4 for Room 2")
    public void secondRoomDetails() throws InterruptedException {
        clearTrip.adult2Numb.click();
        clearTrip.child2Numb.click();
        Thread.sleep(2000);
        clearTrip.child1dAge.click();
        clearTrip.child2dAge.click();

    }

    @When("click button Search Hotels")
    public void button_Search_Hotels() {
clearTrip.searchHotel.submit();
    }

    @Then("Print the search result displayed if any")
    public void searchResult() {
    String result = clearTrip.searchResult.getText();
        System.out.println("--------!!!!!!!!----------!!!!!!!!!-----");
        System.out.println("Your search result is: " + result);
        System.out.println("--------!!!!!!!!----------!!!!!!!!!-----");

    }


}


