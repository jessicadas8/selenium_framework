package page;

import org.openqa.selenium.By;

public class HomePage extends Page {
    private final By username = By.cssSelector("#user-name");
    private final By password = By.cssSelector("#password");
    private final By loginBtn = By.cssSelector("#login-button");



    public void performLogin() {
        navigateTo(testConfigs.getUrl1());
        typeIntoTextField("standard_user", username);
        typeIntoTextField("secret_sauce", password);
        clickButton(loginBtn);
    }
}
