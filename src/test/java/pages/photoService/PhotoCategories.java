package pages.photoService;

import pages.Common;
import pages.Locators;

public class PhotoCategories {

    public static void open() {
        Common.openUrl("https://www.fotoservisas.lt");
    }
    public static void clickPhotoCategoriesSubmenu() {
        Common.clickElement(Locators.PhotoService.PhotoCategories.photoCategoriesSubmenu);
    }
    public static void clickAgreeButtonAfterEnabled() {
        Common.waitForElementToBeVisible(Locators.PhotoService.agreeElement);
        Common.clickElement(Locators.PhotoService.agreeElement);
    }
    public static void selectFormatFromPhotoProduction() {
        Common.clickElement(Locators.PhotoService.PhotoCategories.photoSelectFormat);
    }
    public static String readText() {
        return Common.getElementText(Locators.PhotoService.PhotoCategories.photoSelectedFormat);
    }
}
