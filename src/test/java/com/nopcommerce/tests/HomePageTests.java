package com.nopcommerce.tests;

import com.nopcommerce.pages.HomePageComponents;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest{
    HomePageComponents homePage;

    @Test
    public void T040_verifyWTOSText()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.WTOSisDisplayed(), "Welcome to our store");
    }

    @Test
    public void T041_verifyWTOSDescription()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertTrue(homePage.WTOSDescriptionisDisplayed(),"Description is not displayed");
    }

    @Test
    public void T042_goToDocumentation()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.clickDocumentation(),"nopCommerce Documentation");
    }

    @Test
    public void T043_goToForum()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.clickForum(), "Forums - nopCommerce");
    }

    @Test
    public void T044_goToNopCommerce()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.clickNopcommerce(),
                "Free and open-source eCommerce platform. ASP.NET Core based shopping cart. - nopCommerce");
    }

    @Test
    public void T045_verifyElectronicsText()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.electronicsTextIsDisplayed(), "Electronics");
    }

    @Test
    public void T046_verifyElectronicsTextLink()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.clickElectronicsText(), "nopCommerce demo store. Electronics");
    }

    @Test
    public void T047_verifyElectronicsImage()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertTrue(homePage.electronicsImageIsDisplayed(), "image is not displayed");
    }

    @Test
    public void T048_verifyElectronicsImageLink()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.clickElectronicsImage(), "nopCommerce demo store. Electronics");
    }

    @Test
    public void T049_verifyApparelText()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.apparelTextIsDisplayed(), "Apparel");
    }

    @Test
    public void T050_verifyApparelTextLink()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.clickApparelText(), "nopCommerce demo store. Apparel");
    }

    @Test
    public void T051_verifyApparelImage()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertTrue(homePage.apparelImageIsVisible(), "image is not displayed");
    }

    @Test
    public void T052_verifyApparelImageLink()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.clickApparelImage(), "nopCommerce demo store. Apparel");
    }

    @Test
    public void T053_verifyDigitalDownloadsText()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.digitalDownloadsTextIsDisplayed(), "Digital downloads");
    }

    @Test
    public void T054_verifyDigitalDownloadsTextLink()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.clickDigitalDownloadsText(), "nopCommerce demo store. Digital downloads");
    }

    @Test
    public void T055_verifyDigitalDownloadsImage()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertTrue(homePage.digitalDownloadsImageIsVisible(), "image is not displayed");
    }

    @Test
    public void T056_verifyDigitalDownloadsImageLink()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.clickDigitalDownloadsImage(), "nopCommerce demo store. Digital downloads");
    }

}
