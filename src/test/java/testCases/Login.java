package testCases;

import org.testng.annotations.Test;
import page.HomePage;
import page.Page;

public class Login extends Page {

    @Test
    public void validateHomePage() {
        HomePage hp = new HomePage();
        hp.performLogin();
    }
}

