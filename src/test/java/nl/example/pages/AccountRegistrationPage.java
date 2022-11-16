package nl.example.pages;

import nl.example.pages.common.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

public class AccountRegistrationPage extends BasePage {

    private static final String FORM_HEADER_H1 = "h1[class='page-title h3']";
    private static final String FIRST_NAME_INPUT = "input[id='input-firstname']";
    private static final String LAST_NAME_INPUT = "input[id='input-lastname']";
    private static final String EMAIL_INPUT = "input[id='input-email']";
    private static final String TELEPHONE_INPUT = "input[id='input-telephone']";
    private static final String PASSWORD_INPUT = "input[id='input-password']";
    private static final String CONFIRM_PASSWORD_INPUT = "input[id='input-confirm']";
    private static final String NEWSLETTER_LABEL = "label[for='input-newsletter-%s']";
    private static final String PRIVACY_POLICY_LABEL = "label[for='input-agree']";
    private static final String CONTINUE_BUTTON = "input[value='Continue']";

    public static AccountRegistrationPage accountRegistrationPage() {
        return new AccountRegistrationPage();
    }

    public AccountRegistrationPage verifyHeader() {
        Assertions.assertEquals("Register Account", formHeader().getText());
        return this;
    }

    public RegistrationSuccessPage registerUser() {
        firstNameField().sendKeys(getUser().getFirstName());
        lastNameField().sendKeys(getUser().getLastName());
        emailField().sendKeys(getUser().getEmail());
        telephoneField().sendKeys(getUser().getTelephone());
        passwordField().sendKeys(getUser().getPassword());
        confirmPasswordField().sendKeys(getUser().getPassword());
        subscribeNewsletter();
        agreeWithPrivacyPolicy();
        continueButton().click();
        return new RegistrationSuccessPage();
    }

    private WebElement formHeader() {
        return getBrowser().findElementByCSS(FORM_HEADER_H1);
    }

    private WebElement firstNameField() {
        return getBrowser().findElementByCSS(FIRST_NAME_INPUT);
    }

    private WebElement lastNameField() {
        return getBrowser().findElementByCSS(LAST_NAME_INPUT);
    }

    private WebElement emailField() {
        return getBrowser().findElementByCSS(EMAIL_INPUT);
    }

    private WebElement telephoneField() {
        return getBrowser().findElementByCSS(TELEPHONE_INPUT);
    }

    private WebElement passwordField() {
        return getBrowser().findElementByCSS(PASSWORD_INPUT);
    }

    private WebElement confirmPasswordField() {
        return getBrowser().findElementByCSS(CONFIRM_PASSWORD_INPUT);
    }

    private void subscribeNewsletter() {
        getBrowser().findElementByCSS(String.format(NEWSLETTER_LABEL, "yes")).click();
    }

    private void agreeWithPrivacyPolicy() {
        getBrowser().findElementByCSS(PRIVACY_POLICY_LABEL).click();
    }

    private WebElement continueButton() {
        return getBrowser().findElementByCSS(CONTINUE_BUTTON);
    }
}
