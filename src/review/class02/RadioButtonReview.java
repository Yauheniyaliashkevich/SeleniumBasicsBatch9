package review.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RadioButtonReview {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        String url = "https://material-ui.com/components/radio-buttons/";
        driver.get(url);

        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='gender1']"));

        for (WebElement radioBtn: radioBtns
             ) {
            String value = radioBtn.getAttribute("value");
            if(value.equalsIgnoreCase("male")){
                radioBtn.click();
            }
            if(!radioBtn.isEnabled()){
                System.out.println("There is a disables radio button");
            }
        }






    }
}
