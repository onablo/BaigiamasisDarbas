package pages.photoService;

import pages.Locators;
import pages.Common;

public class OrderList {


    public static void open() {
        Common.openUrl("https://www.fotoservisas.lt");
    }

    public static void clickOnGiftIdeas() {
        Common.clickElement(Locators.PhotoService.OrderList.headerGiftIdeasList);
    }

    public static void clickAgreeButtonAfterEnabled() {
        Common.waitForElementToBeVisible(Locators.PhotoService.agreeElement);
        Common.clickElement(Locators.PhotoService.agreeElement);
    }

    public static void selectGiftCoupons() {
        Common.clickElement(Locators.PhotoService.OrderList.selectGiftCoupons);
    }

    public static void clickOnSelectGiftCoupons5() {
        Common.clickElement(Locators.PhotoService.OrderList.selectGiftCoupons5);
    }

    public static void clickOnButtonAddToCart() {
        Common.clickElement(Locators.PhotoService.OrderList.addToCart);
    }

    public static void clickBuyButtonOnAppearPopup() {
        Common.waitForElementToBeVisible(Locators.PhotoService.OrderList.giftBuyingSelect);
        Common.clickElement(Locators.PhotoService.OrderList.giftBuyingSelect);
    }

    public static String getTextFromTotalCartPrice() {
        return Common.getElementText(Locators.PhotoService.OrderList.totalCartPrice);
    }

    public static String getTextFromHomePageCartPrice() {
        return Common.getElementText(Locators.PhotoService.OrderList.homePageCartPrice);
    }
}
