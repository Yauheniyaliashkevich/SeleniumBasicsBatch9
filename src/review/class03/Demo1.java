package review.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //String url = "https://smartbear.com/blog/how-to-handle-multiple-tabs-in-selenium-webdriver/";
        String url="https://swagger.io/tools/swaggerhub/";
        driver.get(url);
        //get the handle
        String homePageHandle = driver.getWindowHandle();
        System.out.println("The handle for home page is "+homePageHandle);
        WebElement link1 = driver.findElement(By.xpath("//a[@href='https://bitbar.com/?utm_medium=referral&utm_source=swagger.io&utm_campaign=footer']"));
        link1.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //click on some icon on the new tab
        Set<String > allHandles = driver.getWindowHandles();
        Iterator<String> it= allHandles.iterator();
        homePageHandle=it.next();
        String link1Handle=it.next();
        System.out.println(link1Handle);

        //switch to the child tab and click on some new link
        driver.switchTo().window(link1Handle);

        WebElement link2 = driver.findElement(By.xpath("//a[@href='https://www.youtube.com/user/BitbarChannel/']"));
        link2.click();

        //get the link2 window handle
        allHandles = driver.getWindowHandles();
        it= allHandles.iterator();

        int handle_no = 2;
        String value =null;
        String link2handle=null;
        for (int i = 0; it.hasNext(); i++) {
            value=it.next();
            if(i==handle_no){
                link2handle=value;
                System.out.println("This is the handle for link 2 : "+link2handle);
                break;
            }

        }
        Thread.sleep(3000);
        driver.switchTo().window(homePageHandle);
        Thread.sleep(3000);
        driver.switchTo().window(link1Handle);
        Thread.sleep(3000);
        driver.switchTo().window(link2handle);

        driver.close();







    }
}
