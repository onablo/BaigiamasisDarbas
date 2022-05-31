package tests.photoService;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Locators;
import tests.BaseTest;

import javax.print.attribute.IntegerSyntax;

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
        pages.photoService.ProductsSelection.enterValue(Integer.toString(selectedQuantity));
        pages.photoService.ProductsSelection.clickAddToOrderedProductList();
        String actualAddToOrderText = pages.photoService.ProductsSelection.readText();
        System.out.println(actualAddToOrderText);
        Assert.assertEquals(actualAddToOrderText, expectedAddToOrderText);

    }
}
