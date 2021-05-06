package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {
    /*
    TC 1: Facebook dropdown verification
Open chrome browser
Go to "https://www.facebook.com"
click on create new account
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser
     */

    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement createNewAccount= driver.findElement(By.cssSelector("a[data-testid ^='open']"));
        createNewAccount.click();
        Thread.sleep(1000);
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Yauheniya");
        Thread.sleep(1000);
        WebElement lastName= driver.findElement(By.xpath("//input[@name = 'lastname']"));
        lastName.sendKeys("Lia");
        Thread.sleep(1000);
        WebElement email = driver.findElement(By.xpath("//input[contains(@name , 'reg_email__')]"));
        email.sendKeys("blabla@gmail.com");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.xpath("//input [@data-type = 'password']"));
        password.sendKeys("pass1234P");
        Thread.sleep(1000);

        WebElement month = driver.findElement(By.xpath("//select [@title = 'Month']"));
        Select selectMonth = new Select(month);
        List<WebElement> optionsMonth = selectMonth.getOptions();
        int sizeMonth = optionsMonth.size();
        System.out.println("Size of months "+sizeMonth);
        selectMonth.selectByIndex(1);

        WebElement day = driver.findElement(By.xpath("//select [@title = 'Day']"));
        Select selectDay = new Select(day);
        List<WebElement> optionsDay = selectDay.getOptions();
        int sizeDay = optionsDay.size();
        System.out.println("Size of days "+sizeDay);
        selectDay.selectByValue("15");

        WebElement year = driver.findElement(By.xpath("//select [@title = 'Year']"));
        Select selectYear = new Select(year);
        List<WebElement> optionsYear = selectYear.getOptions();
        int sizeYear = optionsYear.size();
        System.out.println("Size of years "+sizeYear);
        selectYear.selectByVisibleText("1992");

        Thread.sleep(3000);
        driver.quit();








    }
}
