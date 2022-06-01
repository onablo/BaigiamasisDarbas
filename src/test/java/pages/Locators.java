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

        public static class OrderList {

            public static By headerGiftIdeasList = By.xpath("//*[@class='has-sub'][6]");

            public static By selectGiftCoupons = By.xpath("//*[@class='col-md-3'][1]");

            public static By selectGiftCoupons5 = By.xpath("(//*[@class='product-image'])[1]");

            public static By addToCart = By.xpath("//*[@class='fa fa-cart-plus']");

            public static By giftBuyingSelect = By.xpath("(//*[@class='btn btn-primary'])[2]");

            public static By totalCartPrice = By.xpath("//*[@class='total-cart-price']/span");

            public static By homePageCartPrice = By.xpath("//*[@class='amount']");
        }

        public static class Login {

            public static By loginElement = By.xpath("//*[@class='user-account']//*[text()='registruotis']");

            public static By userEmailInput = By.xpath("//*[@id='username']");

            public static By userPasswordInput = By.xpath("//*[@id='password']");

            public static By LoginButton = By.xpath("//*[@id='_submit']");

            public static By userLogout = By.xpath("//*[@class='user-account']//*[text()='Atsijungti']");
        }

            public static By agreeElement = By.xpath("//*[@class= 'btn btn-primary btn-sm acceptcookies']");

    }





}

