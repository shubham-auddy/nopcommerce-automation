package com.nopcommerce.tests;

import com.nopcommerce.pages.HomePageComponents;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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
    public void T022_verifyBYOCText()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.BYOCTextIsVisible(), "Build your own computer");
    }

    @Test
    public void T023_verifyBYOCLink()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.clickBYOC(), "nopCommerce demo store. Build your own computer");
    }

    @Test
    public void T024_verifyBYOCAddToCart()
    {
        homePage = new HomePageComponents(driver);
        homePage.clickBYOCAddToCart();
        WebElement header = driver.findElement(By.cssSelector("h1"));
        Assert.assertEquals(header.getText(), "Build your own computer");
    }

    @Test
    public void T025_verifyBYOCAddToCompare()
    {
        homePage = new HomePageComponents(driver);
        homePage.clickBYOCAddToCompareBtn();
        WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bar-notification")));
        Assert.assertTrue(popUp.getText().contains("product comparison"));
        wait.until(ExpectedConditions.invisibilityOf(popUp));
    }

    @Test
    public void T026_verifyBYOCAddToWishlist()
    {
        homePage = new HomePageComponents(driver);
        homePage.clickBYOCAddToWishList();
        WebElement header = driver.findElement(By.cssSelector("h1"));
        Assert.assertEquals(header.getText(), "Build your own computer");
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
        WebElement header = driver.findElement(By.cssSelector("h1"));
        Assert.assertEquals(header.getText(), "Apple MacBook Pro");
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
        WebElement header = driver.findElement(By.cssSelector("h1"));
        Assert.assertEquals(header.getText(), "Apple MacBook Pro");
    }

    @Test
    public void T012_verifyHTCPhoneText()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.HTCPhoneTextIsVisible(), "HTC smartphone");
    }

    @Test
    public void T013_verifyHTCPhoneLink()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertEquals(homePage.clickHTCPhone(), "nopCommerce demo store. HTC smartphone");
    }

    @Test
    public void T014_verifyHTCPhoneAddToCart()
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
    public void T015_verifyHTCAddToCompare()
    {
        homePage = new HomePageComponents(driver);
        homePage.clickHTCPhoneAddToCompareBtn();
        WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bar-notification")));
        Assert.assertTrue(popUp.getText().contains("product comparison"));
        wait.until(ExpectedConditions.invisibilityOf(popUp));
    }

    @Test
    public void T016_verifyHTCAddToWishlist()
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
        WebElement header = driver.findElement(By.cssSelector("h1"));
        Assert.assertEquals(header.getText(), "$25 Virtual Gift Card");
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
        WebElement header = driver.findElement(By.cssSelector("h1"));
        Assert.assertEquals(header.getText(), "$25 Virtual Gift Card");
    }

    @Test
    public void T032_1_verifyNewsTitle() {
        homePage = new HomePageComponents(driver);
        Assert.assertTrue(homePage.newsHeaderIsVisible());
    }

    @Test
    public void T032_2_verifyNewsItem1Title()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertTrue(homePage.newOnlineStoreIsOpenTitle());
        homePage.goToNewOnlineStore();
        WebElement header = driver.findElement(By.cssSelector("h1"));
        Assert.assertEquals(header.getText(), "New online store is open!");
    }

    @Test
    public void T032_3_verifyNewsItem1DetailButton()
    {
        homePage = new HomePageComponents(driver);
        homePage.goToDetailsNewOnlineStore();
        WebElement header = driver.findElement(By.cssSelector("h1"));
        Assert.assertEquals(header.getText(), "New online store is open!");
    }

    @Test
    public void T032_4_verifyNewsItem2Title()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertTrue(homePage.nopCommerceNewReleaseTitle());
        homePage.goToNopCommerceNewRelease();
        WebElement header = driver.findElement(By.cssSelector("h1"));
        Assert.assertEquals(header.getText(), "nopCommerce new release!");
    }

    @Test
    public void T032_5_verifyNewsItem2Detail()
    {
        homePage = new HomePageComponents(driver);
        homePage.goToDetailsNopCommerceNewRelease();
        WebElement header = driver.findElement(By.cssSelector("h1"));
        Assert.assertEquals(header.getText(), "nopCommerce new release!");
    }

    @Test
    public void T032_6_verifyNewsItem3Title()
    {
        homePage = new HomePageComponents(driver);
        Assert.assertTrue(homePage.aboutNopCommerceTitle());
        homePage.goToAboutNopCommerce();
        WebElement header = driver.findElement(By.cssSelector("h1"));
        Assert.assertEquals(header.getText(), "About nopCommerce");
    }

    @Test
    public void T032_7_verifyNewsItem3Details()
    {
        homePage = new HomePageComponents(driver);
        homePage.goToDetailsAboutNopCommerce();
        WebElement header = driver.findElement(By.cssSelector("h1"));
        Assert.assertEquals(header.getText(), "About nopCommerce");
    }

    @Test
    public void T032_8_verifyNewsArchive()
    {
        homePage = new HomePageComponents(driver);
        homePage.goToNewsArchive();
        WebElement header = driver.findElement(By.cssSelector("h1"));
        Assert.assertEquals(header.getText(), "News");
    }

    @Test
    public void T033_validateRadioButtons()
    {
        homePage = new HomePageComponents(driver);

        //Default Selections
        Assert.assertFalse(homePage.getExcellentRadio().isSelected());
        Assert.assertFalse(homePage.getGoodRadio().isSelected());
        Assert.assertFalse(homePage.getPoorRadio().isSelected());
        Assert.assertFalse(homePage.getVeryPoorRadio().isSelected());

        //Mutual exclusivity
        homePage.getExcellentRadio().click();
        Assert.assertTrue(homePage.getExcellentRadio().isSelected());
        Assert.assertFalse(homePage.getGoodRadio().isSelected());
        Assert.assertFalse(homePage.getPoorRadio().isSelected());
        Assert.assertFalse(homePage.getVeryPoorRadio().isSelected());

        homePage.getGoodRadio().click();
        Assert.assertTrue(homePage.getGoodRadio().isSelected());
        Assert.assertFalse(homePage.getExcellentRadio().isSelected());
        Assert.assertFalse(homePage.getPoorRadio().isSelected());
        Assert.assertFalse(homePage.getVeryPoorRadio().isSelected());

        homePage.getPoorRadio().click();
        Assert.assertTrue(homePage.getPoorRadio().isSelected());
        Assert.assertFalse(homePage.getExcellentRadio().isSelected());
        Assert.assertFalse(homePage.getGoodRadio().isSelected());
        Assert.assertFalse(homePage.getVeryPoorRadio().isSelected());

        homePage.getVeryPoorRadio().click();
        Assert.assertTrue(homePage.getVeryPoorRadio().isSelected());
        Assert.assertFalse(homePage.getGoodRadio().isSelected());
        Assert.assertFalse(homePage.getPoorRadio().isSelected());
        Assert.assertFalse(homePage.getExcellentRadio().isSelected());
    }

    @Test
    public void T034_validateVoteErrorMessage()
    {
        homePage = new HomePageComponents(driver);
        homePage.getExcellentRadio().click();
        homePage.clickVote();
        WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("block-poll-vote-error-1")));
        Assert.assertTrue(errorMsg.getText().contains("Only registered users"));
        wait.until(ExpectedConditions.invisibilityOf(errorMsg));
    }

    @Test
    public void T035_validateAlertPopUp()
    {
        homePage = new HomePageComponents(driver);
        homePage.clickVote();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        Assert.assertEquals(alertText, "Please select an answer", "Alert text mismatch");
        alert.accept();
    }

    @Test
    public void T036_validateOnlyOneRadioSelected()
    {
        homePage = new HomePageComponents(driver);
        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));
        for(int i=0; i < radioButtons.size(); i++)
        {
            WebElement currentSelection = radioButtons.get(i);
            currentSelection.click();

            long selectedCount = radioButtons.stream().filter(WebElement::isSelected).count();

            Assert.assertEquals(selectedCount, 1);
            Assert.assertTrue(currentSelection.isSelected());
        }
    }


}
