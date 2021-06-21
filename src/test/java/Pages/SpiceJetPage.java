package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class SpiceJetPage {

    WebDriver driver;

    public SpiceJetPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class=\"button-align-center\"]/ul/li")
    public List<WebElement> navElements;

    @FindBy(xpath = "//a[@class=\"selected\"]")
    public WebElement defaultSelect;

    @FindBy(xpath = "//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td")
    public List<WebElement> radioElements;

    @FindBy(xpath = "//*[@id=\"divpaxinfo\"]")
    public WebElement adult;

    @FindBy(xpath = "//select[@id=\"ctl00_mainContent_ddl_Infant\"]/option[4]")
    public WebElement infantDropDown;

    @FindBy(xpath = "//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[1]")
    public WebElement oneWay;
    @FindBy(xpath = "//*[@value=\"Departure City\"]")
    public WebElement drDown;
    @FindBy(xpath = "//a[@value='KQH']")
    public WebElement fromC;

    @FindBy(xpath = "(//a[@value='JAI'])[2]")
    public WebElement toCity;

    @FindBy(xpath = "//*[@class=\"ui-datepicker-calendar\"]/tbody/tr[4]/td[5]")
    public WebElement depart;
    @FindBy(xpath = "//*[@id=\"divpaxinfo\"]")
    public WebElement adultDrD;

    @FindBy(xpath = "//*[@id=\"ctl00_mainContent_ddl_Adult\"]")
    public WebElement adultCount;

    @FindBy(xpath = "//*[@id='ctl00_mainContent_DropDownListCurrency']/option[6]")
    public WebElement currency;

    @FindBy(xpath = "//*[@id='ctl00_mainContent_btn_FindFlights']")
    public WebElement searchButton;
    @FindBy(xpath = "//*[@class='no_flights padding-left-15']")
    public WebElement noFares;
    @FindBy(xpath = "//*[@class='trip-modify-btn']")
    public WebElement modifyButton;
    @FindBy(xpath = "//*[@class='button-primary-reload']")
    public WebElement GoButton;





//    public void originCity() {
//        WebElement from_City = Driver.getDriver().findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']/option[3]"));
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].click()", from_City);
//
//    }



//    public void destnCity() {
//        WebElement to_City = Driver.getDriver().findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_destinationStation1']/option[24]"));
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].click()", to_City);
//
//    }




}
