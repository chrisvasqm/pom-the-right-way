package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Author extends Page {

    public Author(WebDriver driver) {
        super(driver);
    }

    public boolean is(String who) {
        return getWait().until(ExpectedConditions.urlMatches("https://dev.to/" + who));
    }
}
