package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class BoardGamePage {


    WebDriver driver;

    public BoardGamePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='advsearch-title']")
    public WebElement fillTitle;

    @FindBy(xpath = "//*[@id='advsearch-yearpublished-min']")
    public WebElement minYear;

    @FindBy(xpath = "//*[@id='advsearch-yearpublished-max']")
    public WebElement maxYear;


    @FindBy(xpath = "//*[@id='advsearch-min-playing-time']/option[3]")
    public WebElement minPlay;

    @FindBy(xpath = "//*[@id='advsearch-max-playing-time']/option[7]")
    public WebElement maxPlay;


    @FindBy(xpath ="//input[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath ="//*[@id='results_objectname1']/a")
    public WebElement result;




}
