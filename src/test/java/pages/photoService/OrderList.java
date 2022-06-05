package pages.photoService;

import org.openqa.selenium.By;
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
        By locator = Locators.PhotoService.agreeElement;
        Common.waitForElementToBeVisible(locator);
        Common.clickElement(locator);
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
        By locator = Locators.PhotoService.OrderList.giftBuyingSelect;
        Common.waitForElementToBeVisible(locator);
        Common.clickElement(locator);
    }

    public static String getTextFromTotalCartPrice() {
        return Common.getElementText(Locators.PhotoService.OrderList.totalCartPrice);
    }

    public static String getTextFromHomePageCartPrice() {
        return Common.getElementText(Locators.PhotoService.OrderList.homePageCartPrice);
    }
}
