package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    /*
    HRMS Application Negative Login:
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Verify error message with text "Password cannot be empty" is displayed.
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.cssSelector("input[id='txtUsername']"));
        userName.sendKeys("Yauheniya");
        WebElement loginBtn = driver.findElement(By.cssSelector("input#btnLogin"));
        loginBtn.click();
        WebElement errorMessage = driver.findElement(By.cssSelector("span[id ^= 'span']"));
        boolean errorMessageIsDisplayed = errorMessage.isDisplayed();
        System.out.println(errorMessageIsDisplayed);
        Thread.sleep(3000);
        driver.quit();








    }
}
