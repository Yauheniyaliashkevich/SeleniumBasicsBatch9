package review.class02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsReview {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
        driver.get(url);

        //switchTo()
        //     it simply switches to that particular alert and
        //     allows us to perform operations in it


        // SIMPLE ALERT
        driver.findElement(By.xpath("//input[@value='Alert']")).click();
        Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();

        // CONFORMATIONAL ALERT
        driver.findElement(By.xpath("//input[@value='Confirmation Box']")).click();
        Thread.sleep(2000);
        Alert confirmationalAlert = driver.switchTo().alert();
        String alertText= confirmationalAlert.getText();
        System.out.println("The text of the Alert is: "+alertText);
        Thread.sleep(2000);
        confirmationalAlert.dismiss();

        // PROMPT ALERT
        driver.findElement(By.xpath("//input[@value='Prompt']")).click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        Thread.sleep(2000);
        promptAlert.sendKeys("Bla bla");
        Thread.sleep(2000);
        promptAlert.accept();



    }
}
