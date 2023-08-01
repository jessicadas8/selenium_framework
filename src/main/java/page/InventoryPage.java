package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InventoryPage extends Page {
    public static final By backpackAddToCart = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    public static final By bikeLightAddToCart = By.cssSelector("#add-to-cart-sauce-labs-bike-light");
    public static final By fleeceAddToCart = By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket");
    public static final By addToCartBtn=By.cssSelector("#shopping_cart_container > a");

    //Todo: This should accept list

    public void addItemsToCart(List<String> items) {

        for (String item : items) {
            switch (item) {
                case "backpack":
                    clickButton(backpackAddToCart);
                    break;

                case "bikeLight":
                    clickButton(bikeLightAddToCart);
                    break;

                case "fleece":
                    clickButton(fleeceAddToCart);
                    break;

                default:
                    System.out.println("Item not found!!");
            }
        }
    }
}

