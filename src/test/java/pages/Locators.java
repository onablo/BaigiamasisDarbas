package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class PhotoService {

        public static class PhotoCategories {

            public static By menuDropdown = By.xpath("//*[@id='menu-button']");
            public static By photoCategoriesSubmenu = By.xpath("//*[@class='has-sub'][1]");
        }
    }
}

