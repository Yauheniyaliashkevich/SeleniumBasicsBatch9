package review.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";
        driver.get(url);

        WebElement MulDropdown = driver.findElement(By.xpath("//select[@name='States']"));
        Select select=new Select(MulDropdown);
        boolean isMultiple =select.isMultiple();
        System.out.println("Is this dropdown multiple: "+isMultiple);

        //select California and Ohio
        select.selectByValue("California");
        select.selectByVisibleText("Ohio");

        Thread.sleep(2000);
        select.deselectByVisibleText("Ohio");
        Thread.sleep(2000);
        select.deselectAll();






    }
}
