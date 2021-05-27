package review.class05.POM.TestReview;

import review.class05.POM.PagesReview.LoginPageReviewPageFactory;
import review.class05.POM.PagesReview.MenuPageReviewPageFactory;
import review.class05.POM.TestBaseReview.BaseClassReview;

public class LoginTestReviewWithPageFactory {
    public static void main(String[] args) {
        BaseClassReview.setupWithSpecificURl("https://www.saucedemo.com/");
        LoginPageReviewPageFactory login = new LoginPageReviewPageFactory();
        login.userName.sendKeys("standard_user");
        login.password.sendKeys("secret_sauce");
        login.loginBtn.click();

        MenuPageReviewPageFactory menu = new MenuPageReviewPageFactory();
        menu.menuBtn.click();
        menu.logout.click();



    }
}
