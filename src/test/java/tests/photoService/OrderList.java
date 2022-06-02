package tests.photoService;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class OrderList  extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.photoService.OrderList.open();
    }

    @Test
    public void checkPriceInCartAndSelectedCouponPrice() {

        pages.photoService.OrderList.clickOnGiftIdeas();
        pages.photoService.OrderList.clickAgreeButtonAfterEnabled();
        pages.photoService.OrderList.selectGiftCoupons();
        pages.photoService.OrderList.clickOnSelectGiftCoupons5();
        pages.photoService.OrderList.clickOnButtonAddToCart();
        pages.photoService.OrderList.clickBuyButtonOnAppearPopup();
        String actualText = pages.photoService.OrderList.getTextFromTotalCartPrice();
        String expectedText = pages.photoService.OrderList.getTextFromHomePageCartPrice();
        String expectedPrice = expectedText + " €";

        //System.out.println(actualText);               - patikrinimai
        //System.out.println(expectedText + " €");

        Assert.assertEquals(actualText, expectedPrice);
    }
}
