package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW2 {
    /*
    HW
navigate to http://www.uitestpractice.com/Students/Contact
click on the link
get text
print out in the console
     */

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "http://www.uitestpractice.com/Students/Contact";
        driver.get(url);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String  mainPageHandle = driver.getWindowHandle();
        WebElement ajaxLinkBtn = driver.findElement(By.xpath("//a[@data-ajax-update='#Result']"));
        ajaxLinkBtn.click();

        WebElement text = driver.findElement(By.xpath("//div[@class='ContactUs']/p"));
        System.out.println(text.getText());

        driver.quit();
        /*try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", ajaxLinkBtn);
*/









    }



}
