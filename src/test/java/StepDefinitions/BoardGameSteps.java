package StepDefinitions;

import Pages.BoardGamePage;
import io.cucumber.java.en.*;
import utils.Driver;

public class BoardGameSteps {
    BoardGamePage boardPage = new BoardGamePage();
    Driver driver;
    @Given("I navigate to boardgamegeek website as a guest")
    public void navigateToSite() {

        Driver.getDriver().get("https://boardgamegeek.com/advsearch/boardgame");
    }

    @Then("I fill in the \"Title\" field with \"Harry Potter and the Sorcerer's Stone Trivia Game\"")
    public void fillTitle() {
        boardPage.fillTitle.sendKeys("Harry Potter and the Sorcerer's Stone Trivia Game");

    }

    @Then("I fill in the Year Released Range field with 1999 and 2000")
    public void fillYearRange() {
boardPage.minYear.sendKeys("1999");
boardPage.maxYear.sendKeys("2000");
    }

    @Then("I select 15 min from the Min Playing Time drop down")
    public void minPlayTime() {
        boardPage.minPlay.click();

    }
    @Then("I select 1.5 hour from the Max Playing Time drop down")
    public void maxPlayTime() {
        boardPage.maxPlay.click();

    }

    @When("I click Submit it takes me to a new page")
    public void clickSubmit() {
        boardPage.submitButton.submit();

    }

    @Then("I see Harry Potter and the Sorcerer Stone Trivia Game link on the page and Print on console")
    public void seeLinkPrintName() {
String res =boardPage.result.getText();

        System.out.println("!!!-------!!!-------------!!!");
        System.out.println(res);
        System.out.println("!----------!-----------!");
    }





}
