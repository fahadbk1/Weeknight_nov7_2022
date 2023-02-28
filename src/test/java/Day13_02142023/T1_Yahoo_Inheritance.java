package Day13_02142023;

import Reusable_Library.ReusableActions;
import org.testng.annotations.Test;

public class T1_Yahoo_Inheritance extends TestBase {

    //first test: search for a car
    @Test
    public void searchForACar() {
        driver.navigate().to("https://www.yahoo.com");
        ReusableActions.sendKeysAction(driver, "//*[@name='p']", "cars", "Search Field");
        ReusableActions.clickAction(driver, "//*[@id='ybar-search']", "Search Icon");
        String result = ReusableActions.getTextAction(driver, "//*[@class='title mb-0']", "Search Results");
        System.out.println("Results: " + result);
    }
}//end of class
