package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Home extends Page {
    private WebElement searchBar;

    public Home(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://dev.to/");
    }

    public Search searchFor(String query) {
        searchBar = getWait().until(ExpectedConditions.elementToBeClickable(By.name("q")));
        searchBar.sendKeys(query, Keys.ENTER);
        return new Search(driver);
    }
}
