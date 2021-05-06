package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {
    public static void main(String[] args) throws InterruptedException {

        /*
        Task
        Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
        Login
        Get title and verify
        logout
        close the browser
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        /*driver.findElement(By.className("txt")).sendKeys("Tester");
        driver.findElement(By.className("txt")).sendKeys("test");*/
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        driver.findElement(By.className("button")).click();
        String title=driver.getTitle();
        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("Title is RIGHT");
        }else{
            System.out.println("Title is WRONG");
        }
        Thread.sleep(2000);

        //driver.findElement(By.id("stl00_logout")).click();
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();


    }
}
