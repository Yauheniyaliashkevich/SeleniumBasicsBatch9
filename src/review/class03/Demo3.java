package review.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "http://the-internet.herokuapp.com/dynamic_loading/1";
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver,20);

        driver.findElement(By.xpath("//button[text()='Start']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Hello')]")));
        WebElement textIs = driver.findElement(By.xpath("//*[contains(text(),'Hello')]"));
        String text =textIs.getText();
        System.out.println(text);



    }
}
