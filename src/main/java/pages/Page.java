package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {
    protected WebDriver driver;
    private WebDriverWait wait;

    public Page(final WebDriver driver) {
        if (driver == null)
            throw new IllegalArgumentException("The driver cannot be null. Please provide a valid reference.");

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public WebDriverWait getWait() {
        return wait;
    }

}
