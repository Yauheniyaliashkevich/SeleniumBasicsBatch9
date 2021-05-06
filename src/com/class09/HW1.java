package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW1 {
    /*
    go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
====================
Build functions (methods) to open and close browsers
     */

    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement checkbox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
        checkbox.click();
        WebElement removeBtn = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeBtn.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement text1= driver.findElement(By.xpath("//p[@id = 'message']"));
        String text11= text1.getText();
        if(text11.equalsIgnoreCase("It's gone!")){
            System.out.println("Text 1 is verified");
        }else{
            System.out.println("Text 1 is not verified");
        }

        WebElement unableBtn = driver.findElement(By.xpath("//button [@onclick='swapInput()']"));
        unableBtn.click();
        if(unableBtn.isEnabled()){
            System.out.println("TextBox 1 'Unable' is unable");
        }else{
            System.out.println("TextBox 1 'Unable' is not unable");
        }
        WebElement text2= driver.findElement(By.xpath("//p[@id='message']"));
        String text22= text2.getText();
        if(text22.equalsIgnoreCase("It's enabled!")){
            System.out.println("Text 2 is verified");
        }else{
            System.out.println("Text 2 is not verified");
        }

        WebElement textBox1 = driver.findElement(By.xpath("//input[@style='width: 30%;']"));
        textBox1.sendKeys("BlaBla");


        WebElement disableBtn = driver.findElement(By.xpath("//button[text()='Disable']"));
        disableBtn.click();

        if(textBox1.isEnabled()){
            System.out.println("TextBox 2 is enabled");
        }else{
            System.out.println("TextBox 2 is not enabled");
        }

        driver.quit();








    }
}
