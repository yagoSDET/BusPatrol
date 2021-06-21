package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class FourModulesPage {
    WebDriver driver;

    public FourModulesPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/ielts'][@class='main-menu fullShow']")
    public WebElement CdIeltsDropDown;

    @FindBy(xpath = "//a[@class='link-page'][@href='/ielts']")
    public WebElement textAbout;


    @FindBy(xpath = "//a[@class='link-page'][@href='/ielts-packages-pricing']")
    public WebElement textPricing;

    @FindBy(xpath = "//a[@href='/pte'][@class='main-menu fullShow']")
    public WebElement PTEDropDown;
    @FindBy(xpath = "//a[@href='/celpip'][@class='main-menu fullShow']")
    public WebElement CELPIPDropDown;

    @FindBy(xpath = "//a[@href='/cael'][@class='main-menu fullShow']")
    public WebElement CAELDropDown;

    @FindBy(xpath = "(//div[@class='course-des-title underline'])[1]")
    public WebElement seeAbout;

    @FindBy(xpath = "//a[@class=\"btn btn-green\"]")
    public WebElement anyQuesButton;
    @FindBy(xpath = "//a[@class='btn btn-green']/span")
    public WebElement verifyAnyQuest;

    @FindBy(xpath = "//h5[@id='exampleModalLabel']")
    public WebElement titlePOPUP;
    //h5[@id='exampleModalLabel']

    @FindBy(xpath = "//button[@class=\"close\"]")
    public WebElement closePOPUP;
    @FindBy(xpath = "(//button[@class=\"btn btn-green\"])[1]")
    public WebElement takeDemoButton;















}
