package Day10_02062023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class T2_ImplicitWait_USPS {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        //navigate to usps
        driver.navigate().to("https://www.usps.com");
        //implicitly wait for 4 seconds, global wait and applies to all the elements
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //hover over send tab
        //store the send tab element in a webelement variable
        WebElement sendTab = driver.findElement(By.xpath("//*[@id = 'mail-ship-width']"));
        //declare mouse actions
        Actions mouseActions = new Actions(driver);
        //move to the desired element (send tab), .perform() is needed for mouse actions
        mouseActions.moveToElement(sendTab).perform();
        //click on calculate a price using mouse click
        WebElement calcPrice = driver.findElement(By.xpath("//*[@class= 'tool-calc']"));
        //move to the calculate a price element then click on it
        mouseActions.moveToElement(calcPrice).click().perform();
        //store usps home into web element
        WebElement uspsHome = driver.findElement(By.xpath("//*[@alt = 'USPS.com home']"));
        //right click on usps home logo
        mouseActions.moveToElement(uspsHome).contextClick().perform();
        //double click on usps home logo
        mouseActions.moveToElement(uspsHome).doubleClick().perform();
        //quit the driver
        driver.quit();
    }//end of main method
}//end of class
