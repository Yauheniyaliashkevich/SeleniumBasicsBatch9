package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
    HW
Navigate to http://syntaxtechs.com/selenium-practice/index.php
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
quit the browser
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.id("btn_basic_example")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='list-group-item']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter your Message')]")).sendKeys("Janethebest");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(5000);
        driver.quit();









    }
}
