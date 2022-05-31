package tests.photoService;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Locators;
import tests.BaseTest;

public class PhotoCategories extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.photoService.PhotoCategories.open();
    }
    @Test
    public void getPhotoCategories() {

        String expectedSelectedPhotoCategoriesText = "Premium kokybės 10x15 cm - 0,19 €/vnt.\n" +
                "Nuotrauka spausdinama naudojant tik aukščiausios kokybės profesionalias fotomedžiagas: " +
                "FUJI DPII fotopopierių, Kodak Pro chemija, taip užtikrinant nuotraukos ilgaamžiškumą.\n" +
                "Yra galimybė pasirinkti skubų užsakymą";
        pages.photoService.PhotoCategories.clickPhotoCategoriesSubmenu();
        pages.photoService.PhotoCategories.clickAgreeButtonAfterEnabled();
        pages.photoService.PhotoCategories.selectFormatFromPhotoProduction();
        String actualText = pages.photoService.PhotoCategories.readText();
        //System.out.println(actualText);
        Assert.assertEquals(actualText , expectedSelectedPhotoCategoriesText);
    }
}