package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.id("small-searchterms");
    By searchBtn = By.xpath("//button[@type='submit']");
    By product = By.linkText("Apple MacBook Pro 13-inch");

    public void searchProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchBtn).click();
        driver.findElement(product).click();
    }
}
