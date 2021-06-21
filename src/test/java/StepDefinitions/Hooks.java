package StepDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class    Hooks {

    @Before

    public void setUp(){
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
    }

//    @After
//    public void tearDown(Scenario scenario){
//        Driver.closeDriver();
//    }
}