package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AuthorPage extends Page {

    public AuthorPage(WebDriver driver) {
        super(driver);
    }

    public boolean is(String who) {
        return getWait().until(ExpectedConditions.urlMatches("https://dev.to/" + who));
    }
}
