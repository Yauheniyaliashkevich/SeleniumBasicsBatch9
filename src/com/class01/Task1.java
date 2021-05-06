package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        String url=driver.getCurrentUrl();
        String title=driver.getTitle();
        System.out.println(url+" "+title);
        driver.quit();

    }
}
