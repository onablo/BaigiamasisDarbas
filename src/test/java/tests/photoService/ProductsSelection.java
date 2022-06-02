package tests.photoService;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;


public class ProductsSelection extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.photoService.ProductsSelection.open();
    }

    @Test
    public void getProductSelection() {

        int selectedQuantity =2;
        String expectedAddToOrderText = "Prekė įtraukta į krepšelį";

        pages.photoService.ProductsSelection.clickPhotoProducts();
        pages.photoService.ProductsSelection.clickAgreeButtonAfterEnabled();
        pages.photoService.ProductsSelection.clickSouvenirFrames();
        pages.photoService.ProductsSelection.clickOnSelectFrameFromProducts();
        pages.photoService.ProductsSelection.enterQuantityValue(Integer.toString(selectedQuantity));
        pages.photoService.ProductsSelection.clickAddToCart();
        String actualAddToOrderText = pages.photoService.ProductsSelection.readText();

        //System.out.println(actualAddToOrderText);     - patikrinimas

        Assert.assertEquals(actualAddToOrderText, expectedAddToOrderText);
    }

    @Test
    public void purchaseWithoutRegistration() {
        int selectedQuantity =2;
        String name = "Domas";
        String lastname = "Krosas";
        String email = "domas@gmail.com";
        String phone = "+37067707007";
        String expectedSelectPaymentText = "Pasirinkite mokėjimo būdą";

        pages.photoService.ProductsSelection.clickPhotoProducts();
        pages.photoService.ProductsSelection.clickAgreeButtonAfterEnabled();
        pages.photoService.ProductsSelection.clickSouvenirFrames();
        pages.photoService.ProductsSelection.clickOnSelectFrameFromProducts();
        pages.photoService.ProductsSelection.enterQuantityValue(Integer.toString(selectedQuantity));
        pages.photoService.ProductsSelection.clickAddToCart();
        pages.photoService.ProductsSelection.clickBuyButtonOnAppearPopup();
        pages.photoService.ProductsSelection.clickOnCartSubmitButton();
        pages.photoService.ProductsSelection.clickContinueWithoutRegistration();
        pages.photoService.ProductsSelection.sendKeysToNameInput(name);
        pages.photoService.ProductsSelection.sendKeysToLastnameInput(lastname);
        pages.photoService.ProductsSelection.sendKeysToEmailInput(email);
        pages.photoService.ProductsSelection.sendKeysToPhoneInput(phone);
        pages.photoService.ProductsSelection.clickFreeDelivery();
        pages.photoService.ProductsSelection.clickFreeAddressDelivery();
        pages.photoService.ProductsSelection.clickContinue();
        String actualSelectPaymentText = pages.photoService.ProductsSelection.readCartText();

        //System.out.println(actualSelectPaymentText);      - patikrinimas
        Assert.assertEquals(actualSelectPaymentText, expectedSelectPaymentText);
    }
}
