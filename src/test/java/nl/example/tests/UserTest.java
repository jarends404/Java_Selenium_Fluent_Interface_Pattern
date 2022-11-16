package nl.example.tests;

import nl.example.tests.common.BaseTest;
import org.junit.jupiter.api.Test;

import static nl.example.pages.HomePage.homePage;

public class UserTest extends BaseTest {

    @Test
    public void testRegisterUser() {
        homePage().openLoginPage()
                .openAccountRegistrationPage()
                .verifyHeader()
                .registerUser()
                .verifyRegistrationSuccesful()
                .continueToMyAccount()
                .verifyHeader();
    }

}
