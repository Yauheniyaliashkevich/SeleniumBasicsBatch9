package review.class05;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class ActionsReview {
    public static void main(String[] args) {

        String url = "http://demo.guru99.com/test/simple_context_menu.html";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        //driver.manage().window().maximize();

        WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action = new Actions (driver);
        action.contextClick(rightClick).perform();

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.open()");
        //js.executeScript("arguments[0].style.backgroundColor='blue'",element);







    }
}
