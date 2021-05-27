package review.class05.POM.PagesReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import review.class05.POM.TestBaseReview.BaseClassReview;

public class LoginPageReview extends BaseClassReview {
    public WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
    public WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
    public WebElement loginBtn= driver.findElement(By.xpath("//input[@id='login-button']"));
}
