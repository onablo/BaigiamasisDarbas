package pages.photoService;

import pages.Common;
import pages.Locators;

public class Home {
    public static void open() {
        Common.openUrl("https://www.fotoservisas.lt");
    }

    public static void clickPhotoCategoriesSubmenu() {
        Common.clickElement(Locators.PhotoService.PhotoCategories.photoCategoriesSubmenu);
    }

    public static void clickMenu() {
        Common.clickElement(Locators.PhotoService.PhotoCategories.menuDropdown);
    }
}
