package Day13_02142023.Day15_02272023;

import Day13_02142023.TestBase;
import Reusable_Library.ReusableActions_Loggers;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T1_yahoo_screenshot extends TestBase {

    @Test
    public void tc001_verifyStaySignInOptionIsChecked() {
        //navigate to yahoo.com
        driver.navigate().to("https://www.yahoo.com");
        //next we need to click on the sign in button
        ReusableActions_Loggers.clickAction(driver, "//*[@class='_yb_8k0cvV']", logger, "Sign In");
        //verify the stay signed in option is checked
        boolean isStaySignedInChecked = driver.findElement(By.xpath("//*[@id = 'persistent']")).isSelected();
        //print true or false if checkbox is checked
        System.out.println("The checkbox is checked " + isStaySignedInChecked);
    }//end of test 1

    @Test(dependsOnMethods = "tc001_verifyStaySignInOptionIsChecked")
    public void tc002_verifySignInOptionIsUnchecked() {
        //click on the check box to uncheck it
        ReusableActions_Loggers.clickAction(driver, "//*[@class = 'stay-signed-in checkbox-container']", logger, "CheckBox");
        //check the state of the checkbox (it should be unchecked now)
        boolean isStaySignedInChecked = driver.findElement(By.xpath("//*[@id = 'persistent']")).isSelected();
        //print true or false if checkbox is checked
        System.out.println("The checkbox is checked: " + isStaySignedInChecked);
    }//end of test 2
}//end of class
