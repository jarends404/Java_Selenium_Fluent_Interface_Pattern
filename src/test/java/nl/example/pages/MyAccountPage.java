package nl.example.pages;

import nl.example.pages.common.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends BasePage {

    private static final String HEADER_H2 = "h2[class='card-header h5']";

    public static MyAccountPage myAccountPage() {
        return new MyAccountPage();
    }

    public MyAccountPage verifyHeader() {
        Assertions.assertEquals("My Account", header().getText());
        return this;
    }

    private WebElement header() {
        return getBrowser().findElementByCSS(HEADER_H2);
    }
}
