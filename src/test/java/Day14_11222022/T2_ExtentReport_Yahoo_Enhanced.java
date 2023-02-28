package Day14_11222022;

import Day13_02142023.TestBase;
import Reusable_Library.ReusableActions_Loggers;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class T2_ExtentReport_Yahoo_Enhanced extends TestBase {
    @Test
    public void tc001_verifySignInOptionIsChecked() {
        //first navigate to yahoo homepage
        driver.navigate().to("https://www.yahoo.com");
        //next we need to click on sign in button
        ReusableActions_Loggers.clickAction(driver, "//*[@class = '_yb_w7iux']", logger, "Sign In");
        //we need to verify that signed in option is checked
        boolean isSignInChecked = driver.findElement(By.xpath("//*[@id= 'persistent']")).isSelected();
        //the actual validation of the test
        //here we check if the checkbox is checked then pass the test
        //if it is not checked then fail the test
        ReusableActions_Loggers.isConditionTrue(isSignInChecked, logger);
    }//end of test 1

    @Test(dependsOnMethods = "tc001_verifySignInOptionIsChecked")
    public void tc002_verifySignInOptionIsUnchecked() {
        //click on check box to uncheck it
        ReusableActions_Loggers.clickAction(driver, "//*[@class= 'stay-signed-in checkbox-container']", logger, "CheckBox");
        //we need to verify that signed in option is checked
        boolean isSignInChecked = driver.findElement(By.xpath("//*[@id= 'persistent']")).isSelected();
        //the actual validation of the test
        //here we check if the checkbox is checked then pass the test
        //if it is not checked then fail the test
        ReusableActions_Loggers.isConditionTrue(isSignInChecked, logger);
    }//end of test 2
}
