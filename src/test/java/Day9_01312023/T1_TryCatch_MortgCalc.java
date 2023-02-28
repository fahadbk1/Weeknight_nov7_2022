package Day9_01312023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_TryCatch_MortgCalc {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare chrome options
        //note that chrome options need to be defined before the webDriver
        ChromeOptions options = new ChromeOptions();
        //start maximized option
        options.addArguments("start-maximized");
        //define the webDriver and pass the chrome options into the driver method
        WebDriver driver = new ChromeDriver(options);
        //go to mlcalc page
        driver.navigate().to("https://www.mortgagecalculator.org/");
        //wait a bit
        Thread.sleep(1000);

        //start of home value try-catch block
        try {
            //store homevalue in a webElement
            WebElement homeValue = driver.findElement(By.xpath("//*[@id = 'homeval']"));
            //clear the default homevalue
            homeValue.clear();
            //enter a new home value
            homeValue.sendKeys("799000");
        } catch (Exception err) {
            System.out.println("Unable to enter home value for reason: " + err);
        }//end of home value try-catch block
        //end of test step 1

        //start of downpayment try-catch block
        try {
            //store downpayment in a webElement
            WebElement downPayment = driver.findElement(By.xpath("//*[@id = 'downpayment']"));
            //clear the default downpayment
            downPayment.clear();
            //enter a new home value
            downPayment.sendKeys("80000");
        } catch (Exception err) {
            System.out.println("Unable to enter down payment for reason: " + err);
        }//end of downpayment try-catch block
        //end of test step 2

        //start of startMonth try-catch block
        try {
            //store startmonth in a webElement
            WebElement startMonth = driver.findElement(By.xpath("//*[@name = 'param[start_month]']"));
            Select startMonthDropDown = new Select(startMonth);
            startMonthDropDown.selectByVisibleText("Jun");
        } catch (Exception err) {
            System.out.println("Unable to select start month dropdown for reason: " + err);
        }//end of startmonth try-catch block
        //end of step 3

        //start of click on calculate button try-catch block
        try {
            //click on the calculate button
            driver.findElement(By.xpath("//*[@value = 'Calculate']")).click();
        } catch (Exception err) {
            System.out.println("Unable to click on calculate button for reason: " + err);
        }//end of click on calculate button try-catch block
        //end of test step 4

        //start of capture monthly payment try-catch block
        try {
            //capture the monthly payment
            String monthlyPayment = driver.findElements(By.xpath("//*[@class= 'left-cell']/h3")).get(0).getText();
            System.out.println("The monthly payment is: " + monthlyPayment);
        } catch (Exception err) {
            System.out.println("Unable to capture monthly payment for reason: " + err);
        }//end of click on calculate button try-catch block

        //quit the driver
        driver.quit();
    }//end of main
}//end of class
