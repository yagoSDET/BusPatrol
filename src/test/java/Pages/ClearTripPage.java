package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class ClearTripPage {
    WebDriver driver;



    public ClearTripPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//p[@class='fs-3 fw-600 c-neutral-900'])[2]")
    public WebElement roundTrip;


    @FindBy(xpath = "//button[contains(@class, 'c-neutral-900')]")
    public  WebElement pickDate;

    @FindBy(xpath = "(//div[contains(@class, 'p-1 day-gridContent')])[24]")
    public WebElement departDate;


    @FindBy(xpath = "(//div[contains(@class, 'p-1 day-gridContent')])[30]")
    public  WebElement returnDate;
    @FindBy(xpath = "(//select[@class='bc-neutral-100 bg-transparent'])[1]")
    public  WebElement adultFly;
    @FindBy(xpath = "(//select[@class='bc-neutral-100 bg-transparent'])[2]")
    public  WebElement childFly;
    @FindBy(xpath = "(//select[@class='bc-neutral-100 bg-transparent'])[3]")
    public  WebElement infFly;
    @FindBy(xpath = "//button[contains(@class, 'bg-primary-600')]")
    public  WebElement buttonSearch;

    @FindBy(xpath = "//div[contains(@class, 'bg-error-600 row')]/span")
    public  WebElement errorMsg;



    @FindBy(xpath = "//a[@href='/hotel']")
    public WebElement hotel;



    @FindBy(xpath = "//div[contains(@class,'searchForm')]/h1")
    public WebElement printHotel;

    @FindBy(xpath = "//*[@id='Tags']")
    public WebElement toWhere;

    @FindBy(xpath = "//*[@id='ui-id-39']")
    public WebElement selectCity;


    @FindBy(xpath = "//a[starts-with(@id,'ui-id-')]")
    public List <WebElement> allCities;

    @FindBy(xpath = "//*[@id=\"travellersOnhome\"]")

    public WebElement travDropdown;
    @FindBy(xpath = "//*[@id='travellersOnhome']/option[4]")
    public WebElement moreTravel;
    @FindBy(xpath = "//*[@title=\"Number of rooms\"]/option[2]")
    public WebElement roomNumb;
    @FindBy(xpath = "//*[@id=\"Adult_1\"]/option[1]")
    public WebElement adult1Numb;
    @FindBy(xpath = "//*[@id=\"Childs_1\"]/option[2]")
    public WebElement child1Numb;
    @FindBy(xpath = "//*[@name=\"ca1\"]/option[4]")
    public WebElement childAge;
    @FindBy(xpath = "//*[@id='Adult_2']/option[3]")
    public WebElement adult2Numb;
    @FindBy(xpath = "//*[@id='Childs_2']/option[3]")
    public WebElement child2Numb;

    @FindBy(xpath = "//*[@name='ca2']/option[3]")
    public WebElement child1dAge;
    @FindBy(xpath = "//*[@class='ageChild2 childAge required span span24']/option[5]")
    public WebElement child2dAge;

    @FindBy(xpath = "//*[@id=\"SearchHotelsButton\"]")
    public WebElement searchHotel;
    @FindBy(xpath = "//a[@class='hotelDetails']")
    public WebElement searchResult;

















}
