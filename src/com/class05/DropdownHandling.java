package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownHandling {
    public static String url= "http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        Thread.sleep(1000);

        WebElement daysDD =driver.findElement(By.id("select-demo"));
        Select select=new Select(daysDD);

        /*Thread.sleep(1000);
        select.selectByIndex(2);
        Thread.sleep(1000);
        select.selectByVisibleText("Wednesday");

        select.selectByValue("Sunday");*/

        List<WebElement> allOptions= select.getOptions();
        int size = allOptions.size();
        System.out.println(size);

        for (int i = 0; i < size; i++) {
            String optionText = allOptions.get(i).getText();
            select.selectByIndex(i);
            Thread.sleep(2000);
            System.out.println(optionText);
        }








    }
}
