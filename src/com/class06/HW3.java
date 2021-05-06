package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class HW3 {
    /*
    Go to ebay.com
    get all the categories and print them in the console
    select Computers/Tables & Networking
    click on search
    verify the header
     */

    public static String url = "https://www.ebay.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement categories =driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select select = new Select(categories);
        List<WebElement> list = select.getOptions();

        Iterator <WebElement> iterator= list.iterator();
        while (iterator.hasNext()){
            WebElement next=iterator.next();
            String text= next.getText();
            System.out.println(text);

        }
        select.selectByValue("58058");

        WebElement searchBtn = driver.findElement(By.id("gh-btn"));
        searchBtn.click();

        WebElement header = driver.findElement(By.className("b-pageheader__text"));

        boolean isDisplayed = header.isDisplayed();
        if(isDisplayed){
            System.out.println("Header is displayed");
        }else{
            System.out.println("Header is not displayed");
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
