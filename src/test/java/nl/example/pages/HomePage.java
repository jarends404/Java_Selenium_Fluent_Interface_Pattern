package nl.example.pages;

import nl.example.pages.common.BasePage;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private static final String MY_ACCOUNT_SPAN = "span[class='title']";

    private static final String MY_ACCOUNT_TEXT = "My account";

    public static HomePage homePage() {
        return new HomePage();
    }

    public LoginPage openLoginPage() {
        myAccount().click();
        return new LoginPage();
    }

    private WebElement myAccount() {
        return getBrowser().findElementByText(MY_ACCOUNT_SPAN, MY_ACCOUNT_TEXT);
    }
}
