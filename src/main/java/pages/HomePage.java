package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Page {
    private WebElement searchBar;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchBar() {
        searchBar = getWait().until(ExpectedConditions.elementToBeClickable(By.name("q")));
        return searchBar;
    }
}
