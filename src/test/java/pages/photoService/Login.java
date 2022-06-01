package pages.photoService;

import pages.Common;
import pages.Locators;

public class Login {
    public static void clickLoginInHomePage() {
        Common.clickElement(Locators.PhotoService.Login.loginElement);
    }

    public static void fillEmailInput(String email) {
        Common.sendKeysToElement(Locators.PhotoService.Login.userEmailInput, email);
    }

    public static void fillPasswordInput(String password) {
        Common.sendKeysToElement(Locators.PhotoService.Login.userPasswordInput, password);
    }

    public static void ClickLoginButton() {
        Common.clickElement(Locators.PhotoService.Login.LoginButton);
    }

    public static String readText() {
        return Common.getElementText(Locators.PhotoService.Login.userLogout);
    }
}
