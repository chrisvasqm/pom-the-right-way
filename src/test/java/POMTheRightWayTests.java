import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.AuthorPage;
import pages.HomePage;
import pages.SearchPage;

public class POMTheRightWayTests {

    @Test
    public void search_UserProfile_InDevTo() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        HomePage homePage = new HomePage(driver);
        homePage.open("https://dev.to");
        homePage.getSearchBar().sendKeys("Christian Vasquez", Keys.ENTER);

        SearchPage searchPage = new SearchPage(driver);
        searchPage.getPeopleFilter().click();
        searchPage.getAuthorLink().click();

        AuthorPage authorPage = new AuthorPage(driver);
        assert authorPage.is("chrisvasqm");
        driver.quit();
    }

}
