package com.nopcommerce.pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageComponents {
    WebDriver driver;

    By welcomeToOurStore = By.xpath("//h2[text()='Welcome to our store']");
    By welcomeToOurStoreDescription = By.cssSelector(".topic-block-body");
    By documentationLink = By.xpath("//a[text()='Documentation']");
    By forumsLink = By.xpath("//a[text()='Forums']");
    By nopCommWTOSLink = By.xpath("//a[text()='nopCommerce.com']");

    By electronicsTextWTOS = By.cssSelector("h2.title a[href='/electronics']");
    By electronicsImage = By.cssSelector("div.picture a[href='/electronics']");
    By apparelTextWTOS = By.cssSelector("h2.title a[href='/apparel']");
    By apparelImage = By.cssSelector("div.picture a[href='/apparel']");
    By digitalDownloadsTextWTOS = By.cssSelector("h2.title a[href='/digital-downloads']");
    By digitalDownloadsImage = By.cssSelector("div.picture a[href='/digital-downloads']");

    By BYOC = By.cssSelector("div[data-productid='1']");
    By Macbook = By.cssSelector("div[data-productid='4']");
    By HTCPhone = By.cssSelector("div[data-productid='18']");
    By giftCard = By.cssSelector("div[data-productid='45']");
    //headerText locator is similar for all the products
    By productText = By.cssSelector(".product-title");
    //addToCart locator is similar for all the products
    By addToCartBtn = By.cssSelector(".product-box-add-to-cart-button");
    //addToCompareList locator is similar for all the products
    By addToCompareBtn = By.cssSelector(".add-to-compare-list-button");
    //addToWishList locator is similar for all the products
    By addToWishlistBtn = By.cssSelector(".add-to-wishlist-button");
    By cartQty = By.cssSelector(".cart-qty");
    By wishlistQty = By.cssSelector(".wishlist-qty");

    By newsHeader = By.cssSelector(".news-list-homepage strong");
    By newsTitle1 = By.cssSelector(".news-title[href='/new-online-store-is-open']");
    By detailButton1 = By.cssSelector(".buttons a[href='/new-online-store-is-open']");
    By newsTitle2 = By.cssSelector(".news-title[href='/nopcommerce-new-release']");
    By detailButton2 = By.cssSelector(".buttons a[href='/nopcommerce-new-release']");
    By newsTitle3 = By.cssSelector(".news-title[href='/about-nopcommerce']");
    By detailButton3 = By.cssSelector(".buttons a[href='/about-nopcommerce']");
    By newsArchive = By.cssSelector(".view-all");

    By excellentRadioBtn = By.id("pollanswers-1");
    By goodRadioBtn = By.id("pollanswers-2");
    By poorRadioBtn = By.id("pollanswers-3");
    By veryBadRadioBtn = By.id("pollanswers-4");
    By voteBtn = By.id("vote-poll-1");



    public HomePageComponents(WebDriver driver)
    {
        this.driver = driver;
    }

    public String WTOSisDisplayed()
    {
        return driver.findElement(welcomeToOurStore).getText();
    }

    public boolean WTOSDescriptionIsDisplayed()
    {
        return driver.findElement(welcomeToOurStoreDescription).isDisplayed();
    }

    public @Nullable String clickDocumentation()
    {
        driver.findElement(documentationLink).click();
        return driver.getTitle();
    }

    public @Nullable String clickForum()
    {
        driver.findElement(forumsLink).click();
        return driver.getTitle();
    }

    public @Nullable String clickNopcommerce()
    {
        driver.findElement(nopCommWTOSLink).click();
        return driver.getTitle();
    }

    public String electronicsTextIsDisplayed()
    {
        return driver.findElement(electronicsTextWTOS).getText();
    }

    public @Nullable String clickElectronicsText()
    {
        driver.findElement(electronicsTextWTOS).click();
        return driver.getTitle();
    }

    public boolean electronicsImageIsDisplayed()
    {
        return driver.findElement(electronicsImage).isDisplayed();
    }

    public @Nullable String clickElectronicsImage()
    {
        driver.findElement(electronicsImage).click();
        return driver.getTitle();
    }

    public String apparelTextIsDisplayed()
    {
        return driver.findElement(apparelTextWTOS).getText();
    }

    public @Nullable String clickApparelText()
    {
        driver.findElement(apparelTextWTOS).click();
        return driver.getTitle();
    }

    public boolean apparelImageIsVisible()
    {
        return driver.findElement(apparelImage).isDisplayed();
    }

    public @Nullable String clickApparelImage()
    {
        driver.findElement(apparelImage).click();
        return driver.getTitle();
    }

    public String digitalDownloadsTextIsDisplayed()
    {
        return driver.findElement(digitalDownloadsTextWTOS).getText();
    }

    public @Nullable String clickDigitalDownloadsText()
    {
        driver.findElement(digitalDownloadsTextWTOS).click();
        return driver.getTitle();
    }

    public boolean digitalDownloadsImageIsVisible()
    {
        return driver.findElement(digitalDownloadsImage).isDisplayed();
    }

    public @Nullable String clickDigitalDownloadsImage()
    {
        driver.findElement(digitalDownloadsImage).click();
        return driver.getTitle();
    }

    public String BYOCTextIsVisible()
    {
        return driver.findElement(BYOC).findElement(productText).getText();
    }

    public @Nullable String clickBYOC()
    {
        driver.findElement(BYOC).findElement(productText).click();
        return driver.getTitle();
    }

    public void clickBYOCAddToCart()
    {
        driver.findElement(BYOC).findElement(addToCartBtn).click();
    }

    public void clickBYOCAddToCompareBtn()
    {
        driver.findElement(BYOC).findElement(addToCompareBtn).click();
    }

    public void clickBYOCAddToWishList()
    {
        driver.findElement(BYOC).findElement(addToWishlistBtn).click();
    }

    public String MacbookTextIsVisible()
    {
        return driver.findElement(Macbook).findElement(productText).getText();
    }

    public @Nullable String clickMacbook()
    {
        driver.findElement(Macbook).findElement(productText).click();
        return driver.getTitle();
    }

    public void clickMacbookAddToCart()
    {
        driver.findElement(Macbook).findElement(addToCartBtn).click();
    }

    public void clickMacbookAddToCompareBtn()
    {
        driver.findElement(Macbook).findElement(addToCompareBtn).click();
    }

    public void clickMacbookAddToWishList()
    {
        driver.findElement(Macbook).findElement(addToWishlistBtn).click();
    }

    public String HTCPhoneTextIsVisible()
    {
        return driver.findElement(HTCPhone).findElement(productText).getText();
    }

    public @Nullable String clickHTCPhone()
    {
        driver.findElement(HTCPhone).findElement(productText).click();
        return driver.getTitle();
    }

    public void clickHTCPhoneAddToCart()
    {
        driver.findElement(HTCPhone).findElement(addToCartBtn).click();
    }

    public int cartCount()
    {
        String cartText = driver.findElement(cartQty).getText();
        return Integer.parseInt(cartText.replace("(","").replace(")","").trim());
    }

    public void clickHTCPhoneAddToCompareBtn()
    {
        driver.findElement(HTCPhone).findElement(addToCompareBtn).click();
    }

    public void clickHTCPhoneAddToWishList()
    {
        driver.findElement(HTCPhone).findElement(addToWishlistBtn).click();
    }

    public int wishlistCount()
    {
        String wishlistText = driver.findElement(wishlistQty).getText();
        return Integer.parseInt(wishlistText.replace("(","").replace(")","").trim());
    }

    public String giftCardTextIsVisible()
    {
        return driver.findElement(giftCard).findElement(productText).getText();
    }

    public @Nullable String clickGiftCard()
    {
        driver.findElement(giftCard).findElement(productText).click();
        return driver.getTitle();
    }

    public void clickGiftCardAddToCart()
    {
        driver.findElement(giftCard).findElement(addToCartBtn).click();
    }

    public void clickGiftCardAddToCompareBtn()
    {
        driver.findElement(giftCard).findElement(addToCompareBtn).click();
    }

    public void clickGiftCardAddToWishList()
    {
        driver.findElement(giftCard).findElement(addToWishlistBtn).click();
    }

    public boolean newsHeaderIsVisible()
    {
        return driver.findElement(newsHeader).isDisplayed();
    }

    public boolean newOnlineStoreIsOpenTitle()
    {
        return driver.findElement(newsTitle1).isDisplayed();
    }

    public void goToNewOnlineStore()
    {
        driver.findElement(newsTitle1).click();
    }

    public void goToDetailsNewOnlineStore()
    {
        driver.findElement(detailButton1).click();
    }

    public boolean nopCommerceNewReleaseTitle()
    {
        return driver.findElement(newsTitle2).isDisplayed();
    }

    public void goToNopCommerceNewRelease()
    {
        driver.findElement(newsTitle2).click();
    }

    public void goToDetailsNopCommerceNewRelease()
    {
        driver.findElement(detailButton2).click();
    }

    public boolean aboutNopCommerceTitle()
    {
        return driver.findElement(newsTitle3).isDisplayed();
    }

    public void goToAboutNopCommerce()
    {
        driver.findElement(newsTitle3).click();
    }

    public void goToDetailsAboutNopCommerce()
    {
        driver.findElement(detailButton3).click();
    }

    public void goToNewsArchive()
    {
        driver.findElement(newsArchive).click();
    }

    public WebElement getExcellentRadio()
    {
        return driver.findElement(excellentRadioBtn);
    }

    public WebElement getGoodRadio()
    {
        return driver.findElement(goodRadioBtn);
    }

    public WebElement getPoorRadio()
    {
        return driver.findElement(poorRadioBtn);
    }

    public WebElement getVeryPoorRadio()
    {
        return driver.findElement(veryBadRadioBtn);
    }

    public void clickVote()
    {
        driver.findElement(voteBtn).click();
    }

}
