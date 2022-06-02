package pages;

import org.openqa.selenium.By;

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
            public static By productAdditionToCart = By.xpath("//*[@class='btn btn-primary btn-lg btn-add-to-cart ']");
            public static By productIsAddedToCart = By.xpath("//*[@id='addedToCartModal']//*[text()='Prekė įtraukta į krepšelį']");
            public static By giftBuyingSelect = By.xpath("(//*[@class='btn btn-primary'])[3]");
            public static By cartSubmitButton = By.xpath("//*[@class='continue-btn btn btn-success btn-lg']");
            public static By continueWithoutRegistration = By.xpath("//*[@class='no-registration']");
            public static By nameInputField = By.xpath("//*[@id='order_details_contactInfo_firstName']");
            public static By lastnameInputField = By.xpath("//*[@id='order_details_contactInfo_lastName']");
            public static By emailInputField = By.xpath("//*[@id='order_details_contactInfo_email']");
            public static By phoneInputField = By.xpath("//*[@id='order_details_contactInfo_phoneNumber']");
            public static By freeDeliverySelect = By.xpath("//*[@value='5abcfd834dfc2930a70647ac']");
            public static By freeDeliveryAddressSelect = By.xpath("(//*[@class='s-image'])[1]");
            public static By continueButton = By.xpath("//*[@class='continue-btn btn btn-success btn-lg']");
            public static By cartWithChoiseOfPayment = By.xpath("//*[@class='main']//*[text()='Pasirinkite mokėjimo būdą']");
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
            public static By loginButton = By.xpath("//*[@id='_submit']");
            public static By userLogout = By.xpath("//*[@class='user-account']//*[text()='Atsijungti']");
        }

        public static By agreeElement = By.xpath("//*[@class= 'btn btn-primary btn-sm acceptcookies']");
    }
}
