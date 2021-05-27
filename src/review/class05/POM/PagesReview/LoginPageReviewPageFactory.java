package review.class05.POM.PagesReview;

import com.testbase.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import review.class05.POM.TestBaseReview.BaseClassReview;

public class LoginPageReviewPageFactory extends BaseClassReview {


    @FindBy(xpath ="//input[@id='user-name']" )
    public WebElement userName;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement loginBtn;

    public LoginPageReviewPageFactory(){
        PageFactory.initElements(driver,this);
    }

}
