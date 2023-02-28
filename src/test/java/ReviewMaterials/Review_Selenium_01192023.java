package ReviewMaterials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review_Selenium_01192023 {
    public static void main(String[] args) throws InterruptedException {
        //set up our chrome driver manager
        WebDriverManager.chromedriver().setup();
        //define your WebDriver for chrome driver
        WebDriver driver = new ChromeDriver();
        //navigate to google home page
        driver.navigate().to("https://www.google.com");
        //enter the keyword cars on your search field
        //this is an example of relative xpath
        driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("cars");
        //this is an example of absolute xpath
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("cars");
        //hit submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        //this will slow down the code by 4 seconds (helpful when browser is slower than java code)
        Thread.sleep(4000);
        //capture the search results and only print out the search number
        String results = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        String[] arrayMessage = results.split(" ");
        System.out.println("Search Number is " + arrayMessage[1]);
        //quit the driver
        driver.quit();
    }//end of main
}//end of class

