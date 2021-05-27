package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingCalendars {
    /*
    Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
click on leave
click on leave list
choose from "From calendar"
choose from "To calendar"
click only on cancelled and rejected checkboxes
uncheck Pending Approval
select IT support from DD
click search
quit the browser
     */
    public static String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        Thread.sleep(2000);
        WebElement leaveButton = driver.findElement(By.linkText("Leave"));
        leaveButton.click();

        Thread.sleep(2000);
        WebElement fromCalendar = driver.findElement(By.id("calFromDate"));
        fromCalendar.click();

        Thread.sleep(2000);
        WebElement mDD=driver.findElement(By.className("ui-datepicker-month"));
        Select monthDD = new Select(mDD);
        monthDD.selectByVisibleText("Jul");

        List<WebElement> fromDates = driver.findElements(By.xpath("//table[@class ='ui-datepicker-calendar']/tbody/tr/td"));
        System.out.println(fromDates.size());
        for (WebElement fromDate: fromDates
             ) {
            if(fromDate.getText().equals("29")){
                fromDate.click();
                break;
            }
        }

        WebElement toCalendar = driver.findElement(By.id("calToDate"));
        toCalendar.click();

        WebElement mmDD = driver.findElement(By.className("ui-datepicker-month"));
        Select mmonthDD = new Select(mmDD);
        mmonthDD.selectByValue("7");

        WebElement yyDD = driver.findElement(By.className("ui-datepicker-year"));
        Select yyearDD = new Select(yyDD);
        yyearDD.selectByVisibleText("2022");

        List <WebElement> toDates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        System.out.println(toDates.size());
        for (WebElement toDate : toDates
             ) {
            if(toDate.getText().equals("13")){
                toDate.click();
                break;
            }
        }

        WebElement rejectedCB = driver.findElement(By.id("leaveList_chkSearchFilter_-1"));
        rejectedCB.click();

        WebElement cancelledCB = driver.findElement(By.id("leaveList_chkSearchFilter_0"));
        cancelledCB.click();

        WebElement pendingApprovalCB = driver.findElement(By.id("leaveList_chkSearchFilter_1"));
        pendingApprovalCB.click();

        WebElement subUnit = driver.findElement(By.id("leaveList_cmbSubunit"));
        Select selectSU = new Select(subUnit);
        selectSU.selectByIndex(1);

        WebElement searchBtn = driver.findElement(By.id("btnSearch"));
        searchBtn.click();

        Thread.sleep(2000);
        driver.quit();
















    }
}
