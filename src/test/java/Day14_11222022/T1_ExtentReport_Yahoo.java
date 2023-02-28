package Day14_11222022;

import Reusable_Library.ReusableActions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T1_ExtentReport_Yahoo {
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;

    @BeforeSuite
    public void setChromeDriver() {
        driver = ReusableActions.setUpDriver();
        reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report.html", true);
    }//end of set driver method

    @Test
    public void tc001_verifySignInOptionIsChecked() {
        //set the name of the test case to the report by using logger concept
        logger = reports.startTest("tc001_verifySignInOptionIsChecked");
        //first navigate to yahoo homepage
        driver.navigate().to("https://www.yahoo.com");
        //next we need to click on sign in button
        ReusableActions.clickAction(driver, "//*[@class = '_yb_w7iux']", "Sign In");
        logger.log(LogStatus.INFO, "Successfully clicked on the sign in button");
        //we need to verify that signed in option is checked
        boolean isSignInChecked = driver.findElement(By.xpath("//*[@id= 'persistent']")).isSelected();
        //the actual validation of the test
        //here we check if the checkbox is checked then pass the test
        //if it is not checked then fail the test
        if (isSignInChecked == true) {
            logger.log(LogStatus.PASS, "The checkbox is checked: " + isSignInChecked);
        } else {
            logger.log(LogStatus.FAIL, "The checkbox is checked: " + isSignInChecked);
        }
//        System.out.println("The checkbox is checked: " + isSignInChecked);
        //end the logger for test 1
        reports.endTest(logger);
    }//end of test 1

    @Test(dependsOnMethods = "tc001_verifySignInOptionIsChecked")
    public void tc002_verifySignInOptionIsUnchecked() {
        //set the name of the test case to the report by using logger concept
        logger = reports.startTest("tc002_verifySignInOptionIsUnchecked");
        //click on check box to uncheck it
        ReusableActions.clickAction(driver, "//*[@class= 'stay-signed-in checkbox-container']", "CheckBox");
        //we need to verify that signed in option is checked
        boolean isSignInChecked = driver.findElement(By.xpath("//*[@id= 'persistent']")).isSelected();
        //the actual validation of the test
        //here we check if the checkbox is checked then pass the test
        //if it is not checked then fail the test
        if (isSignInChecked == true) {
            logger.log(LogStatus.PASS, "The checkbox is checked: " + isSignInChecked);
        } else {
            logger.log(LogStatus.FAIL, "The checkbox is checked: " + isSignInChecked);
        }
//        System.out.println("The checkbox is checked: " + isSignInChecked);
        //end the logger for test 1
        reports.endTest(logger);
    }//end of test 2

    @AfterSuite
    public void quitDriverSession() {
        //quit driver
        driver.quit();
        //needed to create the html report after test execution
        reports.flush();
    }//end of after suite
}
