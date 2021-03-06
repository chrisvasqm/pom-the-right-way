package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Search extends Page {
    private WebElement peopleFilter;
    private WebElement authorLink;

    public Search(WebDriver driver) {
        super(driver);
    }

    public Author selectAuthor() {
        peopleFilter = getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(), \"People\")])[2]")));
        peopleFilter.click();

        authorLink = getWait().until(ExpectedConditions.elementToBeClickable(By.id("article-link-3727")));
        authorLink.click();
        return new Author(driver);
    }

}
