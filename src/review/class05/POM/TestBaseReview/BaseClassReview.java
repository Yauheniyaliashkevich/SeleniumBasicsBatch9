package review.class05.POM.TestBaseReview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClassReview {

    public static WebDriver driver;

    /*
    This method is opening the browser
     */

    public static void setupWithSpecificURl(String url){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
        //driver.manage().window().maximize();
    }

    /*
    This method is closing the browser
     */

    public static void tearDown(){
        driver.quit();
    }





}
