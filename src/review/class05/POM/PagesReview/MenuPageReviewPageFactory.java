package review.class05.POM.PagesReview;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import review.class05.POM.TestBaseReview.BaseClassReview;

public class MenuPageReviewPageFactory extends BaseClassReview {

    @FindBy (id="react-burger-menu-btn")
    public WebElement menuBtn;

    @FindBy (id="logout_sidebar_link")
    public WebElement logout;

    public MenuPageReviewPageFactory(){
        PageFactory.initElements(driver,this);
    }

}
