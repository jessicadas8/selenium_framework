package testCases;

import org.testng.annotations.Test;
import page.HomePage;
import page.Page;

public class LoginTest extends Page {

    @Test(description="Login with valid credentials")
    public void validateHomePage() {
        HomePage hp = new HomePage();
        hp.performLogin();
    }
}

