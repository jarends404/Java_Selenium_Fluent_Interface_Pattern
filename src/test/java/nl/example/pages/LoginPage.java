package nl.example.pages;

import nl.example.pages.common.BasePage;

public class LoginPage extends BasePage {

    private static final String REGISTER_LINK_TEXT = "Continue";

    public static LoginPage loginPage() {
        return new LoginPage();
    }

    public AccountRegistrationPage openAccountRegistrationPage() {
        getBrowser().findElementByLinkText(REGISTER_LINK_TEXT).click();
        return new AccountRegistrationPage();
    }
}
