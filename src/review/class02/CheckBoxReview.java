package review.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxReview {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        String url = "https://www.ironspider.ca/forms/checkradio.htm";
        driver.get(url);

        WebElement redCheckBox = driver.findElement(By.xpath("//input[@type = 'checkbox'][@value='red']"));
        boolean redCheckBoxIsEnabled = redCheckBox.isEnabled();
        System.out.println("The check box is Enabled: "+redCheckBoxIsEnabled);
        boolean redCheckBoxIsSelected = redCheckBox.isSelected();
        System.out.println("The check box is Selected: "+redCheckBoxIsSelected);

        Thread.sleep(2000);
        redCheckBox.click(); //enabling the check
        Thread.sleep(2000);

        redCheckBoxIsSelected = redCheckBox.isSelected(); // getting weather it is selected or not
        System.out.println("The check box is Selected: "+redCheckBoxIsSelected); //printing out the status

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
        System.out.println("Number of checkBoxes "+checkBoxes.size());

        //select yellow, orange and purple

        for (WebElement checkBox: checkBoxes
             ) {

            //if(checkBox.getText().equalsIgnoreCase("Yellow")){} // don't work because is no text in input, it's lower in <br>
            String  checkBoxValue = checkBox.getAttribute("value");
            System.out.println(checkBoxValue);
            if(checkBoxValue.equalsIgnoreCase("Yellow")){
                checkBox.click();
                break;
            }
            //Thread.sleep(2000);
            if(checkBoxValue.equalsIgnoreCase("Orange")){
                checkBox.click();
            }
            //Thread.sleep(2000);
            if(checkBoxValue.equalsIgnoreCase("Purple")){
                checkBox.click();
            }
        }

    }
}
