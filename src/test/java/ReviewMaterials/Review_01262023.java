package ReviewMaterials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;


public class Review_01262023 {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare chrome options
        //note that chrome options need to be defined before the webDriver
        ChromeOptions options = new ChromeOptions();
        //start maximized option
        options.addArguments("start-maximized", "incognito");
        WebDriver driver = new ChromeDriver(options);
        //go to Anthem.com
        driver.navigate().to("https://www.anthem.com");

        //Requirement1
        //I would like to validate the description for Individual & Family Plans
        String familyPlanDesc = driver.findElement(By.xpath("//*[@class = 'richTextEditor secondary']")).getText();
        System.out.println("Family Plan text is: " + familyPlanDesc);


        String medicarePlanDesc = driver.findElements(By.xpath("//*[@class = 'richTextEditor secondary']")).get(1).getText();
        System.out.println("Medicare text is: " + medicarePlanDesc);

        //Requirement2
        //I would like to validate all the descriptions of all the plans
        //hint: for loop, webElement, getText
        List<WebElement> planDescriptionElements = driver.findElements(By.xpath("//*[@class = 'richTextEditor secondary']"));
        for (int i = 0; i < planDescriptionElements.size()-4; i++) {
            System.out.println("Plan description for plan " + i + " is: " + planDescriptionElements.get(i).getText());
        }
        //quit driver
        driver.quit();

    }//end of main
}//end of class
