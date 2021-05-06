package review.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver(); //launch the browser
        String url = "https://www.bbc.com/";
        driver.get(url);
        //driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='idcta-link']")).click();// by id
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Register now']")).click(); //by text
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@href,'age?')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@id,'day')]")).sendKeys("15");
        driver.findElement(By.xpath("//input[starts-with(@id,'month')]")).sendKeys("02");
        driver.findElement(By.xpath("//input[starts-with(@id,'year')]")).sendKeys("1992");
    }
}
