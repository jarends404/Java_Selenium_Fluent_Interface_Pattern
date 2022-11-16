package nl.example.pages;

import nl.example.pages.common.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

public class RegistrationSuccessPage extends BasePage {

    private static final String HEADER_H1 = "h1[class='page-title my-3']";

    private static final String CONTINUE_BUTTON_TEXT = "Continue";

    public static RegistrationSuccessPage registrationSuccessPage() {
        return new RegistrationSuccessPage();
    }

    public RegistrationSuccessPage verifyRegistrationSuccesful() {
        Assertions.assertEquals("Your Account Has Been Created!", header().getText());
        return this;
    }

    public MyAccountPage continueToMyAccount() {
        continueButton().click();
        return new MyAccountPage();
    }

    private WebElement header() {
        return getBrowser().findElementByCSS(HEADER_H1);
    }

    private WebElement continueButton() {
        return getBrowser().findElementByLinkText(CONTINUE_BUTTON_TEXT);
    }

}
