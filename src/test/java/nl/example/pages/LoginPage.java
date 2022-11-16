package nl.example.pages;

import nl.example.pages.common.BasePage;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private static final String REGISTER_LINK_TEXT = "Continue";

    public static LoginPage loginPage() {
        return new LoginPage();
    }

    public AccountRegistrationPage openAccountRegistrationPage() {
        registerButton().click();
        return new AccountRegistrationPage();
    }
    
    private WebElement registerButton() {
        return getBrowser().findElementByLinkText(REGISTER_LINK_TEXT);
    }
}
