package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCart = By.id("add-to-cart-button-4");
    By cartQty = By.className("cart-qty");

    public void addToCart() {
        driver.findElement(addToCart).click();
    }

    public boolean isProductAdded() {
        return driver.findElement(cartQty).getText().contains("1");
    }
}
