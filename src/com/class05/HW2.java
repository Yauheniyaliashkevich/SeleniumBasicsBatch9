package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW2 {
    /*
    Amazon link count:
Open chrome browser
Go to "https://www.amazon.com/"
Get all links
Get number of links that has text
Print to console only the links that has text
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));

        int count=0;
        for (WebElement link: links
             ) {
            String fullLink = link.getAttribute("href");
             String getText = link.getText();

             if(!getText.isEmpty()){
                 System.out.println(getText+"          "+fullLink);
                 count++;

             }
        }
        System.out.println("Number of links that have text: "+count);


    }
}
