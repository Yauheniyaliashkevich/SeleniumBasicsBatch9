package review.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownReview {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        String url = "https://www.surveymonkey.com/r/?sm=uQNn3rYKMcVS0Dyy6GTjSw%3D%3D";
        driver.get(url);

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='211154525']"));
        Select select=new Select(dropdown);
        //by index
        select.selectByIndex(2);
        Thread.sleep(2000);
        //by value
        select.selectByValue("2657263886");
        Thread.sleep(2000);
        //By Visible Text
        select.selectByVisibleText("Answer Choice A");

        //loop through all the options that are available
        List<WebElement> allOptions = select.getOptions();
        int size = allOptions.size();
        System.out.println("the size of your list is: "+size);

        for (WebElement option: allOptions
             ) {
            System.out.println("The text of option is: "+option.getText());
        }


    }
}
