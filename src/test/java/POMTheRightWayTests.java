import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Author;
import pages.Home;
import pages.Search;

public class POMTheRightWayTests {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void search_UserProfile_InDevTo() {
        Home home = new Home(driver);

        home.open();
        Search search = home.searchFor("Christian Vasquez");
        Author author = search.selectAuthor();

        assert author.is("chrisvasqm");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
