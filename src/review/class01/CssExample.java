package review.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        String url = "https://syntaxtechs.com/selenium-practice/basic-first-form-demo.php";
        driver.get(url);
        driver.findElement(By.cssSelector("input[id='user-message']")).sendKeys("jane");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        WebElement text = driver.findElement(By.cssSelector("span#display"));
        String name;
        name= text.getText();
        if(name.equalsIgnoreCase("jane")){
            System.out.println("you are successful");
        }else{
            System.out.println("you will win, don't worry");
        }
        driver.findElement(By.cssSelector("input[id*='m1']")).sendKeys("10");
        driver.findElement(By.cssSelector("input[id$='m2']")).sendKeys("5");
        driver.findElement(By.cssSelector("button[onclick^='return']")).click();
        WebElement value=driver.findElement(By.cssSelector("span[id*='value']"));
        if(value.getText().equalsIgnoreCase("15")){
            System.out.println("You are successful");
        }else{
            System.out.println("You will win");
        }



    }
}
