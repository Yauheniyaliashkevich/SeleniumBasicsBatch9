package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class AmazonDDHandking {
    public static String url= "http://amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(categoriesDD);


        //for each loop
        /*List<WebElement> options =select.getOptions();
        for(WebElement option:options){
            String optionText = option.getText();
            System.out.println(optionText);
        }
        select.selectByValue("search-alias=alexa-skills");*/



        // My code
        /*Iterator <WebElement> iterator=options.iterator();
        while(iterator.hasNext()){
            WebElement iteratorNext= iterator.next();
            String optionText = iteratorNext.getText();
            System.out.println(optionText);
        }*/

        /* boolean isMultiple = select.isMultiple();
        System.out.println(isMultiple);
        if(isMultiple){

            for (WebElement option:options
            ) {
                String optionText = option.getText();
                select.selectByVisibleText(optionText);
                Thread.sleep(1000);
            }
        }*/



        // Teacher code
        boolean isMultiple = select.isMultiple();
        System.out.println(isMultiple);
        if(!isMultiple){
            List<WebElement> options =select.getOptions();
            Iterator <WebElement> iterator=options.iterator();
            while (iterator.hasNext()){
                WebElement iteratorNext= iterator.next();
                String optionText = iteratorNext.getText();
                System.out.println(optionText);
            }
        }











        }
    }
