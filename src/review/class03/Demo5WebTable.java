package review.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Demo5WebTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";
        driver.get(url);

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println("Size of rows "+rows.size());

        for (WebElement row: rows
             ) {
            System.out.println(row.getText());
        }

        List <WebElement>headerRow = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));

        for (WebElement header: headerRow
             ) {
            System.out.println(header.getText());
        }







    }
}
