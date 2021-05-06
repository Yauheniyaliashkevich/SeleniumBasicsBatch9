package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW1 {
    /*
    HW
Go to https://demoqa.com/browser-windows
click on New Tab and print the text from new tab in the console
click on New Window and print the text from new window in the console
click on New Window Message and print the text from new window in the console
Verify the title is displayed
Print out the title of the all pages
     */

    public static void main(String[] args) throws InterruptedException {
        String url = "https://demoqa.com/browser-windows";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String mainPage = driver.getWindowHandle();

        WebElement newTabBtn = driver.findElement(By.xpath("//button[@id='tabButton']"));
        WebElement newWindowBtn = driver.findElement(By.cssSelector("button[id='windowButton']"));
        WebElement newWindowMessageBtn = driver.findElement(By.id("messageWindowButton"));
        newTabBtn.click();
        newWindowBtn.click();
        newWindowMessageBtn.click();



        String title = driver.getTitle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Size : " + allWindowHandles.size());

        Iterator<String> it = allWindowHandles.iterator();
        while (it.hasNext()) {
            String handle = it.next();
            if (!handle.equals(mainPage)) {

                driver.switchTo().window(handle);
                System.out.println(title);
                driver.close();

                }
            }
        driver.switchTo().window(mainPage);
        System.out.println("Main Page Title "+title);
        Thread.sleep(3000);
        driver.quit();





        }


    }

