package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*
    navigate to fb.com
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop up
    close the browser
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Yauheniya");
        driver.findElement(By.name("lastname")).sendKeys("Liashkevich");
        driver.findElement(By.name("reg_email__")).sendKeys("yauheniyaliashkevichaga@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("yauheniyaliashkevichaga@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("12345Qwert");
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        Thread.sleep(2000);
        driver.quit();









    }
}
