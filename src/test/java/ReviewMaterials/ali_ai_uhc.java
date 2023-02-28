package ReviewMaterials;

import Reusable_Library.ReusableActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class ali_ai_uhc {
    public static void main(String[] args) throws InterruptedException {
        // create an array list

        ArrayList<String> zipCodes= new ArrayList<>();
        zipCodes.add("11218");

// create an arraylist for
        ArrayList<String> miles = new ArrayList<>();
        miles.add("With in 15 Miles");
        miles.add("With in 10 Miles");
        miles.add("With in 5 Miles");


        WebDriver driver = ReusableActions.setUpDriver();
        for (int i = 0; i < zipCodes.size(); i++) {


            // create a for loop

            driver.navigate().to("https://www.UHC.com");
            Thread.sleep(3000);
            ReusableActions.clickAction(driver, "//*[text()= 'Find a doctor']", "doctorLink");
            //handle pop up window with clicking no
            try {
                WebElement weValueYourFeedback = driver.findElement(By.xpath("//*[@id='layer-container-127097']"));
                if (weValueYourFeedback.isDisplayed()) {
                    driver.findElement(By.xpath("//*[@id='ip-no']")).click();
                }//end of if condition
            } catch (Exception e) {
                System.out.println("Unable to find pop up window " + e);
            }//end of pop up window exception
            Thread.sleep(3000);
            ReusableActions.clickActionByIndex(driver, "//*[@data-cta-component='ctaComponent']", 7, "find a dentist");
            Thread.sleep(3000);

            ReusableActions.switchToTabByIndex(driver, 1 );
            Thread.sleep(3000);
            ReusableActions.clickActionByIndex(driver, "//*[@class='option-title']", 2, "Medicareplan");
            Thread.sleep(3000);
            ReusableActions.sendKeysAction(driver, "//*[@id='location']", zipCodes.get(i), "type zipcode");
            Thread.sleep(3000);

            // driver.findElement(By.xpath("//*[@id='location']")).clear();

            ReusableActions.clickAction(driver, "//*[text()= 'Continue']", "continue");
            Thread.sleep(3000);




            ReusableActions.clickAction(driver, "//*[@class='sc-hobhWc xhJGb']", "click on no preference");
            Thread.sleep(3000);
            driver.navigate().refresh();
            Thread.sleep(3000);

            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(2000);
            ReusableActions.clickAction(driver, "//*[@data-test-id = 'GeneralDentists']", "General Dentist");
            //driver.findElement(By.xpath("//*[@data-test-id = 'GeneralDentists']")).click();
            //driver.navigate().refresh();
            Thread.sleep(2000);
            ReusableActions.clickAction(driver,"//*[text() ='Change Location']","Click Change Location");
            ReusableActions.sendKeysAction(driver,"//*[@id='location']",zipCodes.get(i),"Retype zipcode");
            Thread.sleep(2000);
            ReusableActions.clickAction(driver,"//*[@data-testid='change-location-submit']","Update Location");
            Thread.sleep(2000);
//            ReusableActions.selectByText(driver, "//*[@data-test-id ='radius-miles-dropdown']", miles.get(i), "Select miles");
//            driver.navigate().refresh();
//
//
//
//
//
//
//driver.close();
//            ReusableActions.switchToTabByIndex(driver, 0 );


// create a for loop

driver.quit();


        }//end of loop


    } // end of main
}
