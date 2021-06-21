package StepDefinitions;

import Pages.FourModulesPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import utils.Driver;

public class FourModulesSteps {
    FourModulesPage fourModules = new FourModulesPage();

    @Given("I navigate to fourmodules website")
    public void navigateToFourModules() {
        Driver.getDriver().get("https://www.fourmodules.com/");
    }

    @When("I click on CD-IELTS dropdown and Print the dropdown options")
    public void CDIELTS_dropdown() {
fourModules.CdIeltsDropDown.click();
        String about= fourModules.textAbout.getAttribute("innerHTML");
        String pricing = fourModules.textPricing.getAttribute("textContent");
        System.out.println("!!!!-------------!!!!!!!!!------!!!!!!!!!!!");
        System.out.println(about);
        System.out.println(pricing);
        System.out.println("!!!!-------------!!!!!!!!!------!!!!!!!!!!!");
    }

    @When("I click on PTE dropdown and Print the dropdown options")
    public void PTE_dropdown() {
        fourModules.PTEDropDown.click();
        String about= fourModules.textAbout.getAttribute("innerHTML");
        String pricing = fourModules.textPricing.getAttribute("textContent");
        System.out.println("!!!!-------------!!!!!!!!!------!!!!!!!!!!!");
        System.out.println(about);
        System.out.println(pricing);
        System.out.println("!!!!-------------!!!!!!!!!------!!!!!!!!!!!");


    }
    @When("I click on CELPIP dropdown and Print the dropdown options")
    public void CELPIP_dropdown() {
fourModules.CELPIPDropDown.click();
        String about= fourModules.textAbout.getAttribute("innerHTML");
        String pricing = fourModules.textPricing.getAttribute("textContent");
        System.out.println("!!!!-------------!!!!!!!!!------!!!!!!!!!!!");
        System.out.println(about);
        System.out.println(pricing);
        System.out.println("!!!!-------------!!!!!!!!!------!!!!!!!!!!!");
    }
    @When("I click on CAEL dropdown and Print the dropdown options")
    public void CAEL_dropdown() {
fourModules.CAELDropDown.click();
        String about= fourModules.textAbout.getAttribute("innerHTML");
        String pricing = fourModules.textPricing.getAttribute("textContent");
        System.out.println("!!!!-------------!!!!!!!!!------!!!!!!!!!!!");
        System.out.println(about);
        System.out.println(pricing);
        System.out.println("!!!!-------------!!!!!!!!!------!!!!!!!!!!!");
    }
    @Then("I see two dropdown options About and Pricing & Packages")
    public void verifyDropDownOptions() {
        Boolean about= fourModules.textAbout.getAttribute("innerHTML").equalsIgnoreCase("About");
        Boolean pricing = fourModules.textPricing.getAttribute("textContent").equalsIgnoreCase("Pricing & Package");
        Assert.assertTrue(about);
        Assert.assertTrue(pricing);
    }
    @Then("I select option About")
    public void aboutOption() throws InterruptedException {


    }
    @Then("^I see current url as \"https://www.fourmodules.com/ielts\"$")
    public static void currentURL() {
        String ieltsUrl= Driver.getDriver().getCurrentUrl();
        System.out.println(ieltsUrl);
    }
    @When("I see a button [Any Questions] on this page")
    public void verifyAnyQuestions() {
       String verifyAnyQ= fourModules.verifyAnyQuest.getText();
        System.out.println(verifyAnyQ);
        Assert.assertEquals("ANY QUESTIONS?", verifyAnyQ);
    }
    @Then("I click this [Any Questions] button")
    public void clickAnyQues() {
       fourModules.verifyAnyQuest.click();
    }

    @Then("I see a pop window with Title \"How can we help\"")
    public void popUp() {
        for(String windowChild: Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(windowChild);
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Title of this page is: " + fourModules.titlePOPUP.getAttribute("innerHTML"));

        System.out.println("-------------------------------------------------------");
    }
    @Then("I press close x on this pop window")
    public void closePopUp() throws InterruptedException {

fourModules.closePOPUP.click();
        Thread.sleep(2000);
        Driver.getDriver().switchTo().defaultContent();

    }
    @When("I press [Take Demo] button")
    public void buttonTakeDemo() throws InterruptedException {
fourModules.takeDemoButton.click();
Thread.sleep(2000);
    }
    @Then("^I see current url as \"https://www.fourmodules.com/signup\"$")
    public void currentURL2() {
String urlSignup = Driver.getDriver().getCurrentUrl();
        System.out.println("Current URL is: " + urlSignup);
Assert.assertEquals("https://www.fourmodules.com/signup", urlSignup);
    }



}
