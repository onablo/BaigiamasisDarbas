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
            public static By photoProducts = By.xpath("//*[@class='has-sub'][2]");
            public static By souvenirFrames = By.xpath("//*[@class='card-title' and text()='Suvenyriniai rėmeliai']");
            public static By selectedFrame = By.xpath("//*[@class='col-md-3'][6]");
            public static By selectedQuantity = By.xpath("//*[@id='product_order_item_quantity']");
            public static By productAdditionToOrderList = By.xpath("//*[@class='btn btn-primary btn-lg btn-add-to-cart ']");
            public static By productIsAddedToOrderList = By.xpath("//*[@id='addedToCartModal']//*[text()='Prekė įtraukta į krepšelį']");
        }
        public static By agreeElement = By.xpath("//*[@class= 'btn btn-primary btn-sm acceptcookies']");
    }
}
//*[@id="addedToCartModal"]/div/div/div[2]/h2
