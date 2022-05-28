package tests.photoService;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Home extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.photoService.Home.open();
    }


    @Test
    public void getPhotoCategories() {

        //pages.photoService.Home.clickPhotoCategoriesSubmenu();
        String expectedPhotoCategoriesText = "NUOTRAUKOS INTERNETU";
        pages.photoService.PhotoCategories.clickPhotoCategoriesSubmenu();
        String actualText = pages.photoService.PhotoCategories.readText();
        Assert.assertEquals(actualText , "NUOTRAUKOS INTERNETU");
    }
}
