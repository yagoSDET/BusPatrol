package StepDefinitions;

import Pages.SpiceJetPage;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class SpiceJetSteps {
    SpiceJetPage spiceJet = new SpiceJetPage();


    @Given("^I navigate to \"https://www.spicejet.com/\" as a guest")
    public void getWebsite() {
        Driver.getDriver().get("https://www.spicejet.com");
    }

    @Then("I see Navbar that includes the following: \"Flights\", \"Hotels\", \"Covide-19 Information\", \"Flight Status\", \"Check-In\", \"Manage Booking\"")
    public void seeNavbar() {
        System.out.println("Navbar elements are: ");
for (WebElement elem: spiceJet.navElements){
    System.out.println(elem.getText());
}
        System.out.println("--------!!!!!--------!!!!!!");

    }

    @Then("I see \"Flights\" is selected by default")
    public void defaultSelected() {
String defaultSel = spiceJet.defaultSelect.getText();
        System.out.println("Selected by default Navbar element is: " + defaultSel);
    }

    @Then("I see clickable radio buttons: \"One Way\", \"Round Trip\", \"Multicity\" under \"Flights\" options")
    public void radioClickables() {
        System.out.println("Radio elements are: ");
        for (WebElement elem: spiceJet.radioElements){
            System.out.println(elem.getText());
        }
        System.out.println("--------!!!!!--------!!!!!!");

    }

    //SJ-2 Scenarios
    @When("I select \"1 Adult\" and \"4 Infants\"")
    public void selectPeople() throws InterruptedException {
        spiceJet.adult.click();
        Thread.sleep(2000);
spiceJet.infantDropDown.click();

}


    @Then("I see a pop-up, record the message and print it to the Console")
    public void recordPrintMessage() throws IOException, InterruptedException {
        Alert  getAlert = Driver.getDriver().switchTo().alert();
        String alertText = getAlert.getText();
        Thread.sleep(1000);
        System.out.println("PopUP message is: "+ alertText);
        getAlert.accept();
        File ss = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss, new File("C:\\Users\\Yago\\Desktop\\homePageScreenshot.png"));

    }
    //SJ-3
    //Scenario: User should be able to search flight


    @Then("I select \"One Way\" radio button")
    public void oneWAY() throws InterruptedException {
        spiceJet.oneWay.click();
Thread.sleep(2000);
    }

    @Then("I select Ajmer\\(KQH) departure city in the From field")
    public void fromCity() throws InterruptedException {
        new WebDriverWait(Driver.getDriver(), 5).until(
                ExpectedConditions.elementToBeClickable(spiceJet.drDown));
        spiceJet.drDown.click();

spiceJet.fromC.click();

Thread.sleep(2000);
    }

    @Then("I select Jaipur\\(JAI) arrival city in the To field")
    public void toCity() {
spiceJet.toCity.click();
    }

    @Then("I select \"June 24, 2021\" date in the \"Depart Date\" field")
    public void departDate() throws InterruptedException {
spiceJet.depart.click();
Thread.sleep(2000);
    }

    @Then("I select \"2\" from Adults dropdown")
    public void adults() {
        spiceJet.adultDrD.click();
        Select adlt = new Select(spiceJet.adultCount);
        adlt.selectByIndex(1);


    }

    @Then("I select \"USD\" from the Currency dropdown")
    public void currency() {
spiceJet.currency.click();
    }

    @When("I click on \"Search\" CTA button")
    public void searchButton() {
spiceJet.searchButton.click();
    }

    @Then("^Clicking on \"Search\" CTA button will redirect me to \"https://book.spicejet.com/Select.aspx\"")
    public void redirectUrl() {
String urlSelect = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://book.spicejet.com/Select.aspx", urlSelect);
    }

    @Then("Verify the user has advanced to the next page by printing to Console-Output the URL")
    public void printURL() {
String printURL= Driver.getDriver().getCurrentUrl();
        System.out.println("-----------------!!!!!--------------");
        System.out.println("Current URL is: " +printURL);
        System.out.println("-----------------!!!!!--------------");
    }

    //SJ-4 Scenario: Negative scenario in case fares are not available
    @Given("Verify the redirect page and print to Console")
    public void verifyPrintConsole() {
        String urlSelect = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://book.spicejet.com/Select.aspx", urlSelect);
        System.out.println("Current URL is: " +urlSelect);
    }

    @When("If no fares are available, record the message and print to the Console")
    public void noFares() {
        String noFaresText= spiceJet.noFares.getText();
        System.out.println("-------------@@@@@@@---------------@@@@@@");
        System.out.println(noFaresText);
        System.out.println("-------------@@@@@@@---------------@@@@@@");
    }

    @Then("I click on Modify Search button")
    public void clickModify() {
spiceJet.modifyButton.click();
    }


    @Then("I see and click the Go CTA button")
    public void clickGoButton() {
spiceJet.GoButton.click();
    }

    @Then("I see the page interstitial")
    public void seeInterstitial() {
        for (String windowChild : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(windowChild);

        }
        String inters = Driver.getDriver().getTitle();
        System.out.println(inters);
    }
}
