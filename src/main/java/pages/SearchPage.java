package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends Page {
    private WebElement peopleFilter;
    private WebElement authorLink;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPeopleFilter() {
        peopleFilter = getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(), \"People\")])[2]")));
        return peopleFilter;
    }

    public WebElement getAuthorLink() {
        authorLink = getWait().until(ExpectedConditions.elementToBeClickable(By.id("article-link-3727")));
        return authorLink;
    }
}
