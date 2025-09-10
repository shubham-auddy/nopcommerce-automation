package com.nopcommerce.tests;

import com.nopcommerce.pages.HomePageComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        Assert.assertTrue(homePage.WTOSDescriptionIsDisplayed(),"Description is not displayed");
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

    @Test
    public void T012_verifyBYOCText()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.BYOCTextIsVisible(), "Build your own computer");
    }

    @Test
    public void T013_verifyBYOCLink()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.clickBYOC(), "nopCommerce demo store. Build your own computer");
    }

    @Test
    public void T014_verifyBYOCAddToCart()
    {
        homePage = new HomePageComponents(driver);
        homePage.clickBYOCAddToCart();
        WebElement email = driver.findElement(By.cssSelector(".email-a-friend-button"));
        Assert.assertTrue(email.isDisplayed());
    }

    @Test
    public void T015_verifyBYOCAddToCompare()
    {
        homePage = new HomePageComponents(driver);
        homePage.clickBYOCAddToCompareBtn();
        WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bar-notification")));
        Assert.assertTrue(popUp.getText().contains("product comparison"));
        wait.until(ExpectedConditions.invisibilityOf(popUp));
    }

    @Test
    public void T016_verifyBYOCAddToWishlist()
    {
        homePage = new HomePageComponents(driver);
        homePage.clickBYOCAddToWishList();
        WebElement email = driver.findElement(By.cssSelector(".email-a-friend-button"));
        Assert.assertTrue(email.isDisplayed());
    }

    @Test
    public void T017_verifyMacbookText()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.MacbookTextIsVisible(), "Apple MacBook Pro");
    }

    @Test
    public void T018_verifyMacbookLink()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.clickMacbook(), "nopCommerce demo store. Apple MacBook Pro");
    }

    @Test
    public void T019_verifyMacbookAddToCart()
    {
        homePage = new HomePageComponents(driver);
        homePage.clickMacbookAddToCart();
        WebElement email = driver.findElement(By.cssSelector(".email-a-friend-button"));
        Assert.assertTrue(email.isDisplayed());
    }

    @Test
    public void T020_verifyMacbookAddToCompare()
    {
        homePage = new HomePageComponents(driver);
        homePage.clickMacbookAddToCompareBtn();
        WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bar-notification")));
        Assert.assertTrue(popUp.getText().contains("product comparison"));
        wait.until(ExpectedConditions.invisibilityOf(popUp));
    }

    @Test
    public void T021_verifyMacbookAddToWishlist()
    {
        homePage = new HomePageComponents(driver);
        homePage.clickMacbookAddToWishList();
        WebElement email = driver.findElement(By.cssSelector(".email-a-friend-button"));
        Assert.assertTrue(email.isDisplayed());
    }

    @Test
    public void T022_verifyHTCPhoneText()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.HTCPhoneTextIsVisible(), "HTC smartphone");
    }

    @Test
    public void T023_verifyHTCPhoneLink()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.clickHTCPhone(), "nopCommerce demo store. HTC smartphone");
    }

    @Test
    public void T024_verifyHTCPhoneAddToCart()
    {
        homePage = new HomePageComponents(driver);
        int beforeCount = homePage.cartCount();
        homePage.clickHTCPhoneAddToCart();
        WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bar-notification")));
        Assert.assertTrue(popUp.getText().contains("shopping cart"));
        wait.until(ExpectedConditions.invisibilityOf(popUp));
        int afterCount = homePage.cartCount();
        Assert.assertEquals(afterCount, beforeCount+1, "count did not increase");

    }

    @Test
    public void T025_verifyHTCAddToCompare()
    {
        homePage = new HomePageComponents(driver);
        homePage.clickHTCPhoneAddToCompareBtn();
        WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bar-notification")));
        Assert.assertTrue(popUp.getText().contains("product comparison"));
        wait.until(ExpectedConditions.invisibilityOf(popUp));
    }

    @Test
    public void T026_verifyHTCAddToWishlist()
    {
        homePage = new HomePageComponents(driver);
        int beforeCount = homePage.wishlistCount();
        homePage.clickHTCPhoneAddToWishList();
        WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bar-notification")));
        Assert.assertTrue(popUp.getText().contains("wishlist"));
        wait.until(ExpectedConditions.invisibilityOf(popUp));
        int afterCount = homePage.wishlistCount();
        Assert.assertEquals(afterCount, beforeCount+1, "count did not increase");
    }

    @Test
    public void T027_verifyGiftCardText()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.giftCardTextIsVisible(), "$25 Virtual Gift Card");
    }

    @Test
    public void T028_verifyGiftCardLink()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.clickGiftCard(), "nopCommerce demo store. $25 Virtual Gift Card");
    }

    @Test
    public void T029_verifyGiftCardAddToCart()
    {
        homePage = new HomePageComponents(driver);
        homePage.clickGiftCardAddToCart();
        WebElement email = driver.findElement(By.cssSelector(".email-a-friend-button"));
        Assert.assertTrue(email.isDisplayed());
    }

    @Test
    public void T030_verifyGiftCardAddToCompare()
    {
        homePage = new HomePageComponents(driver);
        homePage.clickGiftCardAddToCompareBtn();
        WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bar-notification")));
        Assert.assertTrue(popUp.getText().contains("product comparison"));
        wait.until(ExpectedConditions.invisibilityOf(popUp));
    }

    @Test
    public void T031_verifyGiftCardAddToWishlist()
    {
        homePage = new HomePageComponents(driver);
        homePage.clickGiftCardAddToWishList();
        WebElement email = driver.findElement(By.cssSelector(".email-a-friend-button"));
        Assert.assertTrue(email.isDisplayed());
    }
}
