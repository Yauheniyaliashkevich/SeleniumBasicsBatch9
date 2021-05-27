package review.class05.POM.TestReview;

import com.testbase.BaseClass;
import review.class05.POM.PagesReview.LoginPageReview;
import review.class05.POM.PagesReview.MenuPageReview;
import review.class05.POM.TestBaseReview.BaseClassReview;

public class LoginTestReview {
    public static void main(String[] args) {

        BaseClassReview.setupWithSpecificURl("https://www.saucedemo.com/");
        LoginPageReview login = new LoginPageReview();
        login.userName.sendKeys("standard_user");
        login.password.sendKeys("secret_sauce");
        login.loginBtn.click();
        MenuPageReview menu= new MenuPageReview();
        menu.addBag.click();
    }
}
