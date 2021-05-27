package review.class05.POM.PagesReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import review.class05.POM.TestBaseReview.BaseClassReview;

public class MenuPageReview extends BaseClassReview {

    public WebElement addBag = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));

}
