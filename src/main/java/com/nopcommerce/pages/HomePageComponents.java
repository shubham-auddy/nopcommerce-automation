package com.nopcommerce.pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    By BYOCText = By.xpath("//a[text()='Build your own computer']/ancestor::div[contains(@class,'product-item')]");
    //addToCart locator is similar for all the products
    By addToCartBtn = By.xpath(".//button[text()='Add to cart']");
    //addToCompareList locator is similar for all the products
    By addToCompareBtn = By.xpath(".//button[text()='Add to compare list']");
    //addToWishList locator is similar for all the products
    By addToWishlistBtn = By.xpath(".//button[text()='Add to wishlist']");
    By MacbookText = By.xpath("//a[text()='Apple MacBook Pro']/ancestor::div[contains(@class,'product-item')]");
    By HTCPhone = By.xpath("//a[text()='HTC smartphone']/ancestor::div[contains(@class,'product-item')]");
    By giftCard = By.xpath("//a[contains(.,'Virtual Gift Card')]/ancestor::div[contains(@class,'product-item')]");
    By homeBtn = By.xpath("//span[text()='Home']");

    public HomePageComponents(WebDriver driver)
    {
        this.driver = driver;
    }

    public String WTOSisDisplayed()
    {
        return driver.findElement(welcomeToOurStore).getText();
    }

    public boolean WTOSDescriptionisDisplayed()
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






}
