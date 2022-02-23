import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class POMTheRightWayTests {

    @Test
    public void search_UserProfile_InDevTo() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://dev.to");
        driver.findElement(By.name("q")).sendKeys("Christian Vasquez", Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(), \"People\")])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("article-link-3727"))).click();

        assert wait.until(ExpectedConditions.urlMatches("https://dev.to/chrisvasqm"));
        driver.quit();
    }

}
