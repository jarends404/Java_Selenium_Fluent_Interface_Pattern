package nl.example.pages;

import nl.example.pages.common.BasePage;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private static final String MY_ACCOUNT_LINK_TEXT = "My Account";
    private static final String REGISTER_LINK_TEXT = "Register";

    public static HomePage homePage() {
        return new HomePage();
    }

    public AccountRegistrationPage openAccountRegistrationPage() {
        openMyAccountMenu().register().click();
        return new AccountRegistrationPage();
    }

    private HomePage openMyAccountMenu() {
        getBrowser().findElementByLinkText(MY_ACCOUNT_LINK_TEXT).click();
        return this;
    }

    private WebElement register() {
        return getBrowser().findElementByLinkText(REGISTER_LINK_TEXT);
    }
}
