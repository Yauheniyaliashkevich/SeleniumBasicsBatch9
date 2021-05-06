package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
   navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
   fill out the form
   click on register
   close the browser

     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        WebElement firstName= driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("Yauheniya");
        WebElement lastName=driver.findElement(By.id("customer.lastName"));
        lastName.sendKeys("Liashkevich");
        WebElement address=driver.findElement(By.id("customer.address.street"));
        address.sendKeys("E Illinois St");
        WebElement city=driver.findElement(By.id("customer.address.city"));
        city.sendKeys("Chicago");
        WebElement state=driver.findElement(By.id("customer.address.state"));
        state.sendKeys("IL");
        WebElement zip=driver.findElement(By.id("customer.address.zipCode"));
        zip.sendKeys("60611");
        WebElement phone=driver.findElement(By.id("customer.phoneNumber"));
        phone.sendKeys("5164952244");
        WebElement ssn=driver.findElement(By.id("customer.ssn"));
        ssn.sendKeys("123-123-1234");
        WebElement userName=driver.findElement(By.id("customer.username"));
        userName.sendKeys("moloko_92");
        WebElement password=driver.findElement(By.id("customer.password"));
        password.sendKeys("12345Qwert");
        WebElement confirmPassword=driver.findElement(By.id("repeatedPassword"));
        confirmPassword.sendKeys("12345Qwert");
        WebElement register=driver.findElement(By.className("button"));
        register.click();
        driver.close();








    }
}
