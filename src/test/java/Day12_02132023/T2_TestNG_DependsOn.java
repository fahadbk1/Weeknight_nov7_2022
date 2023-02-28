package Day12_02132023;

import Reusable_Library.ReusableActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class T2_TestNG_DependsOn {
    //define wedbdriver
    WebDriver driver;

    //define the prerequisites
    @BeforeSuite
    public void setChromeDriver() {
        driver = ReusableActions.setUpDriver();
    }//end of setDriver method

    @Test
    public void searchForACar() {
        //go to google.com
        driver.navigate().to("https://www.google.com");
        //enter a car in the search field
        ReusableActions.sendKeysAction(driver, "//*[@name='q']", "Benz", "Search Field");
        //hit submit on the google search button
        ReusableActions.submitAction(driver, "//*[@name='btnK']", "Google Search Button");
    }//end of test 1

    @Test(dependsOnMethods = "searchForACar")
    public void captureSearchResult() {
        String result = ReusableActions.getTextAction(driver, "//*[@id='result-stats']", "Search Results");
        String[] arrayResult = result.split(" ");
        System.out.println("Result is " + arrayResult[1]);
    }//end of test 2

    @AfterSuite
    public void quitDriverSession() {
        driver.quit();
    }
}//end of class

