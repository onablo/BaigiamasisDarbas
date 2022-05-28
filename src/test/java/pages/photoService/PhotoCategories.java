package pages.photoService;

import pages.Common;
import pages.Locators;

public class PhotoCategories {

        public static void clickPhotoCategoriesSubmenu() {
            Common.clickElement(Locators.PhotoService.PhotoCategories.photoCategoriesSubmenu);
        }
    public static String readText() {
        return Common.getElementText(Locators.PhotoService.PhotoCategories.photoCategoriesSubmenu);
    }
}
