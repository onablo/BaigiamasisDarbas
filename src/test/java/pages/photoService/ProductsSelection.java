package pages.photoService;

import pages.Common;
import pages.Locators;

public class ProductsSelection {

    public static void open() {
        Common.openUrl("https://www.fotoservisas.lt");
    }

    public static void clickPhotoProducts() {
        Common.clickElement(Locators.PhotoService.ProductsSelection.photoProducts);
    }

    public static void clickAgreeButtonAfterEnabled() {
        Common.waitForElementToBeVisible(Locators.PhotoService.agreeElement);
        Common.clickElement(Locators.PhotoService.agreeElement);
    }

       public static void clickSouvenirFrames() {
        Common.clickElement(Locators.PhotoService.ProductsSelection.souvenirFrames);
    }

    public static void clickOnSelectFrameFromProducts() {
        Common.clickElement(Locators.PhotoService.ProductsSelection.selectedFrame);
    }

    public static void enterQuantityValue(String value) {
        Common.sendKeysToElement(Locators.PhotoService.ProductsSelection.selectedQuantity, value);
    }

    public static void clickAddToCart() {
        Common.clickElement(Locators.PhotoService.ProductsSelection.productAdditionToCart);
    }

    public static String readText() {
        return Common.getElementText(Locators.PhotoService.ProductsSelection.productIsAddedToCart);
    }



    public static void clickBuyButtonOnAppearPopup() {
        Common.waitForElementToBeVisible(Locators.PhotoService.ProductsSelection.giftBuyingSelect);
        Common.clickElement(Locators.PhotoService.ProductsSelection.giftBuyingSelect);
    }

    public static void clickOnCartSubmitButton() {
        Common.clickElement(Locators.PhotoService.ProductsSelection.cartSubmitButton);
    }

    public static void clickContinueWithoutRegistration() {
        Common.clickElement(Locators.PhotoService.ProductsSelection.continueWithoutRegistration);
    }

    public static void sendKeysToNameInput(String name) {
        Common.sendKeysToElement(Locators.PhotoService.ProductsSelection.nameInputField, name);
    }

    public static void sendKeysToLastnameInput(String lastname) {
        Common.sendKeysToElement(Locators.PhotoService.ProductsSelection.lastnameInputField, lastname);
    }

    public static void sendKeysToEmailInput(String email) {
        Common.sendKeysToElement(Locators.PhotoService.ProductsSelection.emailInputField, email);
    }

    public static void sendKeysToPhoneInput(String phone) {
        Common.sendKeysToElement(Locators.PhotoService.ProductsSelection.phoneInputField, phone);
    }

    public static void clickFreeDelivery() {
        Common.clickElement(Locators.PhotoService.ProductsSelection.freeDeliverySelect);
    }

    public static void clickFreeAddressDelivery() {
        Common.clickElement(Locators.PhotoService.ProductsSelection.freeDeliveryAddressSelect);
    }

    public static void clickContinue() {
        Common.waitForElementToBeClickable(Locators.PhotoService.ProductsSelection.continueButton);
        Common.clickElement(Locators.PhotoService.ProductsSelection.continueButton);
    }

    public static String readCartText() {
        return Common.getElementText(Locators.PhotoService.ProductsSelection.cartWithChoiseOfPayment);
    }
}
