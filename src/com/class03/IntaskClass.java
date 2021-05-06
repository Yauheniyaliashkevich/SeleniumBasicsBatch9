package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntaskClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        /*driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();*/
        //driver.findElement(By.xpath("//input[@class='txt]")).sendKeys("Tester");
        //driver.findElement(By.xpath("//input[@type='password]")).sendKeys("Test");
        WebElement usernameTextBox = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
        usernameTextBox.sendKeys("Tester");
        WebElement passwordTextBox =driver.findElement(By.xpath("//input[@type='password']"));
        passwordTextBox.sendKeys("test");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        driver.quit();
    }
}
