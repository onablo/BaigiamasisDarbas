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
    public static void enterValue(String value) {
        Common.sendKeysToElement(Locators.PhotoService.ProductsSelection.selectedQuantity, value);
    }
    public static void clickAddToOrderedProductList() {
        Common.clickElement(Locators.PhotoService.ProductsSelection.productAdditionToOrderList);
    }
    public static String readText() {
        return Common.getElementText(Locators.PhotoService.ProductsSelection.productIsAddedToOrderList);
    }
}
