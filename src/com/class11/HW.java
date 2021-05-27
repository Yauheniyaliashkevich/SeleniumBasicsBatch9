package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    /*
    Go to aa.com/homePage.do
select depart date
select return date
select destination
click on search
quit the browser
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url="https://www.aa.com/homePage.do";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement calendarTo = driver.findElement(By.id("aa-leavingOn"));
        calendarTo.click();

        WebElement depMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']/div/span[@class='ui-datepicker-month']"));
        String depMonthText= depMonth.getText();
        WebElement nextBtn = driver.findElement(By.xpath("//a[@title='Next']"));

        while(!depMonthText.equals("September")){
            WebElement nextBtn2 = driver.findElement(By.xpath("//a[@title='Next']"));
            nextBtn2.click();
            /*WebElement depMonth2 = driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']/div/span[@class='ui-datepicker-month']"));
            depMonthText= depMonth2.getText();*/
            depMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']/div/span[@class='ui-datepicker-month']"));
            depMonthText =depMonth.getText();
        }

        List<WebElement> depDates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td"));
        for (WebElement depDate: depDates
             ) {
            if(depDate.getText().equals("15")){
                depDate.click();
                break;
            }
        }

        WebElement calendarFrom = driver.findElement(By.id("aa-returningFrom"));
        calendarFrom.click();

        WebElement aMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']/div/span[@class='ui-datepicker-month']"));
        String aMonthText = aMonth.getText();
        while(!aMonthText.equals("February")){
            WebElement nextBtn2 = driver.findElement(By.xpath("//a[@title='Next']"));
            nextBtn2.click();
            aMonth =driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']/div/span[@class='ui-datepicker-month']"));
            aMonthText = aMonth.getText();
        }

        List <WebElement> arrDates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td"));
        for (WebElement arrDate: arrDates
             ) {
            if(arrDate.getText().equals("15")){
                arrDate.click();
                break;
            }
        }



        /*WebElement searchFrom = driver.findElement(By.xpath("//a[@data-for='reservationFlightSearchForm.originAirport']/span[@class='icon icon-search']"));
        searchFrom.click();

        WebElement countrySTo = driver.findElement(By.id("countryCode"));
        Select selectTo = new Select(countrySTo);
        selectTo.selectByVisibleText("United States");

        WebElement statesTo = driver.findElement(By.id("stateCode"));
        Select selectToTo = new Select(statesTo);
        selectToTo.selectByValue("FL");

        List <WebElement> stateAirports = driver.findElements(By.xpath("//table[@id='airportsSection']/tbody/tr/td"));
        for (WebElement stateAirport: stateAirports
             ) {
            if(stateAirport.getText().equals("TPA")){
                stateAirport.click();
                break;
            }
        }

        WebElement closeBtn = driver.findElement(By.linkText("Close"));
        closeBtn.click();*/


      /*  WebElement distinationFrom = driver.findElement(By.name("originAirport"));
        distinationFrom.sendKeys("CHI");*/

        WebElement distinationTo = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
        distinationTo.sendKeys("LAX");


        WebElement searchBtn = driver.findElement(By.id("flightSearchForm.button.reSubmit"));
        searchBtn.click();




    }
}
