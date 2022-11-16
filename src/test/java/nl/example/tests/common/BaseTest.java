package nl.example.tests.common;

import nl.example.util.Browser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    private final Browser browser = Browser.getInstance();

    @BeforeEach
    public void setup() {
        browser.startBrowser();
        browser.get("/");
    }

    @AfterEach
    public void teardown() {
        browser.quit();
    }

}
