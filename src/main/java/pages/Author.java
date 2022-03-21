package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Author extends PageObject {

    public Author(WebDriver driver) {
        super(driver);
    }

    public boolean is(String who) {
        return wait.until(ExpectedConditions.urlMatches("https://dev.to/" + who));
    }
}
