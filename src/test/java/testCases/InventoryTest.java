package testCases;

import com.aventstack.extentreports.Status;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.InventoryPage;
import page.Page;

import java.util.List;

import static org.seleniumFramework.ExtentReport.*;

public class InventoryTest extends Page {
    InventoryPage inventoryPage = new InventoryPage();
    @Test
    public void addItemsInCart() {
        extentTest = extentReports.createTest("Add items in a cart","Add the items in the cart");
        try {
            inventoryPage.addItemsToCart(List.of("backpack", "bikeLight"));
            extentTest.log(Status.PASS, "PASSED");
        } catch (Exception e) {
            extentTest.log(Status.FAIL, e);
            throw e;
        }
    }

    @Test
    public void verifyCartBtn(){
        extentTest=extentReports.createTest("Click on Add to Cart button");
        try {
            clickButton(InventoryPage.addToCartBtn);
            extentTest.log(Status.PASS, "PASSED");
        } catch (Exception e) {
            extentTest.log(Status.FAIL, e);
            throw e;
        }
    }
}
