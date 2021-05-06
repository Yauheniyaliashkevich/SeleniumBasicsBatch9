package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {
    /*
    Go to facebook sign up page
Fill out the whole form
Click signup
     */

    public static String url = "https://www.facebook.com/";
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement createNewAccount = driver.findElement(By.linkText("Create New Account"));
        createNewAccount.click();
        Thread.sleep(2000);
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Yauheniya");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Liashkevich");
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("Blabla@gmail.com");
        WebElement confirmEmail = driver.findElement(By.name("reg_email_confirmation__"));
        confirmEmail.sendKeys("Blabla@gmail.com");
        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("1234Pass");
        Thread.sleep(2000);
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select selectMonth= new Select(month);
        selectMonth.selectByVisibleText("Feb");
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(15);
        WebElement year = driver.findElement(By.cssSelector("select#year"));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1992");
        WebElement sex=driver.findElement(By.xpath("//input[@name='sex'][@value='1']"));
        sex.click();
        Thread.sleep(3000);
        WebElement submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
        submit.click();








    }
}
