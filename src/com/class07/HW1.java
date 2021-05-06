package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class HW1 {
    /*
    Navigate to http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php
verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
verify enroll today button is enabled
     */

    public static String url= "http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
       // driver.manage().window().maximize();

        WebElement header = driver.findElement(By.xpath("//a[@href='index.php'][1]"));

        boolean isDisplayed = header.isDisplayed();
        if(isDisplayed){
            System.out.println("Header is displayed");
            String text = header.getText();
            if(text.equalsIgnoreCase("AUTOMATION TESTING PLATFORM BY SYNTAX")){
                System.out.println("Header is equal to: "+text);
            }
        }else{
            System.out.println("Header is not displayed");
        }

        driver.switchTo().frame(1);

        WebElement enrollBtn = driver.findElement(By.xpath("//a[@class='enroll-btn']"));
        boolean isEnabled= enrollBtn.isEnabled();
        if(isEnabled){
            System.out.println("Button is enabled");
        }else{
            System.out.println("Button is not enabled");
        }









    }
}
