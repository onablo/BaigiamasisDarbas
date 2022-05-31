package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators {

    public static class PhotoService {

        public static class PhotoCategories {
            public static By photoCategoriesSubmenu = By.xpath("//*[@class='has-sub'][1]");
            public static By photoSelectFormat = By.xpath("//*[@class='col-md-3'][1]");
            public static By photoSelectedFormat = By.xpath("//*[@class= 'col-md-8']");

        }

        public static class ProductsSelection {
            public static By photoProducts = By.xpath("//a[@href='/products/']");
            public static By souvenirFrames = By.xpath("//*[@class='col-md-4'][2]");
            public static By selectedFrame = By.xpath("//*[@class='col-md-3'][6]");

            public static By agreeElement = By.xpath("//*[@class= 'btn btn-primary btn-sm acceptcookies']");

        }
    }
}

