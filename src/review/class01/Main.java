package review.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        String url = "http://saucedemo.com";
        driver.get(url);
        //enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("inventory_item_name")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(2000);
        WebElement menu =driver.findElement(By.id("react-burger-menu-btn"));
        menu.click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("ABOUT")).click();
        Thread.sleep(5000);
        String title=driver.getTitle();
        if(title.equalsIgnoreCase("Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs")){
            System.out.println("Booom it is the correct one");
        }else{
            System.out.println("you have failed this city");
        }
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("checkout")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("react-burger-menu-btn"));
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("LOG")).click();



    }
}
