package com.screen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductDescriptionScreen {
    @AndroidFindBy(accessibility = "Add To Cart button")
    private WebElement addToCart;

    public void addToCartButtonIsDisplayed(){
        $(addToCart).should(visible);
    }
}
