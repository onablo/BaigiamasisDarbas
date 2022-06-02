package tests.photoService;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Login extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.photoService.OrderList.open();
    }

    @Test
    public void loginWithUserName() {

        String email = "milius@gmail.com";
        String password = "lendliz2";
        String expectedText = "Atsijungti";

        pages.photoService.Login.clickLoginInHomePage();
        pages.photoService.Login.fillEmailInput(email);
        pages.photoService.Login.fillPasswordInput(password);
        pages.photoService.Login.clickLoginButton();
        String actualText = pages.photoService.Login.readText();

        Assert.assertEquals(actualText, expectedText);
    }
}
